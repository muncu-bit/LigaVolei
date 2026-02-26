drop table if exists usuarios;
create table usuarios(
	id int primary key auto_increment,
	email varchar(200) unique,
	usuario varchar(200) unique,
	contra varchar(200) not null,
	rol int not null
);