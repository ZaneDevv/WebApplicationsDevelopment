-- 2025/11/19
-- Álvaro Fernández Barrero


-- Creating database

CREATE DATABASE UsersDB;
USE UsersDB;


-- Creating table users

DROP TABLE IF EXISTS Users;
CREATE TABLE IF NOT EXISTS Users(
	name VARCHAR(30),
	user_key VARCHAR(10)
);

INSERT INTO Users(name, key) VALUES ("MarioPerez", "Marito"); 
SELECT name, user_key FROM Users;


-- Creating table agenda

DROP TABLE IF EXISTS Agenda;
CREATE TABLE IF NOT EXISTS Agenda(
	name VARCHAR(20),
	dwelling VARCHAR(30),
	phone_number VARCHAR(11)
);
SHOW TABLES;
DESCRIBE AGENDA;

INSERT INTO Agenda(name, dwelling, phone_number) VALUES ("Alberto Mores", "Colon 123", "4234567"),
                                                        ("Juan Torres", "Avellaneda 135", "4458787");
SELECT * FROM Agenda;

DROP TABLE IF EXISTS Agenda;


-- Creating table books

DROP TABLE IF EXISTS Books;
CREATE TABLE IF NOT EXISTS Books(
	title VARCHAR(20),
	author VARCHAR(30),
	editorial VARCHAR(15)
);
SHOW TABLES;
DESCRIBE Books;

INSERT INTO Books(title, author, editorial) VALUES ("El aleph", "Borges", "Planet"),
                                                   ("Martin Fierro", "Jose Hernandez", "Emece");
                                                   ("Learn PHP", "Mario Molina", "Emece");
SELECT * FROM Books;
