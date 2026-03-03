-- -------------------------
-- CREATING TABLES
-- -------------------------

CREATE TABLE Alumnos(
    nombre VARCHAR2(50),
    appelido1 VARCHAR(50),
    appelido2 VARCHAR(50),
    codigoAlumno INT,
    direccion VARCHAR2(50),
    sexo VARCHAR2(1),
    fechaNacimiento DATE,
    curso INT
);


CREATE TABLE Profesores(
    nombre VARCHAR2(50),
    appelido1 VARCHAR(50),
    appelido2 VARCHAR(50),
    dni INT,
    direccion VARCHAR2(50),
    titulo VARCHAR2(50),
    gana INT
);


CREATE TABLE Cursos(
    nombreCurso VARCHAR2(50),
    codigoCurso INT,
    codigoProfesor INT,
    maxAlu INT,
    fechaInicio DATE,
    fechaFin DATE,
    numHoras INT
);

-- -------------------------
-- CHECKING TABLES
-- -------------------------

DESCRIBE Alumnos;
DESCRIBE Profesores;
DESCRIBE Cursos;

-- -------------------------
-- INSERTING VALUES
-- -------------------------

INSERT INTO Alumnos VALUES('Lucas', 'Manilva', 'López', 1, 'Alamar 3', 'V', TO_DATE('01-11-1979', 'DD-MM-YYYY'), 1);
INSERT INTO Alumnos VALUES('Antonia', 'López', 'Alcantara', 2, 'Maniquí 2', 'M', NULL, 2);
INSERT INTO Alumnos VALUES('Manuel', 'Alcantara', 'Pedrós', 3, 'Julian 2', NULL, NULL, 2);
INSERT INTO Alumnos VALUES('José', 'Pérez', 'Caballar', 4, 'Jarcha 5', 'V', TO_DATE('03-02-1977', 'DD-MM-YYYY'), 1);

INSERT INTO Profesores VALUES('Juan', 'Arch', 'López', 32432455, 'Puerta Negra, 4', 'Ing. Informática', 7500);
INSERT INTO Profesores VALUES('María', 'Oliva', 'Rubio', 43215643, 'Juan Alfonso 32', 'Lda. Fil. Inglesa', 5400);

INSERT INTO Cursos VALUES('Inglés básico', 1, 43215643, 15, TO_DATE('01-11-2000', 'DD-MM-YYYY'), TO_DATE('22-12-2000', 'DD-MM-YYYY'), 120);
INSERT INTO Cursos VALUES('Administración Linux', 2, 32432455, NULL, TO_DATE('01-09-2000', 'DD-MM-YYYY'), NULL, 80);

-- -------------------------
-- CHECKING VALUES
-- -------------------------

SELECT * FROM Alumnos;
SELECT * FROM Profesores;
SELECT * FROM Cursos;

-- -------------------------
-- EXERCISES
-- -------------------------

-- 1.

ALTER TABLE Profesores ADD edad INT;

-- 4.

ALTER TABLE Profesores ADD CONSTRAINT chk_age CHECK (Profesores(edad) BETWEEN 18 AND 65);
ALTER TABLE Cursos ADD CONSTRAINT chk_students_amount CHECK (Cursos(maxAlu) >= 10);
ALTER TABLE Cursos ADD CONSTRAINT chk_hours_amount CHECK (Cursos(numHoras) > 100);

-- 5.

ALTER TABLE Alumnos DROP CONSTRAINT chk_genre;

-- 10.

ALTER TABLE Profesores ADD PRIMARY KEY(nombre, apellido1, apellido2);

-- 11.

INSERT INTO Profesores VALUES('Juan', 'Arco', 'López', 32432455, 'Puerta Negra, 4', 'Ing. Informática', NULL);
INSERT INTO Alumnos VALUES('María', 'Jaén', 'Sevilla', 5, 'Martos 5', 'M', TO_DATE('10-03-1977', 'DD-MM-YYYY'), 3);

-- 14.

DELETE FROM Profesores
WHERE UPPER(nombre) = 'LAURA' AND UPPER(apellido1) = 'LÓPEZ';

-- 15.

CREATE TABLE NombreDeAlumnos(
    nombreCompleto VARCHAR2(50)
);