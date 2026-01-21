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
INNER JOIN Asignado ON Asignado.dni = Cientifico.dni
WHERE Cientifico.dni NOT IN (
	SELECT Cientifico.dni
	FROM Cientifico
	GROUP BY Cientifico.dni
);

-- 8. La media de horas de los proyectos excluyendo el valor máximo y el mínimo

SELECT ROUND(AVG(Proyecto.horas), 2) AS media_horas
FROM Proyecto
WHERE
	Proyecto.horas < (
		SELECT MAX(Proyecto.horas)
		FROM Proyecto
	)
	AND Proyecto.horas > (
		SELECT MIN(Proyecto.horas)
		FROM Proyecto
	);

-- 9. Calcular la moda del número de horas (el valor que más se repite)

INSERT INTO Proyecto VALUES ('F', 'Biomedicina', 300);
COMMIT;

SELECT Proyecto.horas AS moda
FROM Proyecto
GROUP BY Proyecto.horas
ORDER BY COUNT(*) DESC
LIMIT 1;

-- 10. Obtener los científicos que trabajan en proyectos con más de 400 horas

SELECT DISTINCT Cientifico.*
FROM Cientifico
LEFT JOIN Asignado ON Asignado.dni = Cientifico.dni
INNER JOIN Proyecto ON Proyecto.codigo = Asignado.codigo
WHERE Proyecto.horas > 400;

-- 11. Mostrar los científicos que solo trabajan en proyectos de más de 100 horas

SELECT DISTINCT Cientifico.*
FROM Cientifico
LEFT JOIN Asignado ON Asignado.dni = Cientifico.dni
INNER JOIN Proyecto ON Asignado.codigo  = Proyecto.codigo
WHERE Proyecto.horas > 100 AND Cientifico.dni NOT IN (
	SELECT DISTINCT Cientifico.dni
	FROM Cientifico
	LEFT JOIN Asignado ON Asignado.dni = Cientifico.dni
	INNER JOIN Proyecto ON Proyecto.codigo = Asignado.codigo
	WHERE Proyecto.horas < 100
);

-- 12. Listar los  proyectos en los que trabaja al menos un científico llamado "María"

SELECT DISTINCT Proyecto.*
FROM Proyecto
RIGHT JOIN Asignado ON Asignado.codigo = Proyecto.codigo
INNER JOIN Cientifico ON Cientifico.dni = Asignado.dni
WHERE Cientifico.nombre = 'Maria';

-- 13. Obtener el total de horas asignadas a cada científico

SELECT Cientifico.dni, Cientifico.nombre, Cientifico.apellido, SUM(Proyecto.horas) AS horas_asignadas
FROM Cientifico
INNER JOIN Asignado ON Asignado.dni = Cientifico.dni
INNER JOIN Proyecto ON Proyecto.codigo = Asignado.codigo
GROUP BY Cientifico.dni;

-- 14. Mostrar los científicos que trabajan en proyectos cuyo nombre empieza por 'B'

SELECT DISTINCT Cientifico.*
FROM Cientifico
INNER JOIN Asignado ON Asignado.dni = Cientifico.dni
INNER JOIN Proyecto ON Proyecto.codigo = Asignado.codigo
WHERE Proyecto.nombre LIKE 'B%';

-- 15. Obtener el proyecto con mayor número de científicos asignados

SELECT Proyecto.*, COUNT(Asignado.codigo)
FROM Proyecto
INNER JOIN Asignado ON Asignado.codigo = Proyecto.codigo
GROUP BY Proyecto.codigo
HAVING COUNT(Asignado.codigo) = (
	SELECT MAX(amount)
	FROM (
		SELECT COUNT(Asignado.dni) AS amount
		FROM Proyecto
		INNER JOIN Asignado ON Asignado.codigo = Proyecto.codigo
		GROUP BY Proyecto.codigo
	) amount_table
);

-- 16. Mostrar los científicos que trabajan en más proyectos que la media

SELECT Cientifico.*
FROM Cientifico
INNER JOIN Asignado ON Asignado.dni = Cientifico.dni
GROUP BY Cientifico.dni
HAVING COUNT(Asignado.codigo) > (
	SELECT AVG(total_count)
	FROM (
		SELECT COUNT(Asignado.dni) AS total_count
		FROM Asignado
		GROUP BY Asignado.codigo
	) count
);

-- 17. Obtener los proyectos que no tienen ningún científico asignado

SELECT Proyecto.*
FROM Proyecto
LEFT JOIN Asignado ON Proyecto.codigo = Asignado.codigo
WHERE Asignado.dni IS NULL;

-- 18. Listar los científicos nacidos antes de 1970 que trabajen en proyectos de más de 300 horas

SELECT DISTINCT Cientifico.*
FROM Cientifico
INNER JOIN Asignado ON Asignado.dni = Cientifico.dni
INNER JOIN Proyecto ON Asignado.codigo = Proyecto.codigo
WHERE Cientifico.fecha_nacimiento < '1970-01-01' AND Proyecto.horas > 300;

-- 19. Obtener el proyecto con menos horas que tenga científicos asignados

SELECT Proyecto.*
FROM Proyecto
GROUP BY Proyecto.codigo
HAVING Proyecto.horas = (
	SELECT MIN(Proyecto.horas)
	FROM Proyecto
	RIGHT JOIN Asignado ON Proyecto.codigo = Asignado.codigo
	WHERE Asignado.codigo IS NOT NULL
);

-- 20. Haz dos queries para que el resultado te de la siguiente tabla:
-- 
-- +--------+------------+
-- | codigo | nombre     |
-- +--------+------------+
-- | D      | Tectónica  |
-- | E      | Histograma |
-- +--------+------------+
-- 
-- Una de ellas debe tener having


SELECT DISTINCT Proyecto.codigo, Proyecto.nombre
FROM Proyecto
SELECT DISTINCT Proyecto.codigo, Proyecto.nombre
FROM Proyecto
INNER JOIN Asignado ON Asignado.codigo = Proyecto.codigo
GROUP BY Proyecto.codigo, Proyecto.nombre
HAVING COUNT(Asignado.dni) = 1;

SELECT Proyecto.codigo, Proyecto.nombre
FROM Proyecto
WHERE Proyecto.codigo IN ('D', 'E');

-- 21. Científicos que trabajan exclusivamente en proyectos con horas superiores a la media

SELECT DISTINCT Cientifico.*
FROM Cientifico
INNER JOIN Asignado ON Asignado.dni = Cientifico.dni
INNER JOIN Proyecto ON Asignado.codigo = Proyecto.codigo
GROUP BY Cientifico.dni, Proyecto.horas
HAVING Proyecto.horas > (
	SELECT AVG(Proyecto.horas)
	FROM Proyecto
);