drop table if exists usuarios;
create table usuarios(
	id int primary key auto_increment,
	email varchar(200) unique,
	usuario varchar(200) unique,
	contra varchar(200) not null,
	salt varchar(32) not null,
	rol int not null
);

drop table if exists ligas;
create table ligas(
	id int primary key auto_increment,
	nombre varchar(200) unique not null,
	descripcion varchar(200) not null,
	img text,
	estadio text not null,
);

drop table if exists equipos;
create table equipos(
	id int primary key auto_increment,
	nombreEquipo varchar(200) unique not null,
	logo text unique not null,
	nomJ1 varchar(200) not null,
    imgJ1 text not null,
    nomJ2 varchar(200) not null,
    imgJ2 text not null,
    nomJ3 varchar(200) not null,
    imgJ3 text not null,
    nomJ4 varchar(200) not null,
    imgJ4 text not null,
    nomJ5 varchar(200) not null,
    imgJ5 text not null,
    nomJ6 varchar(200) not null,
    imgJ6 text not null
);