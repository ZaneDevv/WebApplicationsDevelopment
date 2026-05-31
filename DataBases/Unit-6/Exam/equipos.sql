-- Álvaro Fernández Barrero
-- 1º DAW BIL
-- Portátil 18

-- -----------------------------------------
-- CREACIÓN DE TABLAS
-- -----------------------------------------

CREATE TABLE PARTIDOS(
  CODIGO NUMBER,
  EQUIPO_LOCAL VARCHAR2(20),
  EQUIPO_VISITANTE VARCHAR2(20),
  PUNTOS_LOCAL NUMBER,
  PUNTOS_VISITANTE NUMBER,
  TEMPORADA VARCHAR2(5)
);

CREATE TABLE EQUIPOS(
  NOMBRE VARCHAR2(20),
  CIUDAD VARCHAR2(20),
  CONFERENCIA VARCHAR2(4),
  DIVISION VARCHAR2(9)
);

CREATE TABLE ESTADISTICAS(
  TEMPORADA VARCHAR2(5),
  JUGADOR NUMBER,
  PUNTOS_POR_PARTIDO FLOAT(126),
  ASISTENCIAS_POR_PARTIDO FLOAT(126),
  TAPONES_POR_PARTIDO FLOAT(126),
  REBOTES_POR_PARTIDO FLOAT(126)
);

CREATE TABLE JUGADORES(
  CODIGO NUMBER,
  NOMBRE VARCHAR2(30),
  PROCEDENCIA VARCHAR2(20),
  ALTURA VARCHAR2(4),
  PESO NUMBER,
  POSICION VARCHAR2(5),
  NOMBRE_EQUIPO VARCHAR2(20)
);

-- -----------------------------------------
-- CLAVES
-- -----------------------------------------

ALTER TABLE PARTIDOS ADD CONSTRAINT pk_partidos PRIMARY KEY(CODIGO);
ALTER TABLE EQUIPOS ADD CONSTRAINT pk_equipos PRIMARY KEY(NOMBRE);
ALTER TABLE ESTADISTICAS ADD CONSTRAINT pk_estadisticas PRIMARY KEY(TEMPORADA, JUGADOR);
ALTER TABLE JUGADORES ADD CONSTRAINT pk_jugadores PRIMARY KEY(CODIGO);

ALTER TABLE PARTIDOS ADD CONSTRAINT fk_partidos_equipos0 FOREIGN KEY(EQUIPO_LOCAL) REFERENCES EQUIPOS(NOMBRE);
ALTER TABLE PARTIDOS ADD CONSTRAINT fk_partidos_equipos1 FOREIGN KEY(EQUIPO_VISITANTE) REFERENCES EQUIPOS(NOMBRE);

ALTER TABLE ESTADISTICAS ADD CONSTRAINT fk_estadisticas_jugadores FOREIGN KEY(JUGADOR) REFERENCES JUGADORES(CODIGO);

ALTER TABLE JUGADORES ADD CONSTRAINT fk_jugadores_equipos FOREIGN KEY(NOMBRE_EQUIPO) REFERENCES EQUIPOS(NOMBRE);

-- -----------------------------------------
-- INSERTS
-- -----------------------------------------

