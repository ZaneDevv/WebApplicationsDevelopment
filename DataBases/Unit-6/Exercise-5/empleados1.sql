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
    IS SELECT DISTINCT departamento_id
    FROM Empleados;
    
    department Empleados.departamento_id%TYPE;
    
BEGIN
    FOR register IN empleadoCursor LOOP
        dbms_output.put_line(register);
    END LOOP;
END;