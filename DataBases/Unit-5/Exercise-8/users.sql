-- Álvaro Fernández Barrero
-- 1º DAW
-- 2026/02/17

-- -----------------------------------------
-- TABLESPACE
-- -----------------------------------------

CREATE TABLESPACE TB_TEST
DATAFILE './tb_test.dat' SIZE 100M
DEFAULT STORAGE(INITIAL 100K NEXT 100K)
ONLINE
PERMANENT;

-- -----------------------------------------
-- USER
-- -----------------------------------------

CREATE USER test_mysql -- > Username
IDENTIFIED BY mysql1123 -- > Password
DEFAULT TABLESPACE users;

-- -----------------------------------------
-- PERMISSIONS
-- -----------------------------------------

GRANT CREATE SESSION TO test_mysql;
GRANT CREATE TABLE TO test_mysql;
GRANT DBA TO test_mysql;