INSERT INTO equipos VALUES ('Celtics','Boston','East','Atlantic');
INSERT INTO equipos VALUES ('Raptors','Toronto','East','Atlantic');
INSERT INTO equipos VALUES ('76ers','Philadelphia','East','Atlantic');
INSERT INTO equipos VALUES ('Nets','New Jersey','East','Atlantic');
INSERT INTO equipos VALUES ('Knicks','New York','East','Atlantic');
INSERT INTO equipos VALUES ('Pistons','Detroit','East','Central');
INSERT INTO equipos VALUES ('Cavaliers','Cleveland','East','Central');
INSERT INTO equipos VALUES ('Pacers','Indiana','East','Central');
INSERT INTO equipos VALUES ('Bulls','Chicago','East','Central');
INSERT INTO equipos VALUES ('Bucks','Milwaukee','East','Central');
INSERT INTO equipos VALUES ('Magic','Orlando','East','SouthEast');
INSERT INTO equipos VALUES ('Wizards','Washington','East','SouthEast');
INSERT INTO equipos VALUES ('Hawks','Atlanta','East','SouthEast');
INSERT INTO equipos VALUES ('Bobcats','Charlotte','East','SouthEast');
INSERT INTO equipos VALUES ('Heat','Miami','East','SouthEast');
INSERT INTO equipos VALUES ('Jazz','Utah','West','NorthWest');
INSERT INTO equipos VALUES ('Nuggets','Denver','West','NorthWest');
INSERT INTO equipos VALUES ('Trail Blazers','Portland','West','NorthWest');
INSERT INTO equipos VALUES ('Timberwolves','Minnesota','West','NorthWest');
INSERT INTO equipos VALUES ('Supersonics','Seattle','West','NorthWest');
INSERT INTO equipos VALUES ('Lakers','Los Angeles','West','Pacific');
INSERT INTO equipos VALUES ('Suns','Phoenix','West','Pacific');
INSERT INTO equipos VALUES ('Warriors','Golden State','West','Pacific');
INSERT INTO equipos VALUES ('Kings','Sacramento','West','Pacific');
INSERT INTO equipos VALUES ('Clippers','Los Angeles','West','Pacific');
INSERT INTO equipos VALUES ('Hornets','New Orleans','West','SouthWest');
INSERT INTO equipos VALUES ('Spurs','San Antonio','West','SouthWest');
INSERT INTO equipos VALUES ('Rockets','Houston','West','SouthWest');
INSERT INTO equipos VALUES ('Mavericks','Dallas','West','SouthWest');
INSERT INTO equipos VALUES ('Grizzlies','Memphis','West','SouthWest');



