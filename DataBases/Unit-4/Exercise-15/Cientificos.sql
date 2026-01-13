-- 2026/01/08
-- Álvaro Fernández Barrero
-- Facultad

SET AUTOCOMMIT = FALSE;

-- --------------------------------
-- CREATING DATABASE
-- --------------------------------

DROP DATABASE IF EXISTS Facultad;
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

COMMIT;

-- --------------------------------
-- EXERCISES
-- --------------------------------

-- 1.- Relación completa de los científicos asignados a cada proyecto. Mostrar DNI, Nombre del científico, Identificador del proyecto y nombre del proyecto.

SELECT Cientifico.dni, Cientifico.nombre, Proyecto.codigo, Proyecto.nombre
FROM Cientifico
INNER JOIN Asignado ON Cientifico.dni = Asignado.dni
INNER JOIN Proyecto ON Proyecto.codigo = Asignado.codigo;

-- 2.- Obtener el número de proyectos al que está asignado cada científico (mostrar el DNI y el nombre).

SELECT Cientifico.dni, Cientifico.nombre, COUNT(Asignado.codigo) AS proyectos_asignados
FROM Cientifico
INNER JOIN Asignado ON Cientifico.dni = Asignado.dni
GROUP BY Cientifico.dni, Cientifico.nombre;

-- 3.- Obtener el número de científicos asignados a cada proyecto (mostrar el identificador del proyecto y el nombre del proyecto).

SELECT Proyecto.codigo, Proyecto.nombre, COUNT(Asignado.dni) AS cientificos_asignados
FROM Proyecto
INNER JOIN Asignado ON Asignado.codigo = Proyecto.codigo
GROUP BY Proyecto.codigo, Proyecto.nombre;

-- 4.- Obtener el número de dedicación de cada científico.

SELECT Cientifico.dni, SUM(Proyecto.horas) AS horas_dedicacion
FROM Cientifico
INNER JOIN Asignado ON Asignado.dni = Cientifico.dni
INNER JOIN Proyecto ON Proyecto.codigo = Asignado.codigo
GROUP BY Cientifico.dni;

-- 5.- Obtener el DNI y el nombre de los científicos que se dedican a más de un proyecto y cuya dedicación media a cada proyecto sea superior a las 80 horas.

SELECT Cientifico.dni, Cientifico.nombre
FROM Cientifico
INNER JOIN Asignado ON Asignado.dni = Cientifico.dni
INNER JOIN Proyecto ON Proyecto.codigo = Asignado.codigo
GROUP BY Cientifico.dni, Cientifico.nombre
HAVING COUNT(*) > 1 AND AVG(Proyecto.horas) > 80;

-- 6.- Nombre del científico que trabaja en todos los proyectos.

SELECT Cientifico.nombre
FROM Cientifico
INNER JOIN Asignado ON Asignado.dni = Cientifico.dni
GROUP BY Cientifico.dni
HAVING COUNT(*) = (
	SELECT COUNT(*)
	FROM Proyecto
);


-- 7.- Nombre del científico que no trabaja en ningún proyecto.

SELECT Cientifico.nombre
FROM Cientifico
WHERE Cientifico.dni NOT IN (
	SELECT Cientifico.dni
	FROM Cientifico
	INNER JOIN Asignado ON Asignado.dni = Cientifico.dni
	GROUP BY Cientifico.dni
);