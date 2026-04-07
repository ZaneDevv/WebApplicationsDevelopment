-- -----------------------------------------
-- DROP TABLES
-- -----------------------------------------

DROP TABLE Empleado;
DROP TABLE Departamento;
DROP TABLE Proyecto;

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

-- -----------------------------------------
-- PACKAGES's HEAD
-- -----------------------------------------

CREATE OR REPLACE PACKAGE pkg_empleados AS
    PROCEDURE aumantar_salario(p_id_empleado IN NUMBER, p_porcentaje IN NUMBER);
    FUNCTION salario_anual(p_id_empleado IN NUMBER) RETURN NUMBER;
END pkg_empleados;

-- -----------------------------------------
-- PACKAGES' BODY
-- -----------------------------------------

CREATE OR REPLACE PACKAGE BODY pkg_empleados AS
    PROCEDURE aumantar_salario(p_id_empleado IN NUMBER, p_porcentaje IN NUMBER) IS
    BEGIN
        UPDATE Empleado
        SET sueldo = sueldo + (sueldo * p_porcentaje / 100)
        WHERE numEmp = p_id_empleado;
    END aumantar_salario;
    
    FUNCTION salario_anual(p_id_empleado IN NUMBER) RETURN NUMBER IS
        v_salario Empleado.sueldo%TYPE;
    
    BEGIN
        SELECT sueldo
        INTO v_salario
        FROM Empleado
        WHERE numEmp = p_id_empleado;
        
        RETURN v_salario * 12;
        
    EXCEPTION
        WHEN NO_DATA_FOUND THEN RETURN 0;
    END salario_anual;
END pkg_empleados;

-- -----------------------------------------
-- RUNNING IN PACKAGES
-- -----------------------------------------

BEGIN
  pkg_empleados.aumentar_salario(100, 10);
END;

SELECT pkg_empleados.salario_anual(100) FROM dual;