INSERT INTO jugadores VALUES (1,'Corey Brever','Florida','6-9',185,'F-G','Timberwolves');
INSERT INTO jugadores VALUES (2,'Greg Buckner','Clemson','6-4',210,'G-F','Timberwolves');
INSERT INTO jugadores VALUES (3,'Michael Doleac','Utah','6-11',262,'C','Timberwolves');
INSERT INTO jugadores VALUES (4,'Randy Foye','Villanova','6-4',213,'G','Timberwolves');
INSERT INTO jugadores VALUES (5,'Ryan Gomes','Providence','6-7',250,'F','Timberwolves');
INSERT INTO jugadores VALUES (6,'Marko Jaric','Serbia','6-7',224,'G','Timberwolves');
INSERT INTO jugadores VALUES (7,'Al Jefferson','Prentiss Hs','6-10',265,'C-F','Timberwolves');
INSERT INTO jugadores VALUES (8,'Mark Madsen','Stanford','6-9',250,'C-F','Timberwolves');
INSERT INTO jugadores VALUES (9,'Rashard McCants','North Carolina','6-4',21,'G','Timberwolves');
INSERT INTO jugadores VALUES (10,'Chris Richard ','Florida','6-9',270,'F','Timberwolves');
INSERT INTO jugadores VALUES (11,'Craig Smith','Boston College','6-8',250,'F-C','Timberwolves');
INSERT INTO jugadores VALUES (12,'Kirk Snyder','Nevada-Reno','6-6',225,'G','Timberwolves');
INSERT INTO jugadores VALUES (13,'Sebastian Telfair','Abraham Lincoln HS','6-0',175,'G','Timberwolves');
INSERT INTO jugadores VALUES (14,'Antoine Walker','Kentucky','6-9',245,'F','Timberwolves');
INSERT INTO jugadores VALUES (21,'Elton brand','duke','6-8',254,'F','Clippers');
INSERT INTO jugadores VALUES (22,'Paul Davis','Michigan','6-11',270,'c','Clippers');
INSERT INTO jugadores VALUES (23,'Dan Dickau','Gonzaga','6-0',180,'G','Clippers');
INSERT INTO jugadores VALUES (24,'Nick Fazekas','Nevada-Reno','6-11',235,'F','Clippers');
INSERT INTO jugadores VALUES (25,'Chris Kaman','Central Michigan','7-0',265,'C','Clippers');
INSERT INTO jugadores VALUES (26,'Brevin Knight','Stanford','5-10',170,'G','Clippers');
INSERT INTO jugadores VALUES (27,'Shaun Livingston','Peoria Central','6-7',182,'G','Clippers');
INSERT INTO jugadores VALUES (28,'Corey Maggette','duke','6-6',225,'F','Clippers');
INSERT INTO jugadores VALUES (29,'Cuttino Mobley','Rhode Island','6-4',215,'G','Clippers');
INSERT INTO jugadores VALUES (30,'Smush Parker','Fordham','6-4',190,'G','Clippers');
INSERT INTO jugadores VALUES (31,'Josh Powell','North Carolina State','6-9',240,'C-F','Clippers');
INSERT INTO jugadores VALUES (32,'Quinton Ross','Southern Methodist','6-6',193,'G-F','Clippers');
INSERT INTO jugadores VALUES (33,'Tim Thomas','Villanova','6-10',240,'F','Clippers');
INSERT INTO jugadores VALUES (34,'al thornton','Florida State','6-8',220,'F','Clippers');
INSERT INTO jugadores VALUES (35,'Marcus Williams','Arizona','6-7',207,'F','Clippers');
INSERT INTO jugadores VALUES (41,'Andre Brown','De Paul','6-9',245,'F','Grizzlies');
INSERT INTO jugadores VALUES (42,'Kwame Brown','Glynn Academy','6-11',270,'C','Grizzlies');
INSERT INTO jugadores VALUES (43,'Brian Cardinal','Purdue','6-8',245,'F','Grizzlies');
INSERT INTO jugadores VALUES (44,'Jason Collins','Stanford','7-0',255,'C-F','Grizzlies');
INSERT INTO jugadores VALUES (45,'Mike Conley','Ohio State','6-1',180,'G','Grizzlies');
INSERT INTO jugadores VALUES (46,'Javaris Crittenton','Georgia Tech','6-5',200,'G','Grizzlies');
INSERT INTO jugadores VALUES (47,'Rudy Gay','Connecticut','6-8',222,'F','Grizzlies');
INSERT INTO jugadores VALUES (48,'Casey Jacobsen','Stanford','6-6',215,'g','Grizzlies');
INSERT INTO jugadores VALUES (49,'Kyle Lowry','Villanova','6-0',175,'G','Grizzlies');
INSERT INTO jugadores VALUES (50,'Aaron Mckie','Temple','6-5',209,'G','Grizzlies');
INSERT INTO jugadores VALUES (51,'Darko Milicic','Serbia Montenegro','7-0',275,'C-F','Grizzlies');
INSERT INTO jugadores VALUES (52,'Mike Miller','Florida','6-8',218,'G-F','Grizzlies');
INSERT INTO jugadores VALUES (53,'Juan Carlos Navarro','Spain','6-3',170,'G','Grizzlies');
INSERT INTO jugadores VALUES (54,'Hakim Warrick','Syracuse','6-9',215,'F','Grizzlies');
INSERT INTO jugadores VALUES (61,'Trevor Ariza','UCLA','6-8',210,'F','Lakers');
INSERT INTO jugadores VALUES (62,'Kobe Bryant','Lower Merion HS (PA)','6-6',205,'G','Lakers');
INSERT INTO jugadores VALUES (63,'Andrew Bynum','St. Joseph HS (NJ)','7-0',285,'C','Lakers');
INSERT INTO jugadores VALUES (64,'Jordan Farmar','UCLA','6-2',180,'G','Lakers');
INSERT INTO jugadores VALUES (65,'Derek Fisher','Arkansas-Little Rock','6-1',210,'G','Lakers');
INSERT INTO jugadores VALUES (66,'Pau Gasol','Spain','7-0',250,'F-C','Lakers');
INSERT INTO jugadores VALUES (67,'Didier Ilunga-Mbenga','Congo','7-0',255,'C','Lakers');
INSERT INTO jugadores VALUES (68,'Coby Karl','Boise State','6-5',215,'G','Lakers');
INSERT INTO jugadores VALUES (69,'Chris Mihm','Texas','7-0',265,'C','Lakers');
INSERT INTO jugadores VALUES (70,'Ira Newble','Miami(Ohia)','6-7',220,'G-F','Lakers');
INSERT INTO jugadores VALUES (71,'Lamar Odom','Rhode Island','6-10',230,'F','Lakers');
INSERT INTO jugadores VALUES (72,'Vladimir Radmanovic','Serbia Montenegro','6-10',235,'F','Lakers');
INSERT INTO jugadores VALUES (73,'Ronny Turiaf','Gonzaga','6-10',250,'F-C','Lakers');
INSERT INTO jugadores VALUES (74,'Sasha Vujacic','Slovenia','6-7',205,'G','Lakers');
INSERT INTO jugadores VALUES (75,'Luke Walton','Arizona','6-8',235,'F','Lakers');
INSERT INTO jugadores VALUES (81,'Andrea Bargnani','Italy','7-0',250,'C-F','Raptors');
INSERT INTO jugadores VALUES (82,'Maceo Baston','Michigan','6-10',230,'C-F','Raptors');
INSERT INTO jugadores VALUES (84,'Primoz Brezec','Slovenia','7-1',255,'C','Raptors');
INSERT INTO jugadores VALUES (85,'Jose Calderon','Spain','6-3',210,'G','Raptors');
INSERT INTO jugadores VALUES (86,'Carlos Delfino','Argentina','6-6',230,'G','Raptors');
INSERT INTO jugadores VALUES (87,'T.J. Ford','Texas','6-0',165,'G','Raptors');
INSERT INTO jugadores VALUES (88,'Jorge Garbajosa','Spain','6-9',245,'F','Raptors');
INSERT INTO jugadores VALUES (89,'Joey Graham','Oklahoma State','6-7',225,'F','Raptors');
INSERT INTO jugadores VALUES (90,'Kris Humphries','Minnesota','6-9',235,'F','Raptors');
INSERT INTO jugadores VALUES (91,'Linton Johnson III','Tulane','6-8',205,'F','Raptors');
INSERT INTO jugadores VALUES (92,'Jason Kapono','UCLA','6-8',215,'F','Raptors');
INSERT INTO jugadores VALUES (93,'Jamario Moon','Merdian CC (MS)','6-8',205,'F','Raptors');
INSERT INTO jugadores VALUES (94,'Rasho Nesterovic','Slovenia','7-0',255,'C','Raptors');
INSERT INTO jugadores VALUES (95,'Anthony Parker','Bradley','6-6',215,'G-F','Raptors');
INSERT INTO jugadores VALUES (100,'Renaldo Balkman','South Carolina','6-8',202,'F','Knicks');
INSERT INTO jugadores VALUES (101,'Wilson Chandler','DePaul','6-8',220,'F','Knicks');
INSERT INTO jugadores VALUES (102,'Mardy Collins','Temple','6-6',220,'G','Knicks');
INSERT INTO jugadores VALUES (103,'Jamal Crawford','Michigan','6-5',220,'G','Knicks');
INSERT INTO jugadores VALUES (104,'Eddy Curry','Thornwood HS','6-11',285,'C','Knicks');
INSERT INTO jugadores VALUES (105,'Jerome James','Florida AM','7-1',285,'C','Knicks');
INSERT INTO jugadores VALUES (106,'Jared Jeffries','Indiana','6-11',240,'F','Knicks');
INSERT INTO jugadores VALUES (107,'Fred Jones','Oregon','6-2',225,'G','Knicks');
INSERT INTO jugadores VALUES (108,'David Lee','Florida','6-9',240,'F','Knicks');
INSERT INTO jugadores VALUES (109,'Stephon Marbury','Georgia Tech','6-2',205,'G','Knicks');
INSERT INTO jugadores VALUES (110,'Randolph Morris','Kentucky','6-11',260,'C','Knicks');
INSERT INTO jugadores VALUES (111,'Zach Randolph','Michigan State','6-9',260,'F','Knicks');
INSERT INTO jugadores VALUES (112,'Quentin Richardson','DePaul','6-6',235,'F-G','Knicks');
INSERT INTO jugadores VALUES (113,'Nate Robinson','Washington','5-9',180,'G','Knicks');
INSERT INTO jugadores VALUES (114,'Malik Rose','Drexel','6-7',255,'F','Knicks');

