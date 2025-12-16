-- 2025/12/16
-- Álvaro Fernández Barrero


-- Creating database

DROP DATABASE IF EXISTS JoinTester;
CREATE DATABASE IF NOT EXISTS JoinTester;
USE JoinTester;



-- Creating tables

DROP TABLE IF EXISTS departamento;
CREATE TABLE IF NOT EXISTS departamento(
	nombre VARCHAR(50) PRIMARY KEY NOT NULL,
	presupuesto int
);


DROP TABLE IF EXISTS empleado;
CREATE TABLE IF NOT EXISTS empleado(
	id int PRIMARY KEY NOT NULL UNSIGNED,
	nombre VARCHAR(25),
	direccion VARCHAR(50),
	nombre_dpto VARCHAR(50),
	FOREIGN KEY (nombre_dpto) REFERENCES departamento(nombre)
);



-- Inserting values

INSERT INTO departamento VALUES ('Marketing', 120000),
								('Ventas', 500000),
								('IT', 1000000);
DESCRIBE departamento;


INSERT INTO empleado VALUES (1, 'Pepe', 'Calle Ancha', 'Marketing'),
							(2, 'Ana', 'Calle Alta', 'Ventas'),
							(3, 'Eva', 'Calle Baja', NULL);
DESCRIBE empleado;



-- Checking values

SELECT * FROM departamento;
SELECT * FROM empleado;



-- Testing inner joins

SELECT *
FROM empleado e
INNER JOIN departamento d
ON e.nombre_dpto = d.nombre;


SELECT *
FROM departamento d
INNER JOIN empleado e
ON e.nombre_dpto = d.nombre;



-- Testing left join

SELECT *
FROM empleado e
LEFT JOIN departamento d
ON e.nombre_dpto = d.nombre;


SELECT *
FROM departamento d
LEFT JOIN empleado e
ON e.nombre_dpto = d.nombre;


SELECT *
FROM empleado e
LEFT JOIN departamento d
ON e.nombre_dpto = d.nombre
WHERE e.nombre_dpto IS NULL;



-- Testing right join

SELECT *
FROM empleado e
RIGHT JOIN departamento d
ON e.nombre_dpto = d.nombre;


SELECT *
FROM departamento d
RIGHT JOIN empleado e
ON e.nombre_dpto = d.nombre;


SELECT *
FROM empleado e
RIGHT JOIN departamento d
ON e.nombre_dpto = d.nombre
WHERE e.nombre_dpto IS NULL;



-- Full outer join is not on MySQL!
-- Using full outer join:

SELECT *
FROM empleado e
LEFT JOIN departamento d
ON e.nombre_dpto = d.nombre
UNION (
	SELECT *
	FROM empleado e
	RIGHT JOIN departamento d
	ON e.nombre_dpto = d.nombre
);


SELECT *
FROM empleado e
LEFT JOIN departamento d
ON e.nombre_dpto = d.nombre
WHERE e.nombre_dpto IS NULL
UNION (
	SELECT *
	FROM empleado e
	RIGHT JOIN departamento d
	ON e.nombre_dpto = d.nombre
	WHERE e.nombre_dpto IS NULL
);