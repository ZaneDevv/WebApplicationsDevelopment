-- 2025/11/25
-- Álvaro Fernández Barrero


-- Creating database

CREATE DATABASE IF NOT EXISTS Animals;
USE Animals;



-- Creating table Pets

DROP TABLE IF EXISTS Pets;
CREATE TABLE IF NOT EXISTS Pets(
	name VARCHAR(20),
	genre CHAR(1) CHECK (genre IN ("f", "m")),
	specie VARCHAR(30),
	birth_date DATE
);

ALTER TABLE Pets ADD COLUMN id INT AUTO_INCREMENT;
ALTER TABLE Pets ADD CONSTRAINT PRIMARY KEY(id);
ALTER TABLE Pets ADD CONSTRAINT CHECK (genre IN ("f", "m"));

DESCRIBE Pets;



-- Creating table Clients

DROP TABLE IF EXISTS Clients;
CREATE TABLE IF NOT EXISTS Clients(
	id INT UNSIGNED AUTO_INCREMENT,
	name VARCHAR(20),
	age INT,
	weight INT,
	genre CHAR(1)
);

ALTER TABLE Clients ADD CONSTRAINT PRIMARY KEY(id);
ALTER TABLE Clients ADD CONSTRAINT CHECK (genre IN ("f", "m"));



-- Inserting values

INSERT INTO Pets(name, genre, specie, birth_date, id) VALUES ("Tango", "m", "dog", "2020-12-12", 1),
                                                             ("Dinki", "f", "dog", "2023-12-13", 2),
                                                             ("Valentino", "f", "cat", "2022-6-15", 3);

INSERT INTO Clients(name, age, weight, genre) VALUES ("Pepe", 45, 70, "m"),
                                                     ("Maria", 46, 55, "f"),
                                                     ("Ana", 25, 60, "f");
UPDATE Clients SET age = 36 WHERE id = 2;



-- Selecting from tables

SELECT * FROM Pets;
SELECT name, genre FROM PETS WHERE genre="f" AND specie="dog";
SELECT * FROM Pets WHERE name LIKE "%o";
SELECT * FROM Pets WHERE name LIKE "C%";
SELECT * FROM Pets WHERE name LIKE "C%a";

SELECT name, age FROM Clients;
SELECT name, age FROM Clients WHERE genre = "f" AND age > 40;
SELECT name, age, weight FROM Clients WHERE genre = "m" AND weight > 60 AND age > 40;