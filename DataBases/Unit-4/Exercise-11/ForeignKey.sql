-- Álvaro Fernández Barrero
-- 2025/12/02


-- Creating database

CREATE DATABASE IF NOT EXISTS TestingForeignKey;
USE TestingForeignKey;



-- Creating tables

DROP TABLE IF EXISTS Department;
CREATE TABLE IF NOT EXISTS Department(
	name VARCHAR(30),
	assigment INT,
	PRIMARY KEY(name)
);

DROP TABLE IF EXISTS Employee;
CREATE TABLE IF NOT EXISTS Employee(
	id INT,
	name VARCHAR(30),
	birth_date DATE,
	department_name VARCHAR(30),
	PRIMARY KEY(id),
	FOREIGN KEY(department_name) REFERENCES Department(name)
);



-- Inserting values

INSERT INTO Department VALUES ('Sells', 1000000);
INSERT INTO Department VALUES ('Marketing', 5000);
INSERT INTO Department VALUES ('Human Resources', 300000);
INSERT INTO Department VALUES ('IT', 1200000);

INSERT INTO Employee VALUES (1, 'Pepe', '2002-12-12', 'Sells');
INSERT INTO Employee VALUES (2, 'Ana', '2000-12-01', 'Marketing');
INSERT INTO Employee VALUES (3, 'Bob', '2003-04-21', 'Human Resources');
INSERT INTO Employee VALUES (4, 'Eva', '1999-11-11', 'Human Resources');
INSERT INTO Employee VALUES (8, 'Jose', '1998-10-12', 'Sells');



-- Queries

SELECT * FROM Employee, Department dep WHERE department_name = dep.name;
SELECT * FROM Employee, Department dep WHERE assigment > 10000 AND department_name = dep.name;

SELECT emp.name, emp.id
FROM Employee emp, Department dep
WHERE emp.department_name = dep.name AND dep.assigment <= 500000;

SELECT dep.name
FROM Employee emp, Department dep
WHERE dep.name = emp.department_name AND emp.birth_date < '2000-01-01';

SELECT dep.name, COUNT(*) AS employees_amount
FROM Employee emp, Department dep
WHERE dep.name = department_name
GROUP BY emp.department_name
ORDER BY employees_amount DESC;

SELECT dep.name AS department_name
FROM Employee emp, Department dep
WHERE dep.name = department_name
GROUP BY emp.department_name
HAVING COUNT(*) < 2;
