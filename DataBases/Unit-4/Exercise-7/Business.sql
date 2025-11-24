-- 2025/11/24
-- Álvaro Fernández Barrero


-- Creating database

CREATE DATABASE IF NOT EXISTS Business;
USE Business;


-- Creating table

DROP TABLE IF EXISTS Employee;
CREATE TABLE IF NOT EXISTS Employee(
	dni VARCHAR(10) CHECK (dni REGEXP "^\\d{8}[a-zA-Z]$"),
	name VARCHAR(50),
	document VARCHAR(8),
	dwelling VARCHAR(30),
	genre VARCHAR(1) CHECK (genre REGEXP "^F|f|M|m$"),
	salary FLOAT,
	PRIMARY KEY(dni)
);
DESCRIBE Employee;

INSERT INTO Employees(name, document, genre, dwelling, salary) VALUES ("Juan Perez", "22345678", "m", "Sarmiento 123", 300),
                                                                      ("Ana Acosta", "24345678", "f", "Colon 134", 500),
                                                                      ("Marcos Torres", "27345678", "m", "Urquiza 479", 800);
SELECT * FROM Employees;
SELECT name, document FROM Employees;
SELECT name, document, salary FROM Employees;
