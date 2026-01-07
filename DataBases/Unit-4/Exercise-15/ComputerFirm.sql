-- 2026/01/07
-- Álvaro Fernández Barrero
-- Computer firm

-- --------------------------------
-- CREATING DATABASE
-- --------------------------------

CREATE DATABASE ComputerFirm;
USE ComputerFirm;

-- --------------------------------
-- CREATING TABLES
-- --------------------------------

DROP TABLE IF EXISTS Product;
CREATE TABLE IF NOT EXISTS Product(
	maker VARCHAR(10) NOT NULL,
	model VARCHAR(50) NOT NULL,
	type VARCHAR(50) NOT NULL,

	PRIMARY KEY(model)
);


DROP TABLE IF EXISTS Laptop;
CREATE TABLE IF NOT EXISTS Laptop(
	code INT NOT NULL,
	model VARCHAR(50) NOT NULL,
	speed SMALLINT NOT NULL,
	ram SMALLINT NOT NULL,
	hd INT NOT NULL,
	price FLOAT NOT NULL,
	screen TINYINT NOT NULL,

	PRIMARY KEY(code),
	FOREIGN KEY(model) REFERENCES Product(model)
);


DROP TABLE IF EXISTS Pc;
CREATE TABLE IF NOT EXISTS Pc(
	code INT NOT NULL,
	model VARCHAR(50) NOT NULL,
	speed SMALLINT NOT NULL,
	ram SMALLINT NOT NULL,
	hd INT NOT NULL,
	cd VARCHAR(10) NOT NULL,
	price FLOAT,

	PRIMARY KEY(code),
	FOREIGN KEY(model) REFERENCES Product(model)
);


DROP TABLE IF EXISTS Printer;
CREATE TABLE IF NOT EXISTS Printer(
	code INT NOT NULL,
	model VARCHAR(50) NOT NULL,
	color CHAR(1) NOT NULL,
	type VARCHAR(10) NOT NULL,
	price FLOAT,

	PRIMARY KEY(code),
	FOREIGN KEY(model) REFERENCES Product(model)
);

-- --------------------------------
-- CHECKING TABLES
-- --------------------------------

SHOW tables;

DESCRIBE Product;
DESCRIBE Laptop;
DESCRIBE Pc;
DESCRIBE Printer;

-- --------------------------------
-- INSERTING VALUES
-- --------------------------------

INSERT INTO Product VALUES
('A','1232','PC'),
('A','1233','PC'),
('A','1276','Printer'),
('A','1298','Laptop'),
('A','1401','Printer'),
('A','1408','Printer'),
('A','1752','Laptop'),
('B','1121','PC'),
('B','1750','Laptop'),
('C','1321','Laptop'),
('D','1288','Printer'),
('D','1433','Printer'),
('E','1260','PC'),
('E','1434','Printer'),
('E','2112','PC'),
('E','2113','PC')
;

INSERT INTO Printer VALUES
(1,'1276','n','laser',400),
(2,'1433','y','jet',270),
(3,'1434','y','jet',290),
(4,'1401','n','matrix',150),
(5,'1408','n','matrix',270),
(6,'1288','n','laser',400)
;

INSERT INTO Pc VALUES
('1','1232',500,64,5.0,'12x',600),
('10','1260',500,32,10.0,'12x',350),
('11','1233',900,128,40.0,'40x',980),
('12','1233',800,128,20.0,'50x',970),
('2','1121',750,128,14.0,'40x',850),
('3','1233',800,64,5.0,'12x',600),
('4','1121',600,128,14.0,'40x',850),
('5','1121',600,128,8.0,'40x',850),
('6','1233',750,128,20.0,'50x',950),
('7','1232',500,32,10.0,'12x',400),
('8','1232',450,64,8.0,'24x',350),
('9','1232',450,32,10.0,'24x',350)
;

INSERT INTO Laptop VALUES
(1,'1298',350,32,4.0,700,11),
(2,'1321',500,64,8.0,970,12),
(3,'1750',750,128,12.0,1200,14),
(4,'1298',600,64,10.0,1050,15),
(5,'1752',750,128,10.0,1150,14),
(6,'1298',450,64,10.0,950,12)
;

-- --------------------------------
-- CHECKING DATA
-- --------------------------------

SELECT * FROM Product;
SELECT * FROM Laptop;
SELECT * FROM Printer;
SELECT * FROM Pc;

-- --------------------------------
-- EXERCISES
-- --------------------------------

-- 1. Find the model number, speed and hard drive capacity for all the PCs with prices below $500. Result set: model, speed, hd.

SELECT model, speed, hd
FROM Pc
WHERE price < 500;

-- 2. Find printer makers. Result set: maker.

SELECT Product.maker
FROM Product
WHERE type = 'printer';

-- 3. Find the model number, RAM and screen size of the laptops with prices over $1000.

SELECT model, ram, hd
FROM Laptop
WHERE price > 1000;

-- 4. Find the model number, speed and hard drive capacity of the PCs having 12x CD and prices less than $600 or having 24x CD and prices less than $600.

SELECT model, speed, hd
FROM Pc
WHERE (cd = '12x' OR cd = '24x') AND price < 600;

-- 5. Point out the maker and speed of the laptops having hard drive capacity more or equal to 10 Gb.

SELECT Product.maker, Laptop.hd
FROM Laptop
INNER JOIN Product
ON Laptop.model = Product.model
WHERE Laptop.hd >= 10;

-- TODO: 6. Find out the models and prices for all the products (of any type) produced by maker B.


-- 7. Find out the makers that sale PCs but not laptops.

SELECT maker
FROM Product
WHERE type = 'pc' AND maker NOT IN (
	SELECT maker
	FROM Product
	WHERE type = 'laptop'
);

-- 8. Find the printers having the highest price. Result set: model, price.

SELECT model, price
FROM Printer
WHERE price = (
	SELECT MAX(price)
	FROM Printer
);

-- 9. Find out the average speed of PCs.

SELECT AVG(speed) as pc_speed_avarage
FROM Pc;

-- 10. Find all the makers who have all their models of PC type in the PC table

SELECT Product.maker
FROM Product
INNER JOIN Pc
ON Pc.model = Product.model
GROUP BY Product.model;

-- 11. Find out the average speed of the PCs produced by maker A.

SELECT AVG(Pc.speed) AS pc_speed_avarage
FROM Pc
INNER JOIN Product
ON Product.model = Pc.model
WHERE Product.maker = 'A';

-- 12. TODO: Find the hard drive sizes that are equal among two or more PCs. Result set: hd.aptop.price AS laptop_price,

-- 13. TODO: Find the pairs of PC models having similar speeds and RAM. As a result, each resulting pair is shown only once, i.e. (i, j) but not (j, i). Result set: model with high number, model with low number, speed, and RAM.

-- 14. Find the laptops having speeds less than all PCs. Result set: type, model, speed.

SELECT p.type, l.model, l.speed
FROM Laptop l
INNER JOIN Product p
ON l.model = p.model
WHERE l.speed < (
	SELECT MIN(speed)
	FROM Pc
);

-- 15. Find the makers of the cheapest color printers. Result set: maker, price

SELECT Product.maker, Printer.price
FROM Printer
INNER JOIN Product
ON Product.model = Printer.model
WHERE Printer.color = 'y' AND Printer.price <= (
	SELECT MIN(p.price)
	FROM Printer p
	WHERE p.color = 'y'
);

-- 16. TODO: Find the makers producing at least three distinct models of PCs. Result set: maker, number of models.

-- 17. TODO: Find the makers producing at least both a pc having speed not less than 750 MHz and a laptop having speed not less than 750 MHz. Result set: Maker

-- 18. TODO: Find the model number of the product (PC, laptop, or printer) with the highest price.Result set: model

-- 19. TODO: Find the printer makers which also produce PCs with the lowest RAM and the highest-speed processor among PCs with the lowest RAM. Result set: maker.

-- 20. TODO: Define the average price of the PCs and laptops produced by maker A. Result set: single total price.

-- 21. TODO: Define the average size of the PC hard drive for each maker that also produces printers. Result set: maker, average capacity of HD.