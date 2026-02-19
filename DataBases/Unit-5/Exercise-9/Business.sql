-- -----------------------------------------
-- CREATE TABLES
-- -----------------------------------------

CREATE TABLE Empleado(
    numEmp INT,
    nombreEmp VARCHAR2(50),
    empleo VARCHAR2(50),
    jefe INT,
    fechaEntr DATE,
    sueldo INT,
    complemento INT,
    numDep INT
);

CREATE TABLE Departamento(
    numDep INT,
    nombreDep VARCHAR2(50),
    ciudad VARCHAR2(50)
);

CREATE TABLE Proyecto (
    numProy NUMBER(3) NOT NULL,
    nomProy CHAR(5),
    presupuesto NUMBER(7,2)
);

-- -----------------------------------------
-- ALTER TABLES
-- -----------------------------------------

ALTER TABLE Empleado ADD CONSTRAINT pk_empleado PRIMARY KEY(numemp);
ALTER TABLE Departamento ADD CONSTRAINT pk_departamento PRIMARY KEY(numDep);
ALTER TABLE Proyecto ADD CONSTRAINT pk_proyecto PRIMARY KEY(numProy);

ALTER TABLE Empleado ADD CONSTRAINT fk_empleado_departamento FOREIGN KEY(numDep) REFERENCES Departamento(numDep);

-- -----------------------------------------
-- CHECKING TABLES
-- -----------------------------------------

DESCRIBE Empleado;
DESCRIBE Departamento;
DESCRIBE Proyecto;

-- -----------------------------------------
-- INSERTING VALUES
-- -----------------------------------------

INSERT INTO Departamento VALUES(10, 'Contabilidad', 'New York');
INSERT INTO Departamento VALUES(20, 'Investigacion', 'Dallas');
INSERT INTO Departamento VALUES(30, 'Ventas', 'Chicago');
INSERT INTO Departamento VALUES(40, 'Operaciones', 'Boston');

INSERT INTO Empleado VALUES(7369, 'Smith', 'Ordenanza', 7902, TO_DATE('17-12-1980', 'DD-MM-YYYY'), 800, NULL, 20);
INSERT INTO Empleado VALUES(7499, 'Allen', 'Vendedor', 7698, TO_DATE('20-02-1981', 'DD-MM-YYYY'), 1600, 300, 30);
INSERT INTO Empleado VALUES(7521, 'Ward', 'Vendedor', 7698, TO_DATE('22-02-1981', 'DD-MM-YYYY'), 1250, 500, 30);
INSERT INTO Empleado VALUES(7566, 'Jones', 'Director', 7839, TO_DATE('02-04-1981', 'DD-MM-YYYY'), 2975, NULL, 20);
INSERT INTO Empleado VALUES(7654, 'Martin', 'Vendedor', 7698, TO_DATE('28-09-1981', 'DD-MM-YYYY'), 1250, 1400, 30);
INSERT INTO Empleado VALUES(7698, 'Blake', 'Directio', 7839, TO_DATE('01-05-1981', 'DD-MM-YYYY'), 2850, NULL, 30);
INSERT INTO Empleado VALUES(7782, 'Clark', 'Directio', 7839, TO_DATE('09-06-1981', 'DD-MM-YYYY'), 2450, NULL, 10);
INSERT INTO Empleado VALUES(7788, 'Scott', 'Analista', 7566, TO_DATE('09-12-1982', 'DD-MM-YYYY'), 3000, NULL, 20);
INSERT INTO Empleado VALUES(7839, 'King', 'Director', NULL, TO_DATE('17-11-1981', 'DD-MM-YYYY'), 5000, NULL, 10);
INSERT INTO Empleado VALUES(7844, 'Turner', 'Vendedor', 7698, TO_DATE('08-09-1981', 'DD-MM-YYYY'), 1500, 0, 30);
INSERT INTO Empleado VALUES(7876, 'Adams', 'Ordenanza', 7788, TO_DATE('12-01-1983', 'DD-MM-YYYY'), 1100, NULL, 20);
INSERT INTO Empleado VALUES(7900, 'James', 'Ordenanza', 7698, TO_DATE('03-12-1981', 'DD-MM-YYYY'), 950, NULL, 30);
INSERT INTO Empleado VALUES(7902, 'Ford', 'Analista', 7566, TO_DATE('03-12-1981', 'DD-MM-YYYY'), 3000, NULL, 20);
INSERT INTO Empleado VALUES(7934, 'Miller', 'Ordenanza', 7782, TO_DATE('23-01-1982', 'DD-MM-YYYY'), 1300, NULL, 10);

