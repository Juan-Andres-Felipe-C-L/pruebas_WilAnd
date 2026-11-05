create database pruebas;

use pruebas;

create table users(
id int auto_increment primary key,
name varchar(50) not null
);

insert into users(name) values('Arle'),
('Wilson'),
('Juan Andrés Felipe');