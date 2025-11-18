CREATE DATABASE Animals;
ALTER DATABASE Animals READ ONLY = 0;
USE Animals;
CREATE TABLE Ducks(
	id INT PRIMARY KEY,
	name VARCHAR(20),
	birth DATE
);
INSERT INTO Ducks VALUES (0, "Echo", "2022-02-21");
                         (1, "Bill", "2023-07-17"),
                         (2, "Jasper", "2021-11-06"),
                         (3, "Mabel", "2023-05-29");
SELECT * FROM Ducks;