INSERT INTO Proyecto VALUES(1, 'Alfa', 96000);
INSERT INTO Proyecto VALUES(2, 'Beta', 82000);
INSERT INTO Proyecto VALUES(3, 'Gamma', 15000);


-- 3.

ALTER TABLE Empleado ADD numPro INT;
ALTER TABLE Empleado ADD CONSTRAINT fk_empleado_proyecto FOREIGN KEY(numPro) REFERENCES Proyecto(numProy);

DESCRIBE Empleado;

-- 4.

UPDATE Empleado
SET numPro = 1
WHERE numDep = 30 OR empleo = 'Vendedor';

SELECT * FROM Empleado;

-- 5.

UPDATE Empleado
SET numPro = 2
WHERE numDep <> 30 AND empleo <> 'Vendedor';

SELECT * FROM Empleado;

-- 6.

SELECT nombreEmp, empleo
FROM Empleado
ORDER BY nombreEmp ASC;

-- 7.

SELECT nombreEmp
FROM Empleado
WHERE numDep = 30;

-- 8.

SELECT *
FROM Empleado
WHERE empleo = 'Director' AND sueldo > 2800;

-- 9.

SELECT nombreEmp
FROM Empleado
WHERE empleo = 'Director' AND sueldo > 2800;

-- 10.

SELECT nombreEmp, numDep
FROM Empleado
WHERE empleo = 'Director' and numDep <> 30;

-- 11.

SELECT nombreEmp
FROM Empleado
WHERE sueldo BETWEEN 1200 AND 1400;

-- 12.

SELECT *
FROM Departamento
WHERE numDep IN (10, 30);

-- 13.

SELECT *
FROM Empleado
WHERE nombreEmp LIKE 'A%' OR nombreEmp LIKE 'a%';

-- 14.

SELECT *
FROM Empleado
WHERE numDep = 30
ORDER BY nombreEmp ASC;

-- 15.

SELECT *
FROM Empleado
ORDER BY empleo ASC, sueldo DESC;

-- 16.

SELECT DISTINCT empleo
FROM Empleado;

-- 17.

SELECT Departamento.ciudad
FROM Empleado
JOIN Departamento ON Empleado.numDep = Departamento.numDep
WHERE Empleado.numEmp = 7499;

-- 18.

SELECT Departamento.numDep, Departamento.nombreDep, MAX(Empleado.sueldo) AS sueldoMayor
FROM Empleado
JOIN Departamento ON Empleado.numDep = Departamento.numDep
GROUP BY Departamento.numDep, Departamento.nombreDep
ORDER BY sueldoMayor DESC;

-- 19.

SELECT Departamento.numDep, Departamento.nombreDep
FROM Empleado
JOIN Departamento ON Empleado.numDep = Departamento.numDep
GROUP BY Departamento.numDep, Departamento.nombreDep
HAVING MAX(Empleado.sueldo) < 4000;

-- 20.

SELECT *
FROM Empleado
WHERE empleo = (
    SELECT empleo
    FROM Empleado
    WHERE numEmp = 7566
);

-- 21.

SELECT *
FROM Empleado
WHERE sueldo > (
    SELECT AVG(sueldo)
    FROM Empleado
);

-- 22.

UPDATE Empleado
SET sueldo = sueldo + 100
WHERE empleo = 'Ordenanza';

SELECT * FROM Empleado;

-- 23.

INSERT INTO Departamento VALUES(30, 'Ventas', 'Chicago');