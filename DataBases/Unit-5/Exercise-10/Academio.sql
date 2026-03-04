CREATE TABLE CODIGOS(
	CODIGO varchar2(3),
	DESCRIPCION varchar2(20)
);

TABLESPACE ACADEMO
STORAGE (INITIAL 64K NEXT 64K MINEXT ENTS 5 MAXEXTENTS 10);

-- -----------------------------------------
-- ROLES
-- -----------------------------------------

CREATE ROLE administrador;