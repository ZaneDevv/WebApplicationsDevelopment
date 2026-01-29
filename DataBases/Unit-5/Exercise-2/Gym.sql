-- Álvaro Fernández Barrero
-- 2026/01/21

-- ---------------------------------
--  Creating database
-- ---------------------------------

drop database if exists Gym;
create database if not exists Gym;
use Gym; 

-- ---------------------------------
--  Creating tables
-- ---------------------------------

drop table if exists Monitor;
create table if not exists Monitor(
	dni int unsigned primary key,
	nombre varchar(25),
	telefono char(10),
	titulacion varchar(10) not null
);


drop table if exists Socio;
create table if not exists Socio(
	dni int unsigned primary key,
	nombre varchar(20),
	direccion varchar(15),
	telefono char(10)
);


drop table if exists Aparatos;
create table if not exists Aparatos(
	codigo int unsigned primary key,
	descripcion varchar(20),
	estado varchar(8) not null
);


drop table if exists Salas;
create table if not exists Salas(
	numero int unsigned primary key,
	superficie int unsigned not null,
	ubicacion varchar(20) not null,
	tipo varchar(10) not null
);


drop table if exists Clases;
create table if not exists Clases(
	codigo int unsigned primary key,
	descripcion varchar(15) not null,
	dia char(8) not null
);


drop table if exists Tienen;
create table if not exists Tienen(
	numero int unsigned,
	codigo int unsigned,

	primary key (numero, codigo)
);


drop table if exists Se_Imparten;
create table if not exists Se_Imparten(
	numero int unsigned,
	codigo int unsigned,

	primary key (numero, codigo)
);


drop table if exists Son_Impartidas;
create table if not exists Son_Impartidas(
	codigo int unsigned,
	dni int unsigned,

	primary key(codigo, dni)
);


drop table if exists Asisten;
create table if not exists Asisten(
	dni int unsigned,
	codigo int unsigned,

	primary key(dni, codigo)
);

-- ---------------------------------
--  Inserting values to database
-- ---------------------------------

insert into Monitor values(11,'Jose García','953333333','INEF');
insert into Monitor values(22,'Ana Gil','963333334','INEF');
insert into Monitor values(33,'Ana Martín','953333335','F.P.');
insert into Monitor values(44,'Pepe Pérez','953333336','INEF');


insert into Socio values(1,'Manolo Arcos','Libertad','95311111');
insert into Socio values(2,'Jose Rodríguez','Trinidad','95322222');
insert into Socio values(3,'Patricia Jiménez','Ancha','95322222');
insert into Socio values(4,'Soledad Martínez','Rastro','95322222');
insert into Socio values(5,'Inmaculada Pérez','Cava','95322222');
insert into Socio values(6,'Nicolás Ortega','Nueva','95322222');
insert into Socio values(7,'Federico Noriega','Trinidad','95322222');
insert into Socio values(8,'Rodríguez','Cava','95322222');


insert into Aparatos values(1,'Banco','Bueno');
insert into Aparatos values(2,'Pesa','Malo');
insert into Aparatos values(3,'Colchón','Nuevo');
insert into Aparatos values(4,'Barra','Bueno');
insert into Aparatos values(5,'Banco','Nuevo');
insert into Aparatos values(6,'Pesa','Nuevo');


insert into Salas values(1,10,'Planta 1','Cardio');
insert into Salas values(2,20,'Planta 1','Aerobic');
insert into Salas values(3,25,'Planta 1','Aerobic');
insert into Salas values(4,10,'Planta 2','Sauna');
insert into Salas values(5,10,'Planta 2','Masaje');
insert into Salas values(6,15,'Planta 2','Cardio');


insert into Clases values(1,'Aerobic','9:00:00');
insert into Clases values(2,'Aerobic','10:00:00');
insert into Clases values(5,'Aerobic','14:00:00');
insert into Clases values(3,'Step','20:00:00');
insert into Clases values(4,'Spining','21:00:00');


insert into Tienen values(4,4);
insert into Tienen values(5,5);
insert into Tienen values(2,1);
insert into Tienen values(3,2);
insert into Tienen values(3,3);
insert into Tienen values(6,6);


insert into Se_Imparten values(2,1);
insert into Se_Imparten values(2,2);
insert into Se_Imparten values(3,3);
insert into Se_Imparten values(3,4);
insert into Se_Imparten values(3,5);


insert into Son_Impartidas values(1,11);
insert into Son_Impartidas values(2,22);
insert into Son_Impartidas values(3,33);
insert into Son_Impartidas values(4,22);
insert into Son_Impartidas values(5,33);


