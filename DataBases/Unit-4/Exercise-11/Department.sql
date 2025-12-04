-- Álvaro Fernández Barrero
-- 2025/12/02



-- Creating database

CREATE DATABASE IF NOT EXISTS Business;
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
	department INT,
	PRIMARY KEY(id),
	FOREIGN KEY(department) REFERENCES Departments(code) ON DELETE SET NULL ON UPDATE SET NULL
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

SELECT last_name FROM Employees;

SELECT DISTINCT last_name FROM Employees;

SELECT * FROM Employees WHERE last_name = 'López';

SELECT * FROM Employees WHERE last_name IN ('López', 'Pérez');

SELECT * FROM Employees WHERE department = 14;

SELECT * FROM Employees WHERE department IN (37, 77);

SELECT * FROM Employees WHERE last_name LIKE 'P%';

SELECT budget FROM Departments;

SELECT SUM(budget)
FROM Departments;

SELECT COUNT(*) AS employees_amount
FROM Employees
GROUP BY department;

SELECT *
FROM Employees emp, Departments dep
WHERE emp.department = dep.code;

SELECT emp.name, emp.last_name, dep.name AS department_name, dep.budget AS deparment_budget
FROM Employees emp, Departments dep
WHERE emp.department = dep.code;

SELECT emp.name, emp.last_name
FROM Employees emp, Departments dep
WHERE emp.department = dep.code AND dep.budget > 60000;

SELECT *
FROM Departments
WHERE budget > (
	SELECT ROUND(AVG(budget), 2) AS avarage_budget
	FROM Departments
);

SELECT dep.name
FROM Employees emp, Departments dep
WHERE emp.department = dep.code
GROUP BY dep.name
HAVING COUNT(*) >= 2;

INSERT INTO Departments VALUES (11, 'Calidad', 40000);
INSERT INTO Employees VALUES (89267109, 'Esther', 'Vázquez', 11);

UPDATE Departments
SET budget = budget - budget * 0.1; 

UPDATE Employees
SET department = 14
WHERE department = 77;

DELETE FROM Employees
WHERE department = (
	SELECT code
	FROM Departments
	WHERE name = 'Informática'
);

DELETE FROM Employees
WHERE 60000 < (
	SELECT budget
	FROM Departments
	WHERE Employees.department = Departments.code
);

DELETE FROM Employees;
