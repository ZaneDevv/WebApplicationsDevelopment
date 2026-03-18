-- Tabla para almacenar las personas de la BD
CREATE TABLE personas (
    dni VARCHAR2(9) PRIMARY KEY,
    nombre VARCHAR2(15),
    apellidos VARCHAR2(15),
    edad NUMBER
);

-- Inserción de datos
INSERT INTO personas(dni,nombre,apellidos,edad) VALUES ('11','Juan','Álvarez',18);
INSERT INTO personas(dni,nombre,apellidos,edad) VALUES ('22','José','Jiménez',22);
INSERT INTO personas(dni,nombre,apellidos,edad) VALUES ('33','María','Pérez',35);
INSERT INTO personas(dni,nombre,apellidos,edad) VALUES ('44','Elena','Martínez',20);

/* 1.- Construya un bloque PL/SQL que pida al usuario su nombre por teclado y que
posteriormente lo visualice de la siguiente forma "El nombre introducido es: NOMBRE". */

DECLARE
    name personas.nombre%type := '&Set_a_name';
BEGIN
    dbms_output.put_line('El nombre introducido es: ' || name);
END;

/* 2.- Construya un bloque PL/SQL que pida por teclado el dni de la persona y que
posteriormente se muestre el nombre y la edad de la persona correspondiente. Controla las
posibles excepciones */

DECLARE
    id personas.dni%type := '&Set_a_dni';
    name personas.nombre%type;
    age personas.edad%type;

BEGIN
    SELECT nombre, edad
    INTO name, age
    FROM personas
    WHERE dni = id;
    
    dbms_output.put_line('Nombre: ' || name || ', edad: ' || age);

END;

/* 3.- Construya un bloque PL/SQL con la misma funcionalidad pero utilizando un
registro(%rowtype) para almacenar el nombre y la edad de la persona elegida. Controla las
posibles excepciones */

DECLARE
    CURSOR c_personas(id personas.dni%type)
    IS SELECT *
    FROM personas
    WHERE dni = id;
    
    id personas.dni%type := '&Set_a_dni';
    personasRow personas%rowtype;

BEGIN
    OPEN c_personas(id);
    
    FETCH c_personas INTO personasRow;
    IF c_personas%FOUND THEN
        dbms_output.put_line('Nombre: ' || personasRow.nombre || ', edad: ' || personasRow.edad);
    END IF;
    
    CLOSE c_personas;
END;

-- Tabla para almacenar todos los alumnos de la BD
CREATE TABLE Alumnos (
    numMatricula NUMBER PRIMARY KEY,
    nombre VARCHAR2(15),
    apellidos VARCHAR(30),
    titulacion VARCHAR(15),
    precioMatricula NUMBER
);

-- Insertar valores
INSERT INTO Alumnos VALUES (1,'Juan','Álvarez','Administrativo',1000);
INSERT INTO Alumnos VALUES (2,'José','Jiménez','Informática',1200);
INSERT INTO Alumnos VALUES (3,'María','Pérez','Administrativo',1000);
INSERT INTO Alumnos VALUES (4,'Elena','Martínez','Informática',1200);
INSERT INTO Alumnos VALUES (5,'ASDF','FDSA','Informática',1200);

-- Tabla para los alumnos de informática
CREATE TABLE AlumnosInf (
    IDMatricula NUMBER PRIMARY KEY,
    nombre_apellidos VARCHAR(50),
    precio NUMBER
);

/* 4.- Construya un cursor que inserte sólo los alumnos de informática en la tabla AlumnosInf,
teniendo en cuenta la estructura de esta tabla, así por ejemplo, debe tener en cuenta que el
atributo nombre_apellidos resulta de la concatenación de los atributos nombre y apellidos.
Antes de la inserción de cada tupla en la tabla AlumnosInf debe mostrar por pantalla el
nombre y el apellido que va a insertar. Controla las posibles excepciones y utilizar %rowtype
*/

DECLARE
    CURSOR studentsCursor
    IS SELECT *
    FROM Alumnos
    WHERE titulacion = 'Informática';
    
    studentsRow Alumnos%rowtype;
    
    matricula AlumnosInf.IDMatricula%type := 0;

BEGIN
    OPEN studentsCursor;
    
    SELECT MAX(IDMatricula)
    INTO matricula
    FROM AlumnosInf;
    
    
    LOOP
        FETCH studentsCursor INTO studentsRow;
        EXIT WHEN studentsCursor%NOTFOUND;
        
        matricula := matricula + 1;
        INSERT INTO AlumnosInf VALUES (matricula, studentsRow.nombre, studentsRow.apellidos, 1200);
    END LOOP;
    
    CLOSE studentsCursor;
END;