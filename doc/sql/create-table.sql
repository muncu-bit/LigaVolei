drop table if exists usuarios;
drop table if exists ligas;
drop table if exists equipos;
drop table if exists partidos;
drop table if exists jugadores;

create table usuarios (
	id int primary key auto_increment,
	email varchar(200) unique,
	usuario varchar(200) unique,
	contra varchar(200) not null,
	salt varchar(32) not null,
	rol int not null
);
CREATE TABLE ligas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT
);

CREATE TABLE equipos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    victorias INT DEFAULT 0,
    derrotas INT DEFAULT 0,
    puntos INT DEFAULT 0,
    idliga INT,
    FOREIGN KEY (idliga) REFERENCES ligas(id)
);

CREATE TABLE jugadores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    edad INT,
    descripcion TEXT,
    idequipo INT,
    FOREIGN KEY (idequipo) REFERENCES equipos(id)
);


CREATE TABLE partidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ligaId INT,
    idequipoLocal INT,
    idequipoVisitante INT,
    puntosLocal INT,
    puntosVisitante INT,

    FOREIGN KEY (ligaId) REFERENCES ligas(id),
    FOREIGN KEY (idequipoLocal) REFERENCES equipos(id),
    FOREIGN KEY (idequipoVisitante) REFERENCES equipos(id)
);