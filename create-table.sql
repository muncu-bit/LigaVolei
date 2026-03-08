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
    puntos int not null default 0,
    idliga int,
    foreign key (idliga) references ligas(id)

);

create table partidos (
    id int primary key auto_increment,
    ligaid int not null,
    equipo_local_id int not null,
    equipo_visitante_id int not null,
    puntos_local int not null,
    puntos_visitante int not null,
    FOREIGN KEY (ligaid) REFERENCES ligas(id),
    FOREIGN KEY (idequipolocal) REFERENCES equipos(id),
    FOREIGN KEY (idequipovisitante) REFERENCES equipos(id),

);

create table jugadores (
id int auto_increment primary key,
nombre Varchar(100) Not null,
edad int,
descripcion varchar(100),
equipoid int,
foreign key (idequipo) references equipos(id)

);
