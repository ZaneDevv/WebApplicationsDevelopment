-- Álvaro Fernández Barrero
-- 2026-02-04

-- -------------------------------------
-- Creating the database
-- -------------------------------------

CREATE DATABASE IF NOT EXISTS STORE;
USE STORE;

-- -------------------------------------
-- Creating tables
-- -------------------------------------

CREATE TABLE IF NOT EXISTS Cashiers(
    code INT,
    full_name VARCHAR(255),
    
    PRIMARY KEY(code)
);

CREATE TABLE IF NOT EXISTS Products(
    code INT,
    name VARCHAR(100),
    price INT,
    
    PRIMARY KEY(code)
);

CREATE TABLE IF NOT EXISTS CashRegisters(
    code INT,
    floor INT,
    
    PRIMARY KEY(code)
);

CREATE TABLE IF NOT EXISTS Sale(
    cashier INT,
    product INT,
    machine INT,
    
    PRIMARY KEY(cashier, machine, product),
    FOREIGN KEY(cashier) REFERENCES Cashiers(code),
    FOREIGN KEY(product) REFERENCES Products(code),
    FOREIGN KEY(machine) REFERENCES CashRegisters(code)
);

-- -------------------------------------
-- Data review
-- -------------------------------------

DESCRIBE Cashiers;
DESCRIBE Products;
DESCRIBE CashRegisters;
DESCRIBE Sale;

-- -------------------------------------
-- Adding data
-- -------------------------------------

INSERT INTO Cashiers VALUES
(4382, 'John'),
(8493, 'Nestor'),
(3963, 'Francis'),
(3414, 'Angel'),
(6298, 'Manuel'),
(5243, 'Joseph');

INSERT INTO Products VALUES
(3741, 'PS4', 400),
(7629, 'xBox One', 450),
(3925, 'Nintendo DS', 180),
(4602, 'PSVita', 220),
(6420, 'Wii-U', 300);

INSERT INTO CashRegisters VALUES
(2951, 1),
(4325, 1),
(6382, 2),
(4629, 3),
(2843, 4);

INSERT INTO Sale VALUES
(3963, 6420, 4629),
(3414, 3741, 2843),
(4382, 3925, 2951),
(6298, 4602, 4325),
(5243, 7629, 2843),
(3963, 3741, 2843),
(4382, 7629, 6382);

-- -------------------------------------
-- Data review
-- -------------------------------------

SELECT * FROM Cashiers;
SELECT * FROM Products;
SELECT * FROM CashRegisters;
SELECT * FROM Sale;

-- -------------------------------------
-- Exercises
-- -------------------------------------

-- 1. Get the number of sales for each product, ordered from most to least sales.

SELECT p.*, COUNT(*) AS sales_count
FROM Products p
LEFT JOIN Sale s ON p.code = s.product
GROUP BY p.code
ORDER BY sales_count DESC;

-- 2. Get a complete sales report, showing the cashier's name who made the sale, 
-- product names and prices sold, and the floor where the cash register used for the sale is located.

SELECT c.full_name AS cashier_name, p.name AS product_name, p.price, cr.floor
FROM Sale s
JOIN Cashiers c ON c.code = s.cashier
JOIN Products p ON p.code = s.product
JOIN CashRegisters cr ON cr.code = s.machine;

-- 3. Get sales made on each floor.

SELECT cr.floor, COUNT(*) sales_count
FROM CashRegisters cr
JOIN Sale s ON cr.code = s.machine
GROUP BY cr.floor
ORDER BY cr.floor ASC;

-- 4. Get the code and name of each employee, along with the total amount of their sales.

SELECT c.code, c.full_name AS name, SUM(p.price) AS total_amount
FROM Cashiers c
JOIN Sale s ON s.cashier = c.code
JOIN Products p ON s.product = p.code
GROUP BY c.code;

-- 5. Get the code and name of cashiers who made sales on floors where total sales are less than €500.

SELECT DISTINCT c.code, c.full_name
FROM Cashiers c
JOIN Sale s ON s.cashier = c.code
JOIN CashRegisters cr ON cr.code = s.machine
WHERE cr.floor IN (
    SELECT cr.floor
    FROM CashRegisters cr
    JOIN Sale s ON s.machine = cr.code
    JOIN Products p ON p.code = s.product
    GROUP BY cr.floor
    HAVING SUM(p.price) < 500
);