INSERT INTO estadisticas VALUES ('03/04',283,5.9,2.2,1.54,1.6);
INSERT INTO estadisticas VALUES ('04/05',283,4.6,1.8,0.98,1.6);
INSERT INTO estadisticas VALUES ('05/06',283,12,4.7,2.4,2.9);
INSERT INTO estadisticas VALUES ('06/07',283,4.9,1.3,0.89,0.8);
INSERT INTO estadisticas VALUES ('05/06',85,5.5,4.5,0.1,2.2);
INSERT INTO estadisticas VALUES ('06/07',85,8.7,5,0.1,1.7);
INSERT INTO estadisticas VALUES ('07/08',283,9.5,3,1.33,2.1);
INSERT INTO estadisticas VALUES ('07/08',85,11.6,8.2,0.1,2.9);
INSERT INTO estadisticas VALUES ('03/04',580,7.9,2.4,0.1,1.8);
INSERT INTO estadisticas VALUES ('05/06',580,13.1,2.8,0.1,2.6);
INSERT INTO estadisticas VALUES ('06/07',64,4.4,1.9,0.1,1.7);
INSERT INTO estadisticas VALUES ('06/07',580,18.1,4,0.2,2.7);
INSERT INTO estadisticas VALUES ('07/08',580,15.8,2.7,0.2,2.4);
INSERT INTO estadisticas VALUES ('07/08',441,4.3,1.3,0,1.1);
INSERT INTO estadisticas VALUES ('07/08',64,9.1,2.7,0.1,2.2);
INSERT INTO estadisticas VALUES ('07/08',81,10.2,1.2,0.4,3.8);
INSERT INTO estadisticas VALUES ('06/07',24,1,0,0,0.8);
INSERT INTO estadisticas VALUES ('03/04',601,4.5,1.3,0.1,4);
INSERT INTO estadisticas VALUES ('04/05',601,3.8,1.3,0.2,3.1);
INSERT INTO estadisticas VALUES ('05/06',601,3,0.4,0.1,1.9);
INSERT INTO estadisticas VALUES ('96/97',483,14.8,1.5,2.1,6.3);
INSERT INTO estadisticas VALUES ('07/08',591,2.2,0.7,0.2,0.7);
INSERT INTO estadisticas VALUES ('06/07',601,9.8,2.1,0.5,4.6);
INSERT INTO estadisticas VALUES ('97/98',483,12.1,1.8,3.7,7.4);
INSERT INTO estadisticas VALUES ('98/99',483,7.2,0.3,1.6,5.5);
INSERT INTO estadisticas VALUES ('99/00',483,10.2,0.8,2,7.8);
INSERT INTO estadisticas VALUES ('00/01',483,12,0.8,2.2,11.5);
INSERT INTO estadisticas VALUES ('01/02',483,11.1,1.1,1.7,11.1);


