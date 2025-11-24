-- 2025/11/19
-- Álvaro Fernández Barrero


-- Creating database

CREATE DATABASE IF NOT EXISTS Videclub;
USE Videoclub;


-- Creating table movies

DROP TABLE IF EXISTS Movies;
CREATE TABLE IF NOT EXISTS Movies(
	title VARCHAR(20),
	actor VARCHAR(20),
	duration INTEGER,
	copies_amount INTEGER
); 
DESCRIBE Movies;

INSERT INTO Movies(title, actor, duration, copies_amount) VALUES ("Impossible mission", "Tom Cruise", 120, 3),
                                                                ("Impossible mission 2", "Tom Cruise", 180, 2),
                                                                ("Beautiful woman", "Julia R.", 90, 3),
                                                                ("Elsa y Fred", "China Zorrilla", 90, 2);

SELECT title, actor FROM Movies;
SELECT title, duration FROM Movies;
SELECT title, copies_amount FROM Movies;
