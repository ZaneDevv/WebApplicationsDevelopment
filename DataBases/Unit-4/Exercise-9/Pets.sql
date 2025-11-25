-- 2025/11/25
-- Álvaro Fernández Barrero


-- Creating database

CREATE DATABASE IF NOT EXISTS Animals;
USE Animals;



-- Creating table

DROP TABLE IF EXISTS Pets;
CREATE TABLE IF NOT EXISTS Pets(
	name VARCHAR(10),
	owner VARCHAR(15),
	specie VARCHAR(10),
	genre CHAR(1) CHECK (genre IN ("f", "m")),
	birth_date DATE,
	dead_date DATE
);
ALTER TABLE Pets ADD CONSTRAINT CHECK (genre IN ("f", "m"));

DESCRIBE Pets;


-- Inserting values

INSERT INTO Pets(name, owner, specie, genre, birth_date, dead_date) VALUES ("Fluffy", "Arnoldo", "Cat", "f", "1999-02-04", NULL),
                                                                           ("Mau", "Juan", "Cat", "m", "1998-03-17", NULL),
                                                                           ("Buffy", "Arnoldo", "Dog", "f", "1999-05-13", NULL),
                                                                           ("FanFan", "Benito", "Dog", "m", "2000-08-27", NULL),
                                                                           ("Kaiser", "Diana", "Dog", "m", "1997-07-29", "1998-08-31"),
                                                                           ("Chispa", "Omar", "Bird", "f", "1998-09-11", NULL),
                                                                           ("Wicho", "Tomas", "Bird", NULL, "2000-02-09", NULL),
                                                                           ("Skim", "Benito", "Snake", "m", "2001-04-29", NULL);
SELECT * FROM Pets;


UPDATE Pets SET birth_date = "1989-08-31" WHERE name = "Kaiser";
SELECT * FROM Pets WHERE name = "Kaiser";


SELECT * FROM Pets WHERE birth_date >= "2000-01-01";
SELECT name, owner FROM Pets WHERE genre = "f" AND specie = "Dog";
SELECT name, owner FROM Pets where genre = "f" AND (specie = "Cat" OR specie = "Dog");
SELECT name, birth_date FROM Pets;
SELECT owner FROM Pets;
SELECT birth_date FROM Pets WHERE specie = "Cat" OR specie = "Dog";
SELECT name FROM Pets ORDER BY birth_date DESC;
SELECT name FROM Pets ORDER BY specie, birth_date ASC;
SELECT * FROM Pets WHERE name LIKE "B%";
SELECT * FROM Pets WHERE name LIKE "%fy";