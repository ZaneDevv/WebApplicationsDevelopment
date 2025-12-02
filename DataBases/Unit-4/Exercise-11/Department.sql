-- Álvaro Fernández Barrero
-- 2025/12/02



-- Creating database

CREATE TABLE IF NOT EXISTS Business
USE Business;



-- Creating tables

DROP TABLE IF EXISTS Departments;
CREATE TABLE IF NOT EXISTS Departments(
	code INT,
	name VARCHAR(100),
	budget INT,
	PRIMARY KEY(code)
);

DROP TABLE IF EXISTS Employees;
CREATE TABLE IF NOT EXISTS Employees(
	id VARCHAR(8),
	name VARCHAR(100),
	last_name VARCHAR(255),
	department INT
	PRIMARY KEY (id),
	FOREIGN KEY(department) REFERENCES Department(code)
);



-- Inserting values

INSERT INTO Departments VALUES (14, 'Marketing', 20000),
                               (37, 'Facturación', 2000),
                               (77, 'Ventas', 22000),
                               (55, 'RR.HH', 60000),
                               (1, 'Informática', 70000),
                               (21, 'Mantenimiento', 80000),
                               (31, 'Exteriores', 90000);

INSERT INTO Employees VALUES (111, 'Francisco', 'Medina', 14),
                             (112, 'Francisco', 'López', 37),
                             (113, 'Francisco', 'Pérez', 77),
                             (114, 'Cristina', 'Medina', 77),
                             (115, 'Cristina', 'Martín', 55),
                             (116, 'Cristina', 'López', 21),
                             (117, 'Jaime', 'Pérez', 21),
                             (118, 'Marcos', 'García', 21);
                             
                             

-- Queries

SELECT last_name
FROM Employees;
