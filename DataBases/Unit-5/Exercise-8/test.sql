-- -----------------------------------------
-- CREATE TABLES
-- -----------------------------------------

CREATE TABLE Libro(
    IdLibro INT,
    Titulo VARCHAR2(50),
    Editorial VARCHAR2(50),
    Area VARCHAR2(50)
);

CREATE TABLE Autor(
    IdAutor INT,
    Nombre VARCHAR2(50),
    Nacionalidad VARCHAR2(50)
);

CREATE TABLE Estudiante(
    IdLector INT,
    CI INT,
    Nombre VARCHAR2(50),
    Direccion VARCHAR2(50),
    Carrera VARCHAR2(50),
    Edad INT,
    Apellidos VARCHAR2(50)
);

CREATE TABLE LibAut(
    IdAutor INT,
    IdLibro INT
);

CREATE TABLE Prestamo(
    IdLector INT,
    IdLibro INT,
    FechaPrestamo DATE,
    FechaDevolucion DATE,
    Devuelto VARCHAR2(15)
);

-- -----------------------------------------
-- ADDING KEYS
-- -----------------------------------------

ALTER TABLE Libro
ADD PRIMARY KEY(IdLibro);

ALTER TABLE Autor
ADD PRIMARY KEY(IdAutor);

ALTER TABLE Estudiante
ADD PRIMARY KEY(IdLector);

ALTER TABLE LibAut
ADD PRIMARY KEY(IdAutor, IdLibro);

ALTER TABLE LibAut
ADD FOREIGN KEY(IdAutor) REFERENCES Autor(IdAutor);

ALTER TABLE LibAut
ADD FOREIGN KEY(IdLibro) REFERENCES Libro(IdLibro);

ALTER TABLE Prestamo
ADD PRIMARY KEY(IdLector, IdLibro, FechaPrestamo);

ALTER TABLE Prestamo
ADD FOREIGN KEY(IdLector) REFERENCES Estudiante(IdLector);

ALTER TABLE Prestamo
ADD FOREIGN KEY(IdLibro) REFERENCES Libro(IdLibro);

-- -----------------------------------------
-- CHECKING TABLES
-- -----------------------------------------

DESCRIBE Libro;
DESCRIBE Autor;
DESCRIBE Estudiante;
DESCRIBE Prestamo;
DESCRIBE Estudiante;

-- -----------------------------------------
-- INSERTING VALUES
-- -----------------------------------------

INSERT INTO Libro VALUES(1, 'Visual Studio Net', 'AlfayOmega', 'Programacion');
INSERT INTO Libro VALUES(2, 'MySQL', 'Alfaguara', 'Base de datos');
INSERT INTO Libro VALUES(3, 'Aprende CSS fácilmente!', 'Santillana', 'Lenguaje de marcas');

INSERT INTO Autor VALUES(1, 'Alejandro Santiago', 'España');
INSERT INTO Autor VALUES(2, 'Tony White', 'USA');
INSERT INTO Autor VALUES(3, 'Mario Benedetti', 'Francia');

INSERT INTO Estudiante VALUES(1, 100, 'Francisco', 'Calle andalucía', 'Informática', 20, 'Lomas');
INSERT INTO Estudiante VALUES(2, 130, 'Julián', 'Calle Nicaragua', 'Telecomunicaciones', 18, 'Fernandez');
INSERT INTO Estudiante VALUES(3, 95, 'Pepe', 'Calle Juan Carlos', 'Magisterio', 35, 'Cano');
INSERT INTO Estudiante VALUES(4, 150, 'Laura', 'Calle Joaquín Durán', 'Bioquímica', 35, 'García');
INSERT INTO Estudiante VALUES(5, 134, 'Raul', 'Calle Mesones', 'Arquitectura técnica', 35, 'Valdez Alenes');

INSERT INTO LibAut VALUES(1, 3);
INSERT INTO LibAut VALUES(2, 1);
INSERT INTO LibAut VALUES(3, 2);

INSERT INTO Prestamo VALUES(2, 1, TO_DATE('2012/10/15', 'YYYY-MM-DD'), TO_DATE('2012/11/15', 'YYYY-MM-DD'), 'Devuelto');
INSERT INTO Prestamo VALUES(1, 2, TO_DATE('2010-02-06', 'YYYY-MM-DD'), TO_DATE('2010-02-16', 'YYYY-MM-DD'), 'Pendiento');
INSERT INTO Prestamo VALUES(3, 3, TO_DATE('2007-02-10', 'YYYY-MM-DD'), TO_DATE('2007-04-10', 'YYYY-MM-DD'), 'Devuelto');

-- -----------------------------------------
-- CHECKING VALUES
-- -----------------------------------------

SELECT * FROM Libro;
SELECT * FROM Autor;
SELECT * FROM Estudiante;
SELECT * FROM Prestamo;
SELECT * FROM Estudiante;

-- -----------------------------------------
-- EXERCISES
-- -----------------------------------------

-- 1. Authors who are from either USA or France

SELECT *
FROM Autor
WHERE Nacionalidad IN ('USA', 'Francia');

-- 2. Avarage age of the students

SELECT ROUND(AVG(Edad), 2) AS EdadMedia
FROM Estudiante;