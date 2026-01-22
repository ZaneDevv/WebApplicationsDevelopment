-- Álvaro Fernández Barrero
-- 2026/01/21

-- ---------------------------------
--  Creating database
-- ---------------------------------

DROP DATABASE IF EXISTS Club;
CREATE DATABASE Club;
USE Club;

-- ---------------------------------
-- Creating tables
-- ---------------------------------

DROP TABLE IF EXISTS Members;
CREATE TABLE Members (
	documento CHAR(8) NOT NULL,
	nombre VARCHAR(40),
	domicilio VARCHAR(30),
	PRIMARY KEY (documento)
);

DROP TABLE IF EXISTS Teachers;
CREATE TABLE Teachers (
	documento CHAR(8) NOT NULL,
	nombre VARCHAR(40),
	domicilio VARCHAR(30),
	PRIMARY KEY (documento)
);

DROP TABLE IF EXISTS Courses;
CREATE TABLE Courses (
	numero INTEGER AUTO_INCREMENT,
	deporte VARCHAR(20),
	dia VARCHAR(15),
	documentoprofesor CHAR(8),
	PRIMARY KEY (numero)
);

DROP TABLE IF EXISTS Enrollments;
CREATE TABLE Enrollments (
	documentosocio CHAR(8) NOT NULL,
	numero INTEGER NOT NULL,
	matricula CHAR(1),
	PRIMARY KEY (documentosocio, numero)
);

-- ---------------------------------
-- Inserting data
-- ---------------------------------

INSERT INTO Members VALUES ('30000000', 'Fabian Fuentes', 'Caseros 987');
INSERT INTO Members VALUES ('31111111', 'Gaston Garcia', 'Guemes 65');
INSERT INTO Members VALUES ('32222222', 'Hector Huerta', 'Sucre 534');
INSERT INTO Members VALUES ('33333333', 'Ines Irala', 'Bulnes 345');

INSERT INTO Teachers VALUES ('22222222', 'Ana Acosta', 'Avellaneda 231');
INSERT INTO Teachers VALUES ('23333333', 'Carlos Caseres', 'Colon 245');
INSERT INTO Teachers VALUES ('24444444', 'Daniel Duarte', 'Sarmiento 987');
INSERT INTO Teachers VALUES ('25555555', 'Esteban Lopez', 'Sucre 1204');

INSERT INTO Courses (deporte, dia, documentoprofesor) VALUES ('tennis', 'monday', '22222222');
INSERT INTO Courses (deporte, dia, documentoprofesor) VALUES ('tennis', 'tuesday', '22222222');
INSERT INTO Courses (deporte, dia, documentoprofesor) VALUES ('swimming', 'wednesday', '22222222');
INSERT INTO Courses (deporte, dia, documentoprofesor) VALUES ('swimming', 'thursday', '23333333');
INSERT INTO Courses (deporte, dia, documentoprofesor) VALUES ('swimming', 'friday', '23333333');
INSERT INTO Courses (deporte, dia, documentoprofesor) VALUES ('football', 'saturday', '24444444');
INSERT INTO Courses (deporte, dia, documentoprofesor) VALUES ('football', 'monday', '24444444');
INSERT INTO Courses (deporte, dia, documentoprofesor) VALUES ('basketball', 'tuesday', '24444444');

INSERT INTO Enrollments VALUES ('30000000', 1, 's');
INSERT INTO Enrollments VALUES ('30000000', 3, 'n');
INSERT INTO Enrollments VALUES ('30000000', 6, NULL);
INSERT INTO Enrollments VALUES ('31111111', 1, 's');
INSERT INTO Enrollments VALUES ('31111111', 4, 's');
INSERT INTO Enrollments VALUES ('32222222', 8, 's');

-- ---------------------------------
-- Altering tables
-- ---------------------------------

ALTER TABLE Enrollments ADD FOREIGN KEY (numero) REFERENCES Courses(numero);
ALTER TABLE Enrollments ADD FOREIGN KEY (documentosocio) REFERENCES Members(documento);
ALTER TABLE Courses ADD FOREIGN KEY (documentoprofesor) REFERENCES Teachers(documento);

-- ---------------------------------
-- View
-- ---------------------------------

DROP VIEW IF EXISTS view_club;


CREATE OR REPLACE VIEW view_club
AS SELECT Members.nombre AS member_name,
          Members.documento AS member_document,
          Teachers.nombre AS teacher_name,
          Courses.dia AS course_day,
          Courses.deporte AS course_sport
FROM Members, Teachers, Courses, Enrollments
WHERE Members.documento = Enrollments.documentosocio
      AND Courses.documentoprofesor = Teachers.documento
      AND Enrollments.numero = Courses.numero;


SELECT * FROM view_club;


SELECT course_sport, COUNT(teacher_name) AS teachers_amount
FROM view_club
GROUP BY course_sport
ORDER BY COUNT(teacher_name) DESC;


SELECT teacher_name, course_day
FROM view_club;


SELECT DISTINCT member_name
FROM view_club
WHERE course_day = 'monday' AND course_sport = 'tennis';


DROP VIEW IF EXISTS view_enrollments;

CREATE OR REPLACE VIEW view_enrollments
AS SELECT Courses.numero AS course_number, Courses.deporte AS course_name, COUNT(Members.documento) AS member_amount
FROM Members, Teachers, Courses, Enrollments
WHERE Members.documento = Enrollments.documentosocio
      AND Courses.documentoprofesor = Teachers.documento
      AND Enrollments.numero = Courses.numero
GROUP BY Courses.numero;

SELECT * FROM view_enrollments;