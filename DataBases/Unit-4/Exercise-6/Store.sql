-- 2025/11/19
-- Álvaro Fernández Barrero

-- Creating database

CREATE DATABASE IF NOT EXISTS Store;
USE Store;


-- Creating table articles

DROP TABLE IF EXISTS Articles;
CREATE TABLE IF NOT EXISTS Articles(
	code INT,
	name VARCHAR(20),
	description VARCHAR(30),
	price FLOAT,
	PRIMARY KEY(code)
);
DESCRIBE Articles;

INSERT INTO Articles(code, name, description, price) VALUES (1, "Printer", "Epson Stylus C45", 400.80),
                                                            (2, "Printer", "Epson Stylus C85", 500),
                                                            (3, "Monitor", "samsung 14, 800);

SELECT * FROM Articles;
SELECT name, description, prince FROM Articles;
