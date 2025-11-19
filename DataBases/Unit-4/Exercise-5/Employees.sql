-- 2025/11/19
-- Álvaro Fernández Barrero


-- Creating database

CREATE DATABASE Business;
USE Business;


-- Creating table employees

DROP TABLE IF EXISTS Employees;
CREATE TABLE IF NOT EXISTS Employees(
	name VARCHAR(20),
	document VARCHAR(8),
	genre VARCHAR(1),
	dwelling VARCHAR(30),
	salary FLOAT
);
DESCRIBE Employees;

INSERT INTO Employees(name, document, genre, dwelling, salary) VALUES ("Juan Perez", "22345678", "m", "Sarmiento 123", 300),
                                                                      ("Ana Acosta", "24345678", "f", "Colon 134", 500),
                                                                      ("Marcos Torres", "27345678", "m", "Urquiza 479", 800);
SELECT * FROM Employees;

