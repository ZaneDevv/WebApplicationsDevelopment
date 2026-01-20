-- 2026/01/07
-- Álvaro Fernández Barrero
-- Suministros, examen

SET AUTO_COMMIT = FALSE;

-- --------------------------------
-- CREATING DATABASE
-- --------------------------------

DROP DATABASE IF EXISTS Suministros;
CREATE DATABASE IF NOT EXISTS Suministros;
USE Suministros;

-- --------------------------------
-- CREATING TABLES
-- --------------------------------

DROP TABLE IF EXISTS PROVEEDOR;
CREATE TABLE IF NOT EXISTS PROVEEDOR(
	pr VARCHAR(2) NOT NULL,
	nombre VARCHAR(20) NOT NULL,
	estado INT NOT NULL,
	ciudad VARCHAR(20) NOT NULL,

	PRIMARY KEY(pr)
);


DROP TABLE IF EXISTS PIEZA;
CREATE TABLE IF NOT EXISTS PIEZA(
	pz VARCHAR(2) NOT NULL,
	nombre VARCHAR(20) NOT NULL,
	color VARCHAR(20) NOT NULL,
	peso INT NOT NULL,
	ciudad VARCHAR(20) NOT NULL,

	PRIMARY KEY(pz)
);


DROP TABLE IF EXISTS SUMINISTRO;
CREATE TABLE IF NOT EXISTS SUMINISTRO(
	pr VARCHAR(2) NOT NULL,
	pz VARCHAR(2) NOT NULL,
	cantidad INT NOT NULL,

	PRIMARY KEY(pr, pz),
	FOREIGN KEY(pr) REFERENCES PROVEEDOR(pr),
	FOREIGN KEY(pz) REFERENCES PIEZA(pz)
);

-- --------------------------------
-- CHECKING TABLES
-- --------------------------------

DESCRIBE PROVEEDOR;
DESCRIBE PIEZA;
DESCRIBE SUMINISTRO;

COMMIT;

-- --------------------------------
-- SETTING DATA
-- --------------------------------

INSERT INTO PROVEEDOR VALUES ('S1', 'Salazar', 20, 'Londres'),
							 ('S2', 'Jaime', 10, 'Paris'),
							 ('S3', 'Bernal', 30, 'Paris'),
							 ('S4', 'Corona', 20, 'Londres'),
							 ('S5', 'Aldana', 30, 'Atenas');

INSERT INTO PIEZA VALUES ('P1', 'tuerca', 'verde', 12, 'Paris'),
						 ('P2', 'perno', 'rojo', 17, 'Londres'),
						 ('P3', 'birlo', 'azul', 17, 'Roma'),
						 ('P4', 'birlo', 'rojo', 14, 'Londres'),
						 ('P5', 'birlo', 'azul', 12, 'París'),
						 ('P6', 'encaje', 'rojo', 19, 'París');

INSERT INTO SUMINISTRO VALUES ('S1', 'P1', 300),
							  ('S1', 'P3', 400),
							  ('S1', 'P4', 200),
							  ('S1', 'P5', 100),
							  ('S2', 'P1', 300),
							  ('S2', 'P2', 400),
							  ('S3', 'P2', 200),
							  ('S4', 'P2', 200),
							  ('S4', 'P4', 300),
							  ('S4', 'P5', 400);

-- --------------------------------
-- CHECKING DATA
-- --------------------------------

SELECT *  FROM PROVEEDOR;
SELECT * FROM PIEZA;
SELECT * FROM SUMINISTRO;

COMMIT;

-- --------------------------------
-- Exercises
-- --------------------------------

-- 1. Obtener todas las piezas (nombre, color y peso) de color verde y rojo.

SELECT nombre, color, peso
FROM PIEZA
WHERE color = 'verde' OR color = 'rojo';

-- 2. Obtener nombre, estado y ciudad de los proveedores que están en las ciudades que empiezan por L.

SELECT nombre, estado, ciudad
FROM PROVEEDOR
WHERE ciudad LIKE 'L%';

-- 3. Obtener un listado completo de los suministro indicando el nombre del suministrador, el estado, el nombre de la pieza y el color de la misma

SELECT PROVEEDOR.nombre, PROVEEDOR.estado, PIEZA.nombre, PIEZA.color
FROM SUMINISTRO
INNER JOIN PROVEEDOR ON PROVEEDOR.pr = SUMINISTRO.pr
INNER JOIN PIEZA ON PIEZA.pz = SUMINISTRO.pz;

-- 4. Obtener el nombre de las piezas cuyo peso es superior al peso medio de todas las piezas

