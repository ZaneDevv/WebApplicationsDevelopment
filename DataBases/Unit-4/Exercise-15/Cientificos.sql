-- 2026/01/08
-- Álvaro Fernández Barrero
-- Computer firm

-- --------------------------------
-- CREATING DATABASE
-- --------------------------------

DROP DATABASE IS EXISTS Facultad;
CREATE DATABASE IF NOT EXISTS Facultad;
USE Facultad;

-- --------------------------------
-- CREATING TABLES
-- --------------------------------

DROP TABLE IF EXISTS Cientifico;
CREATE TABLE IF NOT EXISTS Cientifico(
	dni INT UNSIGNED AUTO_INCREMENT,
	nombre VARCHAR(20) NOT NULL,
	apellido VARCHAR(20) NOT NULL,
	fecha_nacimiento DATE NOT NULL,

	PRIMARY KEY(dni)
);


DROP TABLE IF EXISTS Proyecto;
CREATE TABLE IF NOT EXISTS Proyecto(
	codigo CHAR(1) NOT NULL,
	nombre VARCHAR(20) NOT NULL,
	horas INT UNSIGNED,

	PRIMARY KEY(codigo)
);


DROP TABLE IF EXISTS Asignado;
CREATE TABLE IF NOT EXISTS Asignado(
	dni INT UNSIGNED AUTO_INCREMENT,
	codigo CHAR(1),

	PRIMARY KEY(dni, codigo),
	FOREIGN KEY(dni) REFERENCES Cientifico(dni),
	FOREIGN KEY(codigo) REFERENCES Proyecto(codigo)
);

-- --------------------------------
-- CHECKING TABLES
-- --------------------------------

SHOW tables;

DESCRIBE Cientifico;
DESCRIBE Proyecto;
DESCRIBE Asignado;

-- --------------------------------
-- INSERTING VALUES
-- --------------------------------

INSERT INTO Cientifico(nombre, apellido, fecha_nacimiento) VALUES ('María', 'Guzmán', '1974-02-12'),
																  ('María', 'Jiménez', '1954-02-11'),
																  ('Rafael', 'Girado', '1964-01-22'),
																  ('Alonso', 'Gómez', '1990-12-12'),
																  ('Clara', 'Atúnez', '1973-11-12');

INSERT INTO Proyecto VALUES ('A', 'Bioquímica', 410),
							('B', 'Electrónica', 1200),
							('C', 'Geológica', 300),
							('D', 'Tectónica', 500),
							('E', 'Histograma', 70);

INSERT INTO Asignado VALUES (1, 'A'), (1, 'B'), (1, 'C'),
							(2, 'A'), (2, 'B'),
							(3, 'A'),
							(4, 'A'), (4, 'B'), (4, 'C'), (4, 'E'), (4, 'D');

-- --------------------------------
-- CHECKING DATA
-- --------------------------------

SELECT * FROM Cientifico;
SELECT * FROM Proyecto;
SELECT * FROM Asignado;

-- --------------------------------
-- EXERCISES
-- --------------------------------

-- 1.- Relación completa de los científicos asignados a cada proyecto. Mostrar DNI, Nombre del científico, Identificador del proyecto y nombre del proyecto.

SELECT Cientifico.dni, Cientifico.nombre, Proyecto.codigo, Proyecto.nombre
FROM Asignado, Cientifico, Proyecto
WHERE Asignado.codigo = Proyecto.codigo AND Asignado.dni = Cientifico.dni;

-- 2.- Obtener el número de proyectos al que está asignado cada científico (mostrar el DNI y el nombre).

SELECT Cientifico.dni, Cientifico.nombre, COUNT(*) cantidad_proyectos
FROM Asignado
INNER JOIN Cientifico
ON Cientifico.dni = Asignado.dni
GROUP BY Cientifico.dni;

-- 3.- Obtener el número de científicos asignados a cada proyecto (mostrar el identificador del proyecto y el nombre del proyecto).

SELECT Proyecto.codigo, Proyecto.nombre
FROM Asignado
INNER JOIN Proyecto
ON Proyecto.codigo = Asignado.codigo;

-- 4.- TODO: Obtener el número de dedicación de cada científico.

-- 5.- TODO: Obtener el DNI y el nombre de los científicos que se dedican a más de un proyecto y cuya dedicación media a cada proyecto sea superior a las 80 horas.

-- 6.- TODO: Nombre del científico que trabaja en todos los proyectos.

-- 7.- Nombre del científico que no trabaja en ningún proyecto.

SELECT Cientifico.nombre
FROM Cientifico
WHERE Cientifico NOT IN (
	SELECT DISTINCT Cientifico.dni
	FROM Cientifico
	INNER JOIN Asignado
	ON Asignado.dni = Cientifico.dni
);