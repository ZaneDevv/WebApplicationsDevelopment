-- Álvaro Fernández Barrero
-- 2026/01/21

-- ---------------------------------
-- Creating database
-- ---------------------------------

DROP DATABASE IF EXISTS Empresa;
CREATE DATABASE IF NOT EXISTS Empresa;
USE Empresa

-- ---------------------------------
-- Creating tables
-- ---------------------------------

create table empleado(
	EMP varchar(5),
    DNI int,
    Nombre varchar(20),
    numhijos int,
    ciudad varchar(50),

    primary key(EMP)
);

create table departamento(
	DPTO varchar(5),
    nombre varchar(50),
    asignacion int,

    primary key(DPTO)
);

create table pertenece(
	EMP varchar(5),
    DPTO varchar(5),

    foreign key (EMP) references empleado(EMP),
    foreign key (DPTO) references departamento(DPTO)
);

create table articulos(
	ART varchar(5),
    nombre varchar(50),
    color varchar(20),
    CTD int,
    Iva int,

    primary key (ART)
);

create table USA(
	DPTO varchar(5),
    ART varchar(5),

    foreign key (DPTO) references departamento(DPTO),
    foreign key (ART) references articulos(ART)
);

-- ---------------------------------
-- Inserting values
-- ---------------------------------

insert into empleado values ('E1',801,'Uno',1,'Albacete'),
                            ('E2',802,'Dos',2,'Cuenca'),
                            ('E3',803,'Tres',3,'Albacete'),
                            ('E4',804,'Cuatro',4,'Lisboa');

insert into departamento values ('D1','Marketing',115.000),
                                ('D2','Facturación',75.000),
                                ('D3','Ventas',65.000),
                                ('D4','Recursos Humanos',60.000);

insert into pertenece values ('E1','D1'),
                             ('E2','D1'),
                             ('E3','D3'),
                             ('E4','D2');

insert into articulos values ('A1','Impresoras','Verde',150,12),
                             ('A2','Tinta','Azul',380,6),
                             ('A3','Papel','Azul',600,6),
                             ('A4','Boligrafos','Blanco',1000,12),
                             ('A5','Lápiz','Negro',500,12),
                             ('A6','Proyector','Negro',550,12),
                             ('A7','Portátil','Amarillo',350,6),
                             ('A8','Pantalla','Rojo',375,12);

insert into USA values ('D1','A1'),
                       ('D1','A2'),
                       ('D2','A2'),
                       ('D3','A2'),
                       ('D3','A3'),
                       ('D3','A4'),
                       ('D3','A1'),
                       ('D2','A3'),
                       ('D1','A5'),
                       ('D1','A6'),
                       ('D2','A7'),
                       ('D3','A7'),
                       ('D2','A7');

-- ---------------------------------
-- Exercises
-- ---------------------------------

-- 1.
select empleado.Nombre, Empresa.ciudad
from empleado
where empleado.numhijos > 2;


-- 2.
select empleado.Nombre, empleado.ciudad
from empleado
inner join pertenece on pertenece.EMP = empleado.EMP
inner join departamento on departamento.DPTO = pertenece.DPTO
where departamento.Nombre = 'Marketing';


-- 3.
select nombre, iva
from articulos
where iva = 12;


-- 4.
select count(*) as departamentos_con_impresoras
from departamento
inner join USA on USA.DPTO = departamento.DPTO
inner join articulos ON USA.ART = articulos.ART
where articulos.ART = 'A1';


-- 5.



-- 6.
select articulos.Nombre
from articulos
where articulos.ctd > (
	select avg(articulos.ctd)
	from articulos
);


-- 7.
select departamento.Nombre, count(USA.ART)
from departamento
inner join USA on USA.DPTO = departamento.DPTO
group by departamento.DPTO;