INSERT INTO partidos VALUES (1,'Raptors','Lakers',74,117,'98/99');
INSERT INTO partidos VALUES (2,'Raptors','Grizzlies',70,118,'98/99');
INSERT INTO partidos VALUES (3,'Raptors','Clippers',105,76,'98/99');
INSERT INTO partidos VALUES (4,'Raptors','Knicks',62,124,'98/99');
INSERT INTO partidos VALUES (5,'Raptors','Timberwolves',66,68,'98/99');
INSERT INTO partidos VALUES (6,'Raptors','Celtics',52,69,'98/99');
INSERT INTO partidos VALUES (7,'Raptors','76ers',74,103,'98/99');
INSERT INTO partidos VALUES (8,'Raptors','Nets',121,129,'98/99');
INSERT INTO partidos VALUES (9,'Raptors','Pistons',100,85,'98/99');
INSERT INTO partidos VALUES (10,'Raptors','Cavaliers',129,158,'98/99');
INSERT INTO partidos VALUES (11,'Raptors','Pacers',100,70,'98/99');
INSERT INTO partidos VALUES (12,'Raptors','Bulls',134,69,'98/99');
INSERT INTO partidos VALUES (13,'Raptors','Bucks',66,118,'98/99');
INSERT INTO partidos VALUES (14,'Raptors','Magic',74,140,'98/99');
INSERT INTO partidos VALUES (15,'Raptors','Wizards',101,61,'98/99');
INSERT INTO partidos VALUES (16,'Raptors','Hawks',128,139,'98/99');
INSERT INTO partidos VALUES (17,'Raptors','Bobcats',88,68,'98/99');
INSERT INTO partidos VALUES (18,'Raptors','Heat',125,119,'98/99');
INSERT INTO partidos VALUES (19,'Raptors','Jazz',147,138,'98/99');
INSERT INTO partidos VALUES (20,'Raptors','Nuggets',74,147,'98/99');
INSERT INTO partidos VALUES (21,'Raptors','Trail Blazers',140,64,'98/99');
INSERT INTO partidos VALUES (22,'Raptors','Supersonics',59,59,'98/99');
INSERT INTO partidos VALUES (23,'Raptors','Warriors',76,74,'98/99');
INSERT INTO partidos VALUES (24,'Raptors','Kings',57,115,'98/99');
INSERT INTO partidos VALUES (25,'Raptors','Hornets',104,82,'98/99');
INSERT INTO partidos VALUES (26,'Raptors','Spurs',116,51,'98/99');
INSERT INTO partidos VALUES (27,'Raptors','Rockets',99,59,'98/99');
INSERT INTO partidos VALUES (28,'Raptors','Mavericks',108,113,'98/99');

