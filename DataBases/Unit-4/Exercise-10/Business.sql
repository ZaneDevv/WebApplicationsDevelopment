-- 2025/11/26
-- Álvaro Fernández Barrero


-- Creating database

CREATE DATABASE IF NOT EXISTS Business;
USE Business;



-- Creating table

DROP TABLE IF EXISTS Employees;
CREATE TABLE IF NOT EXISTS Employees(
	id INT UNSIGNED AUTO_INCREMENT,
	name VARCHAR(20),
	salary FLOAT,
	income_date DATE,
	age INT UNSIGNED,
	department VARCHAR(20),
	active TINYINT(1),
	PRIMARY KEY(id)
);

DESCRIBE Employees;


-- Inserting values

INSERT INTO Employees(name, salary, income_date, age, department, active) VALUES ('Juan Pérez', 2500, '2020-01-15', 30, 'Ventas', 1),
                                                                                 ('María López', 3000, '2019-05-23', 28, 'Marketing', 1),
                                                                                 ('Pedro García', 1500, '2021-07-19', 35, 'Ventas', 1),
                                                                                 ('Ana Fernández', 1800, '2018-03-10', 40, 'Soporte', 0),
                                                                                 ('Luis Martínez', 2200, '2022-11-01', 25, 'IT', 1),
                                                                                 ('Carla Gómez', 3200, '2020-08-29', 32, 'Marketing', 1),
                                                                                 ('Miguel Sánchez', 2800, '2017-09-15', 45, 'Soporte', 1);

-- 1. Checking the maximum salary

SELECT MAX(salary) AS greatest_salary FROM Employees;


-- 2. Checking the minimum salary

SELECT MIN(salary) AS lowest_salary FROM Employees;


-- 3. Checking the avarage salary

SELECT ROUND(AVG(salary), 2) AS avarage_salary FROM Employees;


-- 4. Counting active employees

SELECT COUNT(*) AS active_employees_amount FROM Employees WHERE active = 1;


-- 5. Counting employees in each department

SELECT department, COUNT(*) employees_number FROM Employees GROUP BY department;


-- 6. Checking the avarage age of the active employees

SELECT AVG(age) AS avarage_age FROM Employees WHERE active = 1; 


-- 7. Checking the avarage salary of he employees in marketing

SELECT AVG(salary) AS avarage_salary FROM Employees WHERE department = 'Marketing';


-- 8. Checking greatets and lowest salary of employees in "Soporte"

SELECT MAX(salary) AS greatest_salary, MIN(salary) AS lowest_salary FROM Employees WHERE department = 'Soporte';


-- 9. Checking amount of employees older than 30

SELECT COUNT(*) AS employees_older_than_30 FROM Employees WHERE age > 30;


-- 10. Checking avarage age of no-active employees

SELECT AVG(age) AS avarage_age FROM Employees WHERE active = 0;


-- 11. Obtain the name of the best payed employee

SELECT name, salary FROM Employees WHERE salary = (SELECT MAX(salary) FROM Employees);


-- 12. Obtain the name of the employees whose age is between 30 and 43

SELECT name FROM Employees WHERE age BETWEEN 30 AND 43;


-- 13. Obtain the most veteran employee

SELECT name, income_date FROM Employees WHERE income_date = (SELECT MIN(income_date) FROM Employees); 


-- 14. Obtain the name of the employees who is close the most to retire

SELECT name FROM Employees WHERE age = (SELECT MAX(age) FROM Employees);


-- 15. Obtain the department's name which has the most employees

SELECT department, COUNT(*) AS employees_number
FROM Employees
GROUP BY department
HAVING employees_number = (
	SELECT COUNT(*)
	FROM Employees
	GROUP BY department
	LIMIT 1
);


-- 16. Obtain the department's name which has the most unactive employees

SELECT department, COUNT(*) AS employees_number
FROM Employees
GROUP BY department
HAVING employees_number = (
	SELECT COUNT(*)
	FROM Employees
	WHERE active = 0
	GROUP BY department
	LIMIT 1
);


-- 18. Obtain the department's name with the best payed employee

SELECT department FROM Employees WHERE salary = (SELECT MAX(salary) FROM Employees);
