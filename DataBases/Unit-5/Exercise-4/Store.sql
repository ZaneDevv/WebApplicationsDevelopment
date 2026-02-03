-- Álvaro Fernández Barrero
-- 2026/02/03

-- ---------------------------------
-- Creating database
-- ---------------------------------

DROP DATABASE IF EXISTS store;
CREATE DATABASE store CHARACTER SET utf8mb4;
USE store;

-- ---------------------------------
-- Creating Tables
-- ---------------------------------

CREATE TABLE manufacturer (
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(100) NOT NULL
);

CREATE TABLE product (
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(100) NOT NULL,
	price DOUBLE NOT NULL,
	manufacturer_id INT UNSIGNED NOT NULL,

	FOREIGN KEY (manufacturer_id) REFERENCES manufacturer(id)
);

-- ---------------------------------
-- Inserting data
-- ---------------------------------

INSERT INTO manufacturer VALUES(1, 'Asus');
INSERT INTO manufacturer VALUES(2, 'Lenovo');
INSERT INTO manufacturer VALUES(3, 'Hewlett-Packard');
INSERT INTO manufacturer VALUES(4, 'Samsung');
INSERT INTO manufacturer VALUES(5, 'Seagate');
INSERT INTO manufacturer VALUES(6, 'Crucial');
INSERT INTO manufacturer VALUES(7, 'Gigabyte');
INSERT INTO manufacturer VALUES(8, 'Huawei');
INSERT INTO manufacturer VALUES(9, 'Xiaomi');

INSERT INTO product VALUES(1, 'SATA3 1TB Hard Drive', 86.99, 5);
INSERT INTO product VALUES(2, 'DDR4 8GB RAM Memory', 120, 6);
INSERT INTO product VALUES(3, '1 TB SSD Drive', 150.99, 4);
INSERT INTO product VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO product VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO product VALUES(6, '24 LED Full HD Monitor', 202, 1);
INSERT INTO product VALUES(7, '27 LED Full HD Monitor', 245.99, 1);
INSERT INTO product VALUES(8, 'Yoga 520 Laptop', 559, 2);
INSERT INTO product VALUES(9, 'Ideapad 320 Laptop', 444, 2);
INSERT INTO product VALUES(10, 'HP Deskjet 3720 Printer', 59.99, 3);
INSERT INTO product VALUES(11, 'HP Laserjet Pro M26nw Printer', 180, 3);

-- ---------------------------------
-- Exercises
-- ---------------------------------

-- 1.
SELECT product.name, product.price, manufacturer.name
FROM product
INNER JOIN manufacturer ON manufacturer.id = product.manufacturer_id;


-- 2.
SELECT product.name, product.price, manufacturer.name
FROM product
INNER JOIN manufacturer ON manufacturer.id = product.manufacturer_id
ORDER BY manufacturer.name ASC;


-- 3.
SELECT product.id AS product_id, product.name AS product_name,
       manufacturer.id AS manufacturer_id, manufacturer.name AS manufacturer_name
FROM product
INNER JOIN manufacturer ON manufacturer.id = product.manufacturer_id;


-- 4.
SELECT product.name, product.price, manufacturer.name
FROM product
INNER JOIN manufacturer ON manufacturer.id = product.manufacturer_id
WHERE product.price <= (
	SELECT MIN(product.price)
	FROM product
);


-- 5.
SELECT product.name, product.price, manufacturer.name
FROM product
INNER JOIN manufacturer ON manufacturer.id = product.manufacturer_id
WHERE product.price <= (
	SELECT MAX(product.price)
	FROM product
);


-- 6.
SELECT product.*
FROM product
INNER JOIN manufacturer ON manufacturer.id = product.manufacturer_id
WHERE manufacturer.name = 'Lenovo';


-- 7.
SELECT product.*
FROM product
INNER JOIN manufacturer ON manufacturer.id = product.manufacturer_id
WHERE manufacturer.name = 'Crucial' AND product.price > 200;


-- 8.
SELECT product.*
FROM product
INNER JOIN manufacturer ON manufacturer.id = product.manufacturer_id
WHERE manufacturer.name = 'Asus'
   OR manufacturer.name = 'Hewlett-Packard'
   OR manufacturer.name = 'Seagate';


-- 9.
SELECT product.*
FROM product
INNER JOIN manufacturer ON manufacturer.id = product.manufacturer_id
WHERE manufacturer.name IN ('Asus', 'Hewlett-Packard', 'Seagate');


-- 10.
SELECT product.name, product.price
FROM product
INNER JOIN manufacturer ON manufacturer.id = product.manufacturer_id
WHERE manufacturer.name LIKE '%e';


-- 11.
SELECT product.name, product.price
FROM product
INNER JOIN manufacturer ON manufacturer.id = product.manufacturer_id
WHERE manufacturer.name LIKE '%w%';


-- 12.
SELECT product.name, product.price, manufacturer.name
FROM product
INNER JOIN manufacturer ON manufacturer.id = product.manufacturer_id
WHERE product.price >= 180
ORDER BY product.price DESC, product.name ASC;


-- 13.
SELECT DISTINCT manufacturer.id, manufacturer.name
FROM manufacturer
LEFT JOIN product ON product.manufacturer_id = manufacturer.id
WHERE product.id IS NOT NULL;