-- -----------------------------------------
-- QUERIES
-- -----------------------------------------

-- 2. a)
SELECT EQUIPOS.NOMBRE, COUNT(JUGADORES.CODIGO) AS CANTIDAD_JUGADORES
FROM EQUIPOS
INNER JOIN JUGADORES ON JUGADORES.NOMBRE_EQUIPO = EQUIPOS.NOMBRE
GROUP BY EQUIPOS.NOMBRE;

-- 2. b) 
SELECT J.NOMBRE
FROM JUGADORES J
INNER JOIN EQUIPOS EQ ON EQ.NOMBRE = J.NOMBRE_EQUIPO
INNER JOIN ESTADISTICAS ES ON ES.JUGADOR = J.CODIGO
GROUP BY J.NOMBRE, EQ.NOMBRE, J.CODIGO
HAVING AVG(ES.PUNTOS_POR_PARTIDO) <= (
    SELECT AVG(ESTADISTICAS.PUNTOS_POR_PARTIDO)
    FROM ESTADISTICAS
    INNER JOIN JUGADORES ON JUGADORES.CODIGO = ESTADISTICAS.JUGADOR
    INNER JOIN EQUIPOS ON EQUIPOS.NOMBRE = JUGADORES.NOMBRE_EQUIPO
    WHERE EQUIPOS.NOMBRE = EQ.NOMBRE
);

-- 2. c)
SELECT EQUIPOS.NOMBRE, COUNT(JUGADORES.CODIGO) AS CANTIDAD_JUGADORES, ROUND(AVG(JUGADORES.PESO), 2) AS PESO_MEDIO
FROM EQUIPOS
INNER JOIN JUGADORES ON JUGADORES.NOMBRE_EQUIPO = EQUIPOS.NOMBRE
GROUP BY EQUIPOS.NOMBRE
HAVING COUNT(JUGADORES.CODIGO) > 3
ORDER BY AVG(JUGADORES.PESO) DESC;

-- -----------------------------------------
-- PROCEDIMIENTOS
-- -----------------------------------------

SET SERVEROUTPUT ON;

-- 3.

CREATE OR REPLACE PROCEDURE sp_ListaJugadores(nombreEquipo EQUIPOS.NOMBRE%TYPE, numeroJugadores OUT INT, totalPuntosMarcados OUT INT) IS
    CURSOR jugadoresEnEquipo IS
    SELECT JUGADORES.NOMBRE AS J_NOMBRE, ESTADISTICAS.PUNTOS_POR_PARTIDO AS P_PARTIDO, ESTADISTICAS.REBOTES_POR_PARTIDO AS R_PARTIDO
    FROM JUGADORES
    INNER JOIN ESTADISTICAS ON ESTADISTICAS.JUGADOR = JUGADORES.CODIGO
    WHERE UPPER(JUGADORES.NOMBRE_EQUIPO) = UPPER(nombreEquipo);
    
    numeroJugador INT := 0;
    puntosMarcados INT := 0;

BEGIN
    FOR jugador IN jugadoresEnEquipo LOOP
        numeroJugador := numeroJugador + 1;
        puntosMarcados := puntosMarcados + jugador.P_PARTIDO;
        
        dbms_output.put_line(numeroJugador || ' ' || jugador.J_NOMBRE || ' ' || jugador.P_PARTIDO || ' ' || jugador.R_PARTIDO);
    END LOOP;
    
    numeroJugadores := numeroJugador;
    totalPuntosMarcados := puntosMarcados;
END sp_ListaJugadores;

