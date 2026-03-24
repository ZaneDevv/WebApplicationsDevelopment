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

/*
    1. Crea un bloque que aumente el salario un 10% a todos los empleados del departamento 10. Al finalizar, debe mostrar
    por pantalla cuántos empleados fueron afectados usando el atributo SQL%ROWCOUNT.
*/

DECLARE
    CURSOR empleadoCursor
    IS SELECT *
    FROM Empleados
    WHERE departamento_id = 10;
    
    empleadoRow Empleados%ROWTYPE;

BEGIN
    OPEN empleadoCursor;
    
    LOOP
        FETCH empleadoCursor INTO empleadoRow;
        EXIT WHEN empleadoCursor%NOTFOUND;
        
        UPDATE Empleados
        SET salario = salario * 1.1
        WHERE id_empleado = empleadoRow.id_empleado;
    END LOOP;
    
    dbms_output.put_line('Empleados afectados: ' || empleadoCursor%ROWCOUNT);
    
    CLOSE empleadoCursor;
END;

/*
    2. Escribe un bloque que intente borrar a un empleado por su ID (usa una variable). Si el empleado no existe, debe
    mostrar un mensaje diciendo "No se encontró el empleado"; si existe, debe decir "Empleado eliminado". Usa SQL%NOTFOUND
*/

DECLARE
    CURSOR empleadosCursor(p_id Empleados.id_empleado%TYPE)
    IS SELECT *
    FROM Empleados
    WHERE id_empleado = p_id;
    
    idToRemove Empleados.id_empleado%TYPE := '&Set_an_ID';
    empleado Empleados%ROWTYPE;
    
BEGIN
    OPEN empleadosCursor(idToRemove);
    dbms_output.put_line(idToRemove);
    
    FETCH empleadosCursor INTO empleado;
    IF empleadosCursor%NOTFOUND THEN
        dbms_output.put_line('¡Empleado no encontrado!');
    ELSE
        DELETE FROM Empleados
        WHERE Empleados.id_empleado = idToRemove;
        
        dbms_output.put_line('Empleado eliminado.');
    END IF;
    
    CLOSE empleadosCursor;
END;

/*
    3. Declara un cursor explícito para obtener el nombre y el salario de todos los empleados. Usa un bucle LOOP
    simple, FETCH y EXIT WHEN %NOTFOUND para imprimir cada registro.
*/

DECLARE
    CURSOR empleadoCursor
    IS SELECT nombre, salario
    FROM Empleados;
    
    name Empleados.nombre%TYPE;
    salary Empleados.salario%TYPE;
    
BEGIN
    OPEN empleadoCursor;
    
    LOOP
        FETCH empleadoCursor INTO name, salary;
        EXIT WHEN empleadoCursor%NOTFOUND;
        
        dbms_output.put_line('Nombre: ' || name || ', salario: ' || salary ||'€');
    END LOOP;
    
    CLOSE empleadoCursor;
END;

/*
    4. Modifica el ejercicio anterior para que el cursor solo recorra los empleados que ganen más de 2000€. Además, el
    bucle debe detenerse si ya se han impreso 5 empleados (aunque haya más), usando %ROWCOUNT.
*/

DECLARE
    CURSOR empleadoCursor
    IS SELECT nombre, salario
    FROM Empleados
    WHERE salario > 2000;
    
    name Empleados.nombre%TYPE;
    salary Empleados.salario%TYPE;
    
BEGIN
    OPEN empleadoCursor;
    
    LOOP
        FETCH empleadoCursor INTO name, salary;
        EXIT WHEN empleadoCursor%NOTFOUND OR empleadoCursor%ROWCOUNT > 5;
        
        dbms_output.put_line('Nombre: ' || name || ', salario: ' || salary || '€');
    END LOOP;
    
    CLOSE empleadoCursor;
END;

/*
    5. Crea un cursor que seleccione los nombres de los departamentos. Utiliza un bucle FOR registro IN nombre_cursor para
    recorrerlo. Observa cómo no necesitas hacer OPEN, FETCH ni CLOSE
*/

DECLARE
    CURSOR empleadoCursor
    IS SELECT departamento_id
    FROM Empleados;
        
BEGIN
    FOR department IN empleadoCursor LOOP
        dbms_output.put_line(department);
    END LOOP;
END;


/*
    6. Diseña un cursor que reciba como parámetro el ID de un departamento. El bloque debe pedir al usuario un ID y mostrar
    los empleados de ese departamento específico usando el cursor parametrizado.
*/

DECLARE
    CURSOR empleadoCursor(p_departmentId Empleados.departamento_id%TYPE)
    IS SELECT *
    FROM Empleados
    WHERE Empleados.departamento_id = p_departmentId;

    departmentId Empleados.departamento_id%TYPE := '&id';
    empleadoRow Empleados%ROWTYPE;
    
BEGIN
    OPEN empleadoCursor(departmentId);
    
    LOOP
        FETCH empleadoCursor INTO empleadoRow;
        EXIT WHEN empleadoCursor%NOTFOUND;
        
        dbms_output.put_line('ID: ' || empleadoRow.id_empleado || ', Nombre: ' || empleadoRow.nombre || ', Salario: ' || empleadoRow.salario);
    END LOOP;
    
    CLOSE empleadoCursor;
END;

/*
    6.1. Reescribe este cursor pero sin escribir el OPEN, CLOSE o FETCH
*/

DECLARE
    CURSOR empleadoCursor(p_departmentId Empleados.departamento_id%TYPE)
    IS SELECT *
    FROM Empleados
    WHERE Empleados.departamento_id = p_departmentId;

    departmentId Empleados.departamento_id%TYPE := '&id';
    
BEGIN    
    FOR empleadoRow IN empleadoCursor(departmentId) LOOP
        dbms_output.put_line('ID: ' || empleadoRow.id_empleado || ', Nombre: ' || empleadoRow.nombre || ', Salario: ' || empleadoRow.salario);
    END LOOP;
END;

/*
    7. Crea un cursor que recorra a los empleados. Si el empleado lleva más de 10 años en la empresa, calcula un bono
    del 15%; si lleva menos, un 5%. Muestra el nombre y su bono correspondiente.
*/

DECLARE
    CURSOR empleadosCursor IS SELECT * FROM Empleados;
    
    empleadosRow Empleados%ROWTYPE;
    
BEGIN
    OPEN empleadosCursor;
    
    LOOP
        FETCH empleadosCursor INTO empleadosRow;
        EXIT WHEN empleadosCursor%NOTFOUND;
        
        IF empleadosRow.tiempo_empresa >= 10 THEN
            empleadosRow.tiempo_empresa := empleadosRow.tiempo_empresa * 1.15;
        ELSE
            empleadosRow.tiempo_empresa := empleadosRow.tiempo_empresa * 1.05;
        END IF;
        
        UPDATE Empleados
        SET salario = empleadosRow.salario
        WHERE id_empleado = empleadosRow.id_empleado;
        
    END LOOP;
    
    CLOSE empleadosCursor;
END;

/*
    8. Declara un cursor que seleccione a los empleados del departamento de 'VENTAS'. Ábrelo con la cláusula FOR UPDATE. Dentro
    del bucle, si el salario es menor a 1500€, actualiza su salario sumándole 200€ usando la cláusula WHERE CURRENT OF.
*/

/*
    9. Define un cursor que una las tablas EMPLEADOS y DEPARTAMENTOS. Declara una variable de tipo %ROWTYPE basada en ese
    cursor. Recorre el cursor y muestra: "El empleado [Nombre] trabaja en el departamento [Nombre_Dep]"
*/