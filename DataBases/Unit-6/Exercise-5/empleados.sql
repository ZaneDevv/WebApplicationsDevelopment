CREATE TABLE Empleados(
    id_empleado NUMBER,
    nombre VARCHAR2(50),
    salario NUMBER,
    departamento_id NUMBER
);



INSERT INTO Empleados (id_empleado, nombre, salario, departamento_id) VALUES (1, 'Juan Pérez', 3000, 10);
INSERT INTO Empleados (id_empleado, nombre, salario, departamento_id) VALUES (2, 'Ana Gómez', 3500, 10);
INSERT INTO Empleados (id_empleado, nombre, salario, departamento_id) VALUES (3, 'Carlos Ruiz', 4000, 50);
INSERT INTO Empleados (id_empleado, nombre, salario, departamento_id) VALUES (4, 'Laura Díaz', 3200, 50);
INSERT INTO Empleados (id_empleado, nombre, salario, departamento_id) VALUES (5, 'Miguel Torres', 3800, 51);
INSERT INTO Empleados (id_empleado, nombre, salario, departamento_id) VALUES (6, 'Sofía López', 3100, 101);
INSERT INTO Empleados (id_empleado, nombre, salario, departamento_id) VALUES (7, 'Pedro Martínez', 4200, 103);
INSERT INTO Empleados (id_empleado, nombre, salario, departamento_id) VALUES (8, 'Elena Sánchez', 3700, 102);
INSERT INTO Empleados (id_empleado, nombre, salario, departamento_id) VALUES (9, 'Jorge Fernández', 3900, 50);
INSERT INTO Empleados (id_empleado, nombre, salario, departamento_id) VALUES (10, 'María Jiménez', 4100, 103);


-- 1.
DECLARE
    CURSOR empleadoCursor
    IS SELECT *
    INTO empleadoRow
    WHERE departamento_id = 10;
    
    empleadoRow Empleados%rowtype;

BEGIN
    OPEN empleadoCursor;
    
    LOOP
        FETCH empleadoCursor INTO empleadoRow;
        EXIT WHEN empleadoCursor%NOTFOUND;
        
        UPDATE Empleados
        SET salario = empleadoCursor.salario * 1.05
        WHERE id_empleado = empleadoRow.id_empleado;
    END LOOP;
    
    CLOSE empleadoCursor;
END;


-- 2.
DECLARE
    CURSOR empleadoCursor
    IS SELECT *
    FROM Empleados
    WHERE departamento_id = 50;

BEGIN
    OPEN empleadoCursor;
    
    IF empleadoCursor%ROWCOUNT = 0 THEN
        RAISE NO_DATA_FOUND;
    ELSE
        DELETE FROM Empleados
        WHERE departamento_id = 50;
        
        dbms_output.put_line("Removed!");
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN dbms_output.put_line("No data!");
END;


-- 3.
DECLARE
    CURSOR empleadosCursor
    IS SELECT *
    FROM Empleados;
    
    empleadosRow Empleados%rowtype;
    
BEGIN
    OPEN empleadosCursor;
    
    LOOP
        FETCH empleadosCursor INTO empleadosRow;
        EXIT WHEN empleadosCursor%NOTFOUND;
        
        dbms_output.put_line('Nombre: ' || empleadosRow.nombre || ', salario: ' || empleadosRow.salario);
    END LOOP;
    
    CLOSE empleadosCursor;
END;


-- 4.
DECLARE
    CURSOR empleadosCursor
    IS SELECT *
    FROM Empleados
    WHERE departamento_id = 20;
    
    empleadosRow Empleados%rowtype;
    
BEGIN
    OPEN empleadosCursor;
    
    LOOP
        FETCH empleadosCursor INTO empleadosRow;
        EXIT WHEN empleadosCursor%NOTFOUND;
        
        dbms_output.put_line('Empleado: ' || empleadosRow.nombre);
    END LOOP;
    
    CLOSE empleadosCursor;
END;


-- 5.
DECLARE
    CURSOR empleadosCursor
    IS SELECT *
    FROM Empleados;
    
        
BEGIN
    OPEN empleadosCursor;
    
    dbms_output.put_line('#Empleados: ' || empleadosCursor%ROWCOUNT);
    
    CLOSE empleadosCursor;
END;


-- 6.

DECLARE
    CURSOR empleadosCursor
    IS SELECT *
    FROM Empleados;
    
    empleadosRow Empleados%rowtype;
    sumSalaries INT := 0;
        
BEGIN
    OPEN empleadosCursor;
    
    LOOP
        FETCH empleadosCursor INTO empleadosRow;
        EXIT WHEN empleadosCursor%NOTFOUND;
        
        sumSalaries := sumSalaries + empleadosRow.salario;
    END LOOP;
    
    dbms_output.put_line('Sum salaries: ' || sumSalaries || '$');
    
    CLOSE empleadosCursor;
END;


-- 7.
DECLARE
    CURSOR p_departamento(p_departament Empleados.departamento_id%type)
    IS SELECT *
    FROM Empleados
    WHERE departamento_id = p_departament ;

    department Empleados.departamento_id%type := '&Department';
    empleadoRow Empleados%rowtype;
    
BEGIN
    OPEN p_departamento(department);
    
    LOOP
        FETCH p_departamento INTO empleadoRow;
        EXIT WHEN p_departamento%NOTFOUND;
        
        dbms_output.put_line(empleadoRow.nombre);
    END LOOP;
    
    CLOSE p_departamento;
END;
