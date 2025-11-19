-- 2025/11/19
-- Álvaro Fernández Barrero


-- Creating database

CREATE DATABASE IF NOT EXISTS Friends;
USE Friends;


-- Creating table "agenda"

DROP TABLE IF EXISTS Agenda;
CREATE TABLE Agenda(
	name VARCHAR(20),
	dwelling VARCHAR(30),
	phone VARCHAR(11)
);
SHOW TABLES;
DESCRIBE Agenda;
DROP TABLE IF EXISTS Agenda;


-- Creating table "books"

DROP TABLE IF EXISTS Books;
CREATE TABLE Books(
	title VARCHAR(20),
	author VARCHAR(30),
	editorial VARCHAR(15)
);
SHWO TABLES;
DESCRIBE Books;
DROP TABLE IF EXISTS Books;
