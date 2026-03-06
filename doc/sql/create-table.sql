drop table if exists usuarios;
drop table if exists ligas;
drop table if exists equipos;
drop table if exists partidos;

create table usuarios (
	id int primary key auto_increment,
	email varchar(200) unique,
	usuario varchar(200) unique,
	contra varchar(200) not null,
	salt varchar(32) not null,
	rol int not null
);

create table ligas (
    id int primary key auto_increment,
    nombre varchar (200) unique,
    descripcion varchar(200) not null
);

create table equipos (
    id int primary key auto_increment,
    nombre varchar(200) unique,
    victorias int not null default 0,
    derrotas int not null default 0,

);

create table partidos (
    id int primary key auto_increment,
    liga_id int not null,
    equipo_local_id int not null,
    equipo_visitante_id int not null,
    puntos_local int not null,
    puntos_visitante int not null,
    FOREIGN KEY (liga_id) REFERENCES ligas(id),
    FOREIGN KEY (equipo_local_id) REFERENCES equipos(id),
    FOREIGN KEY (equipo_visitante_id) REFERENCES equipos(id),

);