insert into Asisten values(1,1);
insert into Asisten values(1,5);
insert into Asisten values(2,2);
insert into Asisten values(3,4);
insert into Asisten values(3,5);
insert into Asisten values(4,3);
insert into Asisten values(5,3);
insert into Asisten values(6,3);
insert into Asisten values(7,1);
insert into Asisten values(7,5);
insert into Asisten values(7,2);
insert into Asisten values(8,4);
insert into Asisten values(8,5);

-- ---------------------------------
--  Chaeking tables
-- ---------------------------------

select * from Monitor;
select * from Socio;
select * from Aparatos;
select * from Salas;
select * from Clases;
select * from Tienen;
select * from Se_Imparten;
select * from Son_Impartidas;
select * from Asisten;

-- ---------------------------------
--  Exercises
-- ---------------------------------

-- 1.
select Socio.nombre, Socio.telefono
from Socio
where Socio.direccion = 'Trinidad';


-- 2.
select Socio.nombre, Socio.telefono
from Socio
where Socio.direccion = 'Cava';

-- 3.
select Socio.nombre, Socio.direccion
from Socio
inner join Asisten ON Asisten.dni = Socio.dni
inner join Salas ON Salas.numero = Asisten.codigo
where Salas.tipo = 'Aerobic';

-- 4.
select Socio.nombre
from Socio
inner join Asisten on Asisten.dni = Socio.dni
inner join Clases on Clases.codigo = Asisten.codigo
inner join Son_Impartidas on Son_Impartidas.codigo = Clases.codigo
inner join Monitor on Son_Impartidas.dni = Monitor.dni
where Monitor.dni = 22;


-- 5.
select Monitor.nombre
from Monitor
where Monitor.titulacion = 'INEF';


-- 12.
select distinct Aparatos.descripcion
from Aparatos
inner join Tienen on Aparatos.codigo = Tienen.codigo
inner join Salas on Salas.numero = Tienen.numero
where Salas.ubicacion = 'Planta 1';


-- 13.
select Clases.*, Socio.dni
from Clases
inner join Asisten ON Asisten.codigo = Clases.codigo
inner join Socio ON Socio.dni = Asisten.dni;


-- 14.
select Monitor.nombre, Clases.descripcion, Clases.dia
from Monitor
inner join Son_Impartidas ON Monitor.dni = Son_Impartidas.dni
inner join Clases ON Son_Impartidas.codigo = Clases.codigo;


-- 15.
select distinct Clases.descripcion
from Clases
inner join Se_Imparten on Clases.codigo = Se_Imparten.codigo
inner join Salas on Salas.numero = Se_Imparten.numero
where Salas.superficie > 22;


-- 16.
select Salas.numero, Aparatos.descripcion
from Salas
left join Tienen on Tienen.numero = Salas.numero
left join Aparatos on Aparatos.codigo = Tienen.codigo;


-- 17.
select Clases.descripcion, count(Asisten.dni) as socios_total
from Clases
inner join Asisten on Clases.codigo = Asisten.codigo
group by Clases.codigo, Clases.descripcion
order by socios_total desc;


-- 18.
select tipo, sum(superficie) as superficie_total
from Salas
group by tipo;


-- 19.
select Monitor.nombre
from Monitor
left join Son_Impartidas on Monitor.dni = Son_Impartidas.dni
where Son_Impartidas.dni is null;


-- 20.
select Salas.*
from Salas
where superficie > (
	select avg(superficie)
	from Salas
);


-- 21.
select Socio.nombre, Clases.descripcion
from Socio
inner join Asisten on Socio.dni = Asisten.dni
inner join Clases on Asisten.codigo = Clases.codigo
inner join Se_Imparten on Clases.codigo = Se_Imparten.codigo
inner join Salas on Se_Imparten.numero = Salas.numero
where Salas.ubicacion = 'Planta 1';


-- 22.
select Clases.descripcion, count(Asisten.dni) as socios_total
from Clases
inner join Asisten on Clases.codigo = Asisten.codigo
group by Clases.codigo, Clases.descripcion
having socios_total > 2;


-- 23.
select Aparatos.descripcion, Tienen.numero
from Aparatos
inner join Tienen on Aparatos.codigo = Tienen.codigo
where estado = 'Malo';


-- 24.
select distinct Socio.nombre, Monitor.nombre, Monitor.titulacion
from Socio
inner join Asisten on Asisten.dni = Socio.dni
inner join Clases on Asisten.codigo = Clases.codigo
inner join Son_Impartidas on Son_Impartidas.codigo = Clases.codigo
inner join Monitor on Son_Impartidas.dni = Monitor.dni
where titulacion = 'INEF';


-- 25.
select avg(superficie) as superficie_promedio
from Salas;