---------

DECLARE
    equipo EQUIPOS.NOMBRE%TYPE := '&NOMBRE_EQUIPO';
    
    numeroJugadores INT := 0;
    totalPuntosMarcados INT := 0;
    
BEGIN
    sp_ListaJugadores(equipo, numeroJugadores, totalPuntosMarcados);
    dbms_output.put_line('Nº jugadores: ' || numeroJugadores);
    dbms_output.put_line('Puntos marcados: ' || totalPuntosMarcados);
END;

-- 4.

CREATE OR REPLACE PROCEDURE incrementar_puntos_equipo(nombreEquipo EQUIPOS.NOMBRE%TYPE) IS
    CURSOR jugadorEquipo IS
    SELECT JUGADORES.CODIGO AS J_CODIGO, ESTADISTICAS.TEMPORADA AS TEMP, ESTADISTICAS.PUNTOS_POR_PARTIDO AS P_PARTIDO
    FROM JUGADORES
    INNER JOIN ESTADISTICAS ON ESTADISTICAS.JUGADOR = JUGADORES.CODIGO
    WHERE UPPER(JUGADORES.NOMBRE_EQUIPO) = UPPER(nombreEquipo);
    
    cantidadJugadoresModificados INT := 0;
    
BEGIN
    FOR jugador IN jugadorEquipo LOOP
        cantidadJugadoresModificados := cantidadJugadoresModificados + 1;
        
        UPDATE ESTADISTICAS
        SET PUNTOS_POR_PARTIDO = jugador.P_PARTIDO * 1.1
        WHERE ESTADISTICAS.JUGADOR = jugador.J_CODIGO AND ESTADISTICAS.TEMPORADA = jugador.TEMP;
    END LOOP;
    
    dbms_output.put_line('Cantidad de jugadors modificados: ' || cantidadJugadoresModificados);
END incrementar_puntos_equipo;

---------

DECLARE
    equipo EQUIPOS.NOMBRE%TYPE := '&NOMBRE_EQUIPO';
    
BEGIN
    incrementar_puntos_equipo(equipo);
END;

-- -----------------------------------------
-- TRIGGERS
-- -----------------------------------------

-- 5.

CREATE OR REPLACE TRIGGER trigger_maximo_jugadores
BEFORE INSERT ON EQUIPOS
FOR EACH ROW
DECLARE
    cantidadJugadores NUMBER := 0;

BEGIN
    SELECT COUNT(JUGADORES.CODIGO)
    INTO cantidadJugadores
    FROM EQUIPOS
    INNER JOIN JUGADORES ON JUGADORES.NOMBRE_EQUIPO = EQUIPOS.NOMBRE
    GROUP BY EQUIPOS.NOMBRE;
    
    IF cantidadJugadores > 15 THEN
        RAISE_APPLICATION_ERROR(-2005, 'Hay demasiados jugadores en el equipo');
    END IF;
END trigger_maximo_jugadores;


-- 6.

CREATE OR REPLACE TRIGGER trigger_partidos
BEFORE INSERT OR UPDATE ON PARTIDOS
FOR EACH ROW
DECLARE
    cantidadPartidosMismoEquipoLocal NUMBER := 0;
    cantidadPartidosMismoEquipoVisitante NUMBER := 0;

BEGIN
    IF :NEW.PUNTOS_LOCAL = 0 OR :NEW.PUNTOS_VISITANTE = 0 THEN
        RAISE_APPLICATION_ERROR(-2010, 'No se permiten puntuaciones negativas');
    END IF;
    
    SELECT COUNT(*)
    INTO cantidadPartidosMismoEquipoLocal
    FROM PARTIDOS
    WHERE PARTIDOS.PUNTOS_LOCAL = :NEW.PUNTOS_LOCAL;
    
    SELECT COUNT(*)
    INTO cantidadPartidosMismoEquipoVisitante
    FROM PARTIDOS
    WHERE PARTIDOS.PUNTOS_VISITANTE = :NEW.PUNTOS_VISITANTE;
    
    IF cantidadPartidosMismoEquipoVisitante > 0 OR cantidadPartidosMismoEquipoLocal > 0 THEN
        RAISE_APPLICATION_ERROR(-2011, 'No se pueden repetir los equipos');
    END;
END trigger_partidos;