-- Álvaro Fernández Barrero
-- 1º DAW
-- 2026/02/26

SELECT * FROM dba_pro;
SELECT * FROM dba_users;
SELECT * FROM dba_role_privs;
SELECT * FROM dba_tab_privs;
SELECT * FROM dba_sys_privs;

DESCRIBE dba_pro;
DESCRIBE dba_users;
DESCRIBE dba_role_privs;
DESCRIBE dba_tab_privs;
DESCRIBE dba_sys_privs;

-- -----------------------------------------
-- TABLESPACE
-- -----------------------------------------

CREATE TABLESPACE temp
DATAFILE './temp.dat' SIZE 0K
DEFAULT STORAGE(INITIAL 100K NEXT 100K)
ONLINE
TEMPORARY;


CREATE TABLESPACE nomina
DATAFILE '/u02/oradata/db0.dat' SIZE 1M
DEFAULT STORAGE(INITIAL 16K NEXT 16K)
ONLINE
PERMANENT;


CREATE TABLESPACE academo
DATAFILE '/u02/oradata/db0.dat' SIZE 1M
DEFAULT STORAGE(INITIAL 16K NEXT 16K)
ONLINE
PERMANENT;

CREATE TABLESPACE temp_nomina
DATAFILE '/u04/oradata/db0.dat' SIZE 1M
DEFAULT STORAGE(INITIAL 500K NEXT 16K)
ONLINE
TEMPORARY;


CREATE TABLESPACE temp_academo
DATAFILE '/u04/oradata/db0.dat' SIZE 1M
DEFAULT STORAGE(INITIAL 500K NEXT 16K)
ONLINE
TEMPORARY;

-- -----------------------------------------
-- USERS
-- -----------------------------------------

CREATE USER administrator
IDENTIFIED BY admins
DEFAULT TABLESPACE USERS
QUOTA 500K ON USERS
TEMPORARY TABLESPACE temp;

SELECT *
FROM dba_sys_privs
WHERE grantee = 'administrator';

SELECT *
FROM dba_role_privs
WHERE grantee = 'administrator';


GRANT CREATE SESSION TO administrator;
GRANT CREATE USER TO administrator;