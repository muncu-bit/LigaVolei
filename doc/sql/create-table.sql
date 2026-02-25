drop table if exists voleiLiga;

create table usuarios(
	usuario varchar(200) primary key,
	contraseña varchar(200) not null,
	rol int not null
);