-- 2025/11/19
-- Álvaro Fernández Barrero


-- Creatibg database

CREATE DATABASE MyDatabase;
USE MyDatabase;


-- First table

CREATE TABLE IF NOT EXISTS MyTable1(
	id INT UNSIGNED AUTO_INCREMENT,
	name VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL,
	PRIMARY KEY(id)
);

INSERT INTO MyTable1(name, email) VALUES ("bob", "bob123@gmail.com"), ("john", "thehandsomejohn@gmail.com");
SELECT * FROM MyTable1;


-- Second table

CREATE TABLE IF NOT EXISTS MyTable2(
	id INT UNSIGNED AUTO_INCREMENT,
	name CHAR(100),
	address VARCHAR(150),
	PRIMARY KEY(id)
);

INSERT INTO MyTable2(name) VALUES ("maria");
SELECT * FROM MyTable2;


-- Third table

CREATE TABLE IF NOT EXISTS MyTable3(
	id INT UNSIGNED AUTO_INCREMENT,
	name VARCHAR(30),
	age TINYINT,
	weight SMALLINT,
	salary DECIMAL(5,2),
	PRIMARY KEY(id)
);

INSERT INTO MyTable3(name, age, weight, salary) VALUES ("steve", 45, 78, 456.45);
SELECT * FROM MyTable3;
