-- Álvaro Fernández Barrero
-- 1º DAW
-- 2026/02/26

SELECT * FROM SYS.dba_procedures;
SELECT * FROM SYS.dba_users;
SELECT * FROM SYS.dba_role_privs;
SELECT * FROM SYS.dba_tab_privs;
SELECT * FROM SYS.dba_sys_privs;

DESCRIBE SYS.dba_pro;
DESCRIBE SYS.dba_users;
DESCRIBE SYS.dba_role_privs;
DESCRIBE SYS.dba_tab_privs;
DESCRIBE SYS.dba_sys_privs;

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
GRANT CONNECT TO administrator;

SHOW USER;


CREATE USER test00
IDENTIFIED BY tester
DEFAULT TABLESPACE USERS
TEMPORARY TABLESPACE temp
QUOTA 0K ON USERS;