-- Estudiantes que laboran: Wilson Daniel Saavedra y Juan Andrés Felipe Castro Londoño.
-- Instructor a quien se entrega: Arle Morales Ortiz.
-- Se crea base de datos:
create database pruebas;

-- Se usa la base de datos:
use pruebas;

-- Se crea la tabla de usuarios con sus atributos:
create table users(
id int auto_increment primary key,
name varchar(50) not null
);

-- Se hace inserción de usuarios:
insert into users(name) values('Arle'),
('Wilson'),
('Juan Andrés Felipe');