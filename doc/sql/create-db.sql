drop user if exists 'proy'@'localhost';
CREATE USER 'proy'@'localhost' IDENTIFIED BY 'password';

drop database if exists voleiLiga;
create database voleiLiga;

GRANT ALL PRIVILEGES ON voleiLiga.* TO 'proy'@'localhost';

use voleiLiga;
