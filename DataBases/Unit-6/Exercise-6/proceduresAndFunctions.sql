-- Tables

CREATE TABLE Empleados(
    id_empleado NUMBER,
    nombre VARCHAR2(50),
    salario NUMBER,
    departamento_id NUMBER,
    tiempo_empresa NUMBER
);

INSERT INTO Empleados VALUES (1, 'Juan Pérez', 3000, 10, 2);
INSERT INTO Empleados VALUES (2, 'Ana Gómez', 3500, 10, 4);
INSERT INTO Empleados VALUES (3, 'Carlos Ruiz', 4000, 50, 6);
INSERT INTO Empleados VALUES (4, 'Laura Díaz', 3200, 50, 3);
INSERT INTO Empleados VALUES (5, 'Miguel Torres', 3800, 51, 5);
INSERT INTO Empleados VALUES (6, 'Sofía López', 3100, 101, 1);
INSERT INTO Empleados VALUES (7, 'Pedro Martínez', 4200, 103, 7);
INSERT INTO Empleados VALUES (8, 'Elena Sánchez', 3700, 102, 4);
INSERT INTO Empleados VALUES (9, 'Jorge Fernández', 3900, 50, 6);
INSERT INTO Empleados VALUES (10, 'María Jiménez', 4100, 103, 8);
INSERT INTO Empleados VALUES (11, 'Luis Navarro', 3300, 10, 2);
INSERT INTO Empleados VALUES (12, 'Carmen Ortega', 3600, 102, 3);
INSERT INTO Empleados VALUES (13, 'Raúl Castro', 3900, 101, 5);
INSERT INTO Empleados VALUES (14, 'Lucía Romero', 3400, 51, 2);
INSERT INTO Empleados VALUES (15, 'Alberto Gil', 4500, 103, 9);
INSERT INTO Empleados VALUES (16, 'Patricia Vega', 3700, 50, 4);
INSERT INTO Empleados VALUES (17, 'Diego Herrera', 3100, 10, 1);
INSERT INTO Empleados VALUES (18, 'Marta León', 4200, 102, 6);
INSERT INTO Empleados VALUES (19, 'Fernando Cruz', 4000, 101, 7);
INSERT INTO Empleados VALUES (20, 'Sara Molina', 3500, 51, 3);


-- Procedures

CREATE OR REPLACE PROCEDURE sp_show_employees(v_numdep Empleados.departamento_id%TYPE) IS
    CURSOR empleadoCursor(department Empleados.departamento_id%TYPE) IS
        SELECT nombre, salario
        FROM Empleados
        WHERE departamento_id = department;

    name Empleados.nombre%TYPE;
    salary Empleados.salario%TYPE;
    
    BEGIN
    OPEN empleadoCursor(v_numdep);
        
    LOOP
        FETCH empleadoCursor INTO name, salary;
        EXIT WHEN empleadoCursor%NOTFOUND;
            
        dbms_output.put_line('El empleado ' || name || ' tiene un sueldo de ' || salary || '€.');
    END LOOP;
        
    CLOSE empleadoCursor;
END sp_show_employees;


-- Functions

CREATE OR REPLACE FUNCTION computeAmountOfEmployees(v_numdep Empleados.departamento_id%TYPE) RETURN INT IS
    CURSOR empleadoCursor(department Empleados.departamento_id%TYPE) IS
        SELECT nombre, salario
        FROM Empleados
        WHERE departamento_id = department;

    name Empleados.nombre%TYPE;
    salary Empleados.salario%TYPE;
    
    i INT := 0;
    
    BEGIN
    OPEN empleadoCursor(v_numdep);
        
    LOOP
        FETCH empleadoCursor INTO name, salary;
        EXIT WHEN empleadoCursor%NOTFOUND;
        
        i := i + 1;
        dbms_output.put_line('El empleado ' || name || ' tiene un sueldo de ' || salary || '€.');
    END LOOP;
        
    CLOSE empleadoCursor;
    
    RETURN i;
END computeAmountOfEmployees;



CREATE OR REPLACE FUNCTION getDepartmentSalary(idDepartment Empleados.departamento_id%TYPE) RETURN INT IS
    sum INT := 0;
    
    BEGIN
    
    SELECT SUM(salario)
    INTO sum
    FROM Empleados
    WHERE departamento_id = idDepartment;
    
    RETURN sum;
END getDepartmentSalary;



-- Testing

BEGIN
    dbms_output.put_line('Procedure:');
    sp_show_employees(10);
    dbms_output.put_line('----------------');
    dbms_output.put_line('Function:');
    dbms_output.put_line('#Employees: ' || computeAmountOfEmployees(10));
END;