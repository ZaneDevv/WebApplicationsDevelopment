-- Álvaro Fernández Barrero
-- 2026/02/12
-- Baseball, Oracle

-- ------------------------------
-- CREATING TABLES
-- ------------------------------

CREATE TABLE PLAYERS(
    playerId INT,
    firstName VARCHAR2(30),
    lastName VARCHAR2(30),
    
    PRIMARY KEY(playerId)
);


CREATE TABLE STATS(
    playerId INT,
    year INT,
    ab INT,
    hits INT,
    hr INT,
    rbi INT,
    team VARCHAR2(5),
    
    PRIMARY KEY(playerId, year, team),
    FOREIGN KEY(playerId) REFERENCES PLAYERS(playerId)
);

-- ------------------------------
-- INSERTING VALUES
-- ------------------------------

INSERT INTO PLAYERS VALUES(1, 'Barry',  'Bonds');
INSERT INTO PLAYERS VALUES(2, 'Hank',  'Aaron');
INSERT INTO PLAYERS VALUES(3, 'Babe',  'Ruth');
INSERT INTO PLAYERS VALUES(4, 'Willie',  'Mays');
INSERT INTO PLAYERS VALUES(5, 'Sammy',  'Sosa');

INSERT INTO STATS VALUES(1, 2006, 367, 99, 26, 77, 'SFG');
INSERT INTO STATS VALUES(1, 2007, 340, 94, 28, 66, 'SFG');
INSERT INTO STATS VALUES(2, 1954, 468, 131, 13, 69, 'MLN');
INSERT INTO STATS VALUES(2, 1955, 602, 189, 27, 106, 'MLN');
INSERT INTO STATS VALUES(2, 1956, 609, 200, 26, 02, 'MLN');

-- ------------------------------
-- QUERIES
-- ------------------------------

-- 1.- First, let's look at a query that simply lists data from three selected columns in the STATS table

SELECT playerId, year, team
FROM STATS;

-- 2.- Lists only those seasons in which the player had more than 50 home runs

SELECT *
FROM STATS
WHERE hr > 50;

-- 3.- Sort the query number 2 from high to low. To do that, we need to add an ORDER BY clause

SELECT *
FROM STATS
WHERE hr > 50
ORDER BY hr DESC;

-- 4.- The names from the PLAYERS table and the year and HR count from the STATS table for the 50+ HR subset.

SELECT p.firstName, s.year, COUNT(s.hr)
FROM PLAYERS p
JOIN STATS s ON s.playerId = p.playerId
WHERE s.hr >= 50
GROUP BY s.playerId, s.year, p.firstName;

-- 5.- Player's career home run total.

SELECT p.playerId, p.firstName, SUM(s.hr) AS totalHr
FROM PLAYERS p
JOIN STATS s ON s.playerId = p.playerId
GROUP BY p.playerId, p.firstName, s.playerId;