SELECT nombre
FROM PIEZA
WHERE PESO > (
	SELECT AVG(peso)
	FROM PIEZA
);

-- 5. Obtener el nombre de los proveedores que no realizan suministros

SELECT p.nombre
FROM PROVEEDOR p
LEFT JOIN SUMINISTRO s ON s.pr = p.pr
WHERE s.pz IS NULL;

-- 6. El nombre y ciudad de los proveedpres que realizan más suministros

SELECT pro.nombre, pro.ciudad
FROM PROVEEDOR pro
INNER JOIN SUMINISTRO s ON s.pr = pro.pr
GROUP BY pro.pr
HAVING COUNT(*) > 2;

-- 7.  Mostrar las piezas que son suministradas por más de un proveedor

SELECT DISTINCT PIEZA.*
FROM PIEZA
INNER JOIN SUMINISTRO ON SUMINISTRO.pz = PIEZA.pz
GROUP BY SUMINISTRO.pr
HAVING COUNT(*) > 1;

-- 8. From query:

SELECT p.nombre, s.cantidad
FROM PROVEEDOR pr
JOIN SUMINISTRO s ON p.pr = s.pr
WHERE p.estado = 30;

-- 9. From query:

SELECT DISTINCT pr.nombre
FROM PROVEEDOR pr
JOIN SUMINISTRO s ON pr.pr = s.pr
JOIN PIEZA pz ON s.pz = pz.pz
WHERE pr.ciudad = pz.ciudad;

-- 10. From query:

SELECT pr.pr, pr.nombre, SUM(s.cantidad) AS total_suministrado
FROM PROVEEDOR pr
JOIN SUMINISTRO s ON pr.pr = s.pr
GROUP BY pr.pr, pr.nombre;

-- 11. Listar los proveedores que están en París

SELECT *
FROM PROVEEDOR
WHERE ciudad = 'Paris';

-- 12. Mostrar las piezas de color rojo

SELECT *
FROM PIEZA
WHERE color = 'rojo';

-- 13. Mostrar los suministros realizados por el proveedor de S1

SELECT *
FROM SUMINISTRO
WHERE pr = 'S1';

-- 14. Mostrar el nombre del proveedor y la cantidad que suministra (JOIN simple)

SELECT PROVEEDOR.nombre, SUM(SUMINISTRO.cantidad) AS cantidad_total
FROM PROVEEDOR
INNER JOIN SUMINISTRO ON SUMINISTRO.pr = PROVEEDOR.pr
GROUP BY PROVEEDOR.nombre;

-- 15. Mostrar el nombre del provedor, el nombre de la pieza y la cantidad suministrada

SELECT PROVEEDOR.nombre, PIEZA.nombre, SUMINISTRO.cantidad
FROM SUMINISTRO
INNER JOIN PROVEEDOR ON PROVEEDOR.pr = SUMINISTRO.pr
INNER JOIN PIEZA ON PIEZA.pz = SUMINISTRO.pz;

-- 16. Mostrar los proveedores que suministran piezas fabricadas en la misma ciudad que ellos

SELECT DISTINCT PROVEEDOR.nombre
FROM PROVEEDOR
INNER JOIN SUMINISTRO ON SUMINISTRO.pr = PROVEEDOR.pr
INNER JOIN PIEZA ON SUMINISTRO.pz = PIEZA.pz
WHERE PIEZA.ciudad = PROVEEDOR.ciudad;

-- 17. Mostrar el total de piezas suministradas por cada proveedor

SELECT SUM(SUMINISTRO.cantidad) AS cantidad_total
FROM SUMINISTRO
GROUP BY SUMINISTRO.pr;

-- 18. Mostrar los proveedores que suministran más de una pieza diferente

SELECT PROVEEDOR.*
FROM PROVEEDOR
LEFT JOIN SUMINISTRO ON PROVEEDOR.pr = SUMINISTRO.pr
WHERE SUMINISTRO.pr IS NOT NULL
GROUP BY PROVEEDOR.pr
HAVING COUNT(SUMINISTRO.cantidad) > 1;

-- 19. Mostrar los proveedores que suministran más de 300 unidades en total

SELECT PROVEEDOR.*
FROM PROVEEDOR
INNER JOIN SUMINISTRO ON SUMINISTRO.pr = PROVEEDOR.pr
GROUP BY PROVEEDOR.pr
HAVING SUM(SUMINISTRO.cantidad) > 300;

-- 20. Mostrar la cantidad promedio suministrada por pieza

SELECT ROUND(AVG(SUMINISTRO.cantidad), 2) AS cantidad_media_por_pieza
FROM SUMINISTRO
GROUP BY SUMINISTRO.pz;