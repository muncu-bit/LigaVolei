-- 1 = admin        2 = usuario
insert into usuarios values(null,"Admin@admin.es","Admin","6062a550329a9d36db57afbb3fb627c040dd0c8a8548dc201b20a17c1cdeb43b", "fe9a9768f3d4c348d1d42d16f5f99508", 1); -- Contraseña: Admin
insert into usuarios values(null,"vero@email.es","Vero","b4bf4e4f951946e7e87a1fb673d1d4687c2c0111e12a7c56a7fddc297c7629bb", "1bfcea46bf1938fd64e552e1fb909080", 2); -- Contraseña: 1234
insert into usuarios values(null,"iker@email.es","Iker","aea2cd5a51c08bedda7b806aae5c4834ce25292e1b934a800cb546e83d2b42b0", "273603c1b42d4430d47d30e2271529fb", 2); -- Contraseña: 2345
insert into usuarios values(null,"maks@email.es","Maksim","bacc75bef4e01b0a43ef4b636568ca25712f3d356a706cee7a98f4de5877a7b3", "ee3c6899164689cd4fc23e673598e261", 2); -- Contraseña: 3456

INSERT INTO ligas (nombre, descripcion) VALUES
('Liga de Voleibol Titanes', 'Liga profesional de voleibol con los equipos más fuertes'),
('Liga Vóley Élite', 'Competición de alto nivel entre los mejores clubes'),
('Copa de Campeones del Voleibol', 'Torneo anual entre campeones regionales'),
('Liga Diamante del Vóley', 'Liga nacional con formato de todos contra todos'),
('Torneo Golden Spike', 'Competición internacional de voleibol'),
('Vóley Nations United', 'Liga con equipos de diferentes países'),
('Liga Prohibido Rendirse', 'Competición intensa donde solo gana el más fuerte'),
('Desafío en la Red', 'Liga donde cada partido es un desafío'),
('Maestros del Voleibol', 'Equipos históricos compiten por el título'),
('Arena Attack League', 'Liga de voleibol con estilo ofensivo'),
('Liga Estelar de Voleibol', 'Competición de alto nivel con equipos de toda España'),
('Liga Norte Volley', 'Liga regional con equipos del norte del país'),
('Liga Mediterránea', 'Torneo costero con gran tradición deportiva'),
('Liga Atlántica', 'Competición con equipos de la zona atlántica'),
('Liga Central Pro', 'Liga profesional con equipos del centro peninsular'),
('Liga Juvenil Oro', 'Competición para jóvenes talentos del voleibol'),
('Liga Máster Élite', 'Liga para jugadores veteranos de alto rendimiento'),
('Liga Universitaria Nacional', 'Torneo entre universidades de todo el país'),
('Liga Costa del Sol', 'Competición regional con equipos del sur'),
('Liga Pirenaica', 'Liga con equipos de zonas montañosas'),
('Liga Urbana de Voleibol', 'Torneo urbano con formato rápido y dinámico'),
('Liga Internacional Iberia', 'Competición con equipos invitados de Portugal'),
('Liga Femenina Estelar', 'Liga femenina de máximo nivel'),
('Liga Sub-21 Promesas', 'Competición para jugadores menores de 21 años'),
('Liga Élite Profesional', 'La liga más competitiva del circuito nacional');

INSERT INTO equipos (nombre, victorias, derrotas, puntos, idliga) VALUES
('Pamplona Titans B', 0, 0, 0, 1),
('Navarra Eagles', 0, 0, 0, 1),
('Basque Thunder', 0, 0, 0, 1),
('Pamplona Fireballs', 0, 0, 0, 1),
('San Sebastián Waves', 0, 0, 0, 1),

('Madrid Blaze', 0, 0, 0, 2),
('Barcelona Storm', 0, 0, 0, 2),
('Toledo Warriors', 0, 0, 0, 2),
('Zaragoza Lightning', 0, 0, 0, 2),
('Cuenca Dragons', 0, 0, 0, 2),

('Valencia Surfers', 0, 0, 0, 3),
('Alicante Breeze', 0, 0, 0, 3),
('Murcia Cyclones', 0, 0, 0, 3),
('Castellón Thunderbolts', 0, 0, 0, 3),
('Benidorm Sharks', 0, 0, 0, 3),

('Santander Orcas', 0, 0, 0, 4),
('Oviedo Avalanche', 0, 0, 0, 4),
('Gijón Falcons', 0, 0, 0, 4),
('Burgos Titans', 0, 0, 0, 4),
('León Panthers', 0, 0, 0, 4),

('Sevilla Scorchers', 0, 0, 0, 5),
('Cádiz Hurricanes', 0, 0, 0, 5),
('Málaga Dolphins', 0, 0, 0, 5),
('Granada Wolves', 0, 0, 0, 5),
('Córdoba Spartans', 0, 0, 0, 5),

('Tenerife Cyclones', 0, 0, 0, 6),
('Gran Canaria Rays', 0, 0, 0, 6),
('Lanzarote Krakens', 0, 0, 0, 6),
('La Palma Meteors', 0, 0, 0, 6),
('Fuerteventura Falcons', 0, 0, 0, 6),

('Paris Titans', 0, 0, 0, 7),
('Berlin Smashers', 0, 0, 0, 7),
('Roma Gladiators', 0, 0, 0, 7),
('Lisboa Surfers', 0, 0, 0, 7),
('London Blockers', 0, 0, 0, 7),

('Chicago Spikers', 0, 0, 0, 8),
('New York Aces', 0, 0, 0, 8),
('Los Angeles Waves', 0, 0, 0, 8),
('Miami Heat Volley', 0, 0, 0, 8),
('Houston Rockets Volley', 0, 0, 0, 8),

('Tokyo Dragons', 0, 0, 0, 9),
('Osaka Ninjas', 0, 0, 0, 9),
('Kyoto Phoenix', 0, 0, 0, 9),
('Nagoya Thunder', 0, 0, 0, 9),
('Sapporo Snow Wolves', 0, 0, 0, 9),

('Sydney Sharks', 0, 0, 0, 10),
('Melbourne Fire', 0, 0, 0, 10),
('Brisbane Lightning', 0, 0, 0, 10),
('Perth Cyclones', 0, 0, 0, 10),
('Adelaide Falcons', 0, 0, 0, 10),
('Toledo Firehawks', 0, 0, 0, 2),
('Madrid Thunderbolts', 0, 0, 0, 2),
('Barcelona Cyclones', 0, 0, 0, 2),
('Valencia Hurricanes', 0, 0, 0, 3),
('Alicante Krakens', 0, 0, 0, 3),

('Murcia Vortex', 0, 0, 0, 3),
('Santander Stormriders', 0, 0, 0, 4),
('Oviedo Ice Wolves', 0, 0, 0, 4),
('Gijón Thunderhawks', 0, 0, 0, 4),
('Burgos Avalanche', 0, 0, 0, 4),

('Sevilla Blaze', 0, 0, 0, 5),
('Cádiz Sea Dragons', 0, 0, 0, 5),
('Málaga Thunder Sharks', 0, 0, 0, 5),
('Granada Titans', 0, 0, 0, 5),
('Córdoba Fire Lions', 0, 0, 0, 5),

('Tenerife Sun Warriors', 0, 0, 0, 6),
('Gran Canaria Thunder Rays', 0, 0, 0, 6),
('Lanzarote Fire Serpents', 0, 0, 0, 6),
('La Palma Sky Eagles', 0, 0, 0, 6),
('Fuerteventura Desert Hawks', 0, 0, 0, 6),
('Pamplona Iron Wolves', 0, 0, 0, 1),
('Navarra Skyhawks', 0, 0, 0, 1),
('Euskadi Thunderstorm', 0, 0, 0, 1),
('San Fermín Smashers', 0, 0, 0, 1),
('Titanes del Norte', 0, 0, 0, 1),

-- LIGA 2
('Madrid Royal Spikers', 0, 0, 0, 2),
('Barcelona Blue Dragons', 0, 0, 0, 2),
('Toledo Iron Giants', 0, 0, 0, 2),
('Zaragoza Storm Eagles', 0, 0, 0, 2),
('Cuenca Night Wolves', 0, 0, 0, 2),

-- LIGA 3
('Valencia Sea Dragons', 0, 0, 0, 3),
('Alicante Coral Smash', 0, 0, 0, 3),
('Murcia Desert Titans', 0, 0, 0, 3),
('Castellón Firehawks', 0, 0, 0, 3),
('Benidorm Sun Warriors', 0, 0, 0, 3),

-- LIGA 4
('Santander North Lions', 0, 0, 0, 4),
('Oviedo Frost Giants', 0, 0, 0, 4),
('Gijón Iron Falcons', 0, 0, 0, 4),
('Burgos Mountain Wolves', 0, 0, 0, 4),
('León Thunder Knights', 0, 0, 0, 4),

-- LIGA 5
('Sevilla Red Phoenix', 0, 0, 0, 5),
('Cádiz Ocean Sharks', 0, 0, 0, 5),
('Málaga Sunbreakers', 0, 0, 0, 5),
('Granada Firestorm', 0, 0, 0, 5),
('Córdoba Emerald Lions', 0, 0, 0, 5),

-- LIGA 6
('Tenerife Lava Hawks', 0, 0, 0, 6),
('Gran Canaria Sand Titans', 0, 0, 0, 6),
('Lanzarote Fire Krakens', 0, 0, 0, 6),
('La Palma Sky Titans', 0, 0, 0, 6),
('Fuerteventura Desert Wolves', 0, 0, 0, 6),

-- LIGA 7
('Paris Lightning Foxes', 0, 0, 0, 7),
('Berlin Iron Smashers', 0, 0, 0, 7),
('Roma Eternal Knights', 0, 0, 0, 7),
('Lisboa Ocean Spikers', 0, 0, 0, 7),
('London Royal Blockers', 0, 0, 0, 7),

-- LIGA 8
('Chicago Steel Spikers', 0, 0, 0, 8),
('New York Thunderhawks', 0, 0, 0, 8),
('Los Angeles Night Sharks', 0, 0, 0, 8),
('Miami Sunbreakers', 0, 0, 0, 8),
('Houston Iron Rockets', 0, 0, 0, 8),

-- LIGA 9
('Tokyo Neon Dragons', 0, 0, 0, 9),
('Osaka Shadow Ninjas', 0, 0, 0, 9),
('Kyoto Flame Phoenix', 0, 0, 0, 9),
('Nagoya Thunder Wolves', 0, 0, 0, 9),
('Sapporo Ice Titans', 0, 0, 0, 9),

-- LIGA 10
('Sydney Ocean Kings', 0, 0, 0, 10),
('Melbourne Iron Bears', 0, 0, 0, 10),
('Brisbane Storm Riders', 0, 0, 0, 10),
('Perth Desert Eagles', 0, 0, 0, 10),
('Adelaide Thunder Lions', 0, 0, 0, 10);


INSERT INTO jugadores (nombre, edad, descripcion, idequipo) VALUES

-- EQUIPO 1
('Carlos Pérez', 22, 'Rematador potente', 1),
('Miguel Torres', 24, 'Especialista en bloqueo', 1),
('Álvaro Sánchez', 20, 'Rematador zurdo', 1),
('Iván Castillo', 23, 'Defensa rápido', 1),
('Tomás Herrera', 23, 'Central fuerte', 1),
('Ismael Torres', 23, 'Rematador de banda', 1),

-- EQUIPO 2
('Juan López', 21, 'Colocador rápido', 2),
('Rubén Martín', 25, 'Central dominante', 2),
('Mario Domínguez', 21, 'Colocador creativo', 2),
('Gonzalo Peña', 22, 'Colocador preciso', 2),
('Cristian Vega', 24, 'Central con alcance', 2),
('Álex Carrillo', 24, 'Rematador de precisión', 2),

-- EQUIPO 3
('David Ruiz', 23, 'Defensa sólido', 3),
('Javier Gómez', 19, 'Líbero muy ágil', 3),
('Adrián Navarro', 20, 'Rematador técnico', 3),
('Luis Barrios', 21, 'Defensa disciplinado', 3),
('Hugo Serrano', 22, 'Colocador táctico', 3),
('Eduardo Sáez', 26, 'Central veterano', 3),

-- EQUIPO 4
('Sergio Vidal', 26, 'Colocador experimentado', 4),
('Óscar Beltrán', 27, 'Bloqueador veterano', 4),
('Samuel Prieto', 21, 'Defensa técnico', 4),
('Julián Montes', 20, 'Colocador joven', 4),
('Erik Zamora', 25, 'Defensa inteligente', 4),
('Aritz Etxeberria', 22, 'Defensa disciplinado', 4),

-- EQUIPO 5
('Héctor Molina', 22, 'Rematador explosivo', 5),
('Daniel Pardo', 22, 'Líbero seguro', 5),
('Nicolás Bravo', 25, 'Rematador de salto alto', 5),
('Rafael Cañas', 23, 'Defensa muy seguro', 5),
('Fabián Rojas', 20, 'Líbero muy técnico', 5),
('Jon Ander', 25, 'Rematador de banda', 5),

-- EQUIPO 6
('Pablo Ortega', 24, 'Bloqueador alto', 6),
('Alejandro Rivas', 24, 'Rematador de potencia', 6),
('Marcos Lázaro', 23, 'Bloqueador disciplinado', 6),
('Iván Pino', 21, 'Rematador agresivo', 6),
('Álvaro Cid', 22, 'Rematador con salto', 6),
('Markel Urrutia', 20, 'Líbero rápido', 6),

-- EQUIPO 7
('Pedro Lanza', 23, 'Bloqueador alto', 7),
('Cristian Ramos', 24, 'Rematador técnico', 7),
('Jairo Medina', 21, 'Colocador veloz', 7),
('Lucas Ferrer', 22, 'Defensa seguro', 7),
('Mateo Aguilar', 26, 'Rematador veterano', 7),
('Santiago Pino', 20, 'Líbero disciplinado', 7),

-- EQUIPO 8
('Adrián Cuesta', 23, 'Rematador de potencia', 8),
('Hugo Llorente', 24, 'Central muy alto', 8),
('Pau Miralles', 22, 'Colocador táctico', 8),
('Nil Soler', 21, 'Defensa rápido', 8),
('Arnau Vidal', 25, 'Rematador catalán', 8),
('Pol Serra', 20, 'Líbero muy ágil', 8),

-- EQUIPO 9
('Enzo Molina', 23, 'Rematador argentino', 9),
('Franco Díaz', 24, 'Bloqueador fuerte', 9),
('Thiago Roldán', 22, 'Colocador creativo', 9),
('Matías Correa', 21, 'Defensa técnico', 9),
('Luciano Varela', 25, 'Rematador potente', 9),
('Bruno Acosta', 20, 'Líbero seguro', 9),

-- EQUIPO 10
('Youssef Karim', 23, 'Rematador muy ágil', 10),
('Omar Benali', 24, 'Central fuerte', 10),
('Nassim El Haddad', 22, 'Colocador preciso', 10),
('Rachid Bakkali', 21, 'Defensa rápido', 10),
('Samir El Idrissi', 25, 'Rematador técnico', 10),
('Hakim El Fassi', 20, 'Líbero disciplinado', 10),

-- EQUIPO 11
('Filip Novak', 23, 'Rematador europeo', 11),
('Luka Horvat', 24, 'Bloqueador alto', 11),
('Marek Dvorak', 22, 'Colocador táctico', 11),
('Tomasz Kowalski', 21, 'Defensa fuerte', 11),
('Jan Vesely', 25, 'Rematador potente', 11),
('Petr Novak', 20, 'Líbero seguro', 11),

-- EQUIPO 12
('Ethan Miller', 23, 'Rematador estadounidense', 12),
('Logan Smith', 24, 'Central muy alto', 12),
('Aiden Johnson', 22, 'Colocador rápido', 12),
('Mason Brown', 21, 'Defensa inteligente', 12),
('Carter Davis', 25, 'Rematador de banda', 12),
('Owen Wilson', 20, 'Líbero muy técnico', 12),

-- EQUIPO 13
('João Silva', 23, 'Rematador brasileño', 13),
('Rafael Costa', 24, 'Central fuerte', 13),
('Pedro Almeida', 22, 'Colocador creativo', 13),
('Lucas Moreira', 21, 'Defensa rápido', 13),
('Matheus Rocha', 25, 'Rematador potente', 13),
('Diego Araujo', 20, 'Líbero seguro', 13),

-- EQUIPO 14
('Kenji Tanaka', 23, 'Rematador japonés', 14),
('Hiroshi Sato', 24, 'Central disciplinado', 14),
('Daichi Suzuki', 22, 'Colocador preciso', 14),
('Yuki Nakamura', 21, 'Defensa ágil', 14),
('Kaito Yamamoto', 25, 'Rematador técnico', 14),
('Ren Kobayashi', 20, 'Líbero muy rápido', 14),

-- EQUIPO 15
('Marco Santoro', 23, 'Rematador italiano', 15),
('Lorenzo Bianchi', 24, 'Central elegante', 15),
('Giovanni Russo', 22, 'Colocador táctico', 15),
('Alessio Romano', 21, 'Defensa seguro', 15),
('Riccardo Conti', 25, 'Rematador potente', 15),
('Fabio Greco', 20, 'Líbero técnico', 15),

-- EQUIPO 16
('Jean Dupont', 23, 'Rematador francés', 16),
('Pierre Martin', 24, 'Central fuerte', 16),
('Louis Bernard', 22, 'Colocador creativo', 16),
('Antoine Girard', 21, 'Defensa rápido', 16),
('Mathieu Leroy', 25, 'Rematador elegante', 16),
('Hugo Lambert', 20, 'Líbero seguro', 16),

-- EQUIPO 17
('Konrad Müller', 23, 'Rematador alemán', 17),
('Felix Schneider', 24, 'Central disciplinado', 17),
('Jonas Weber', 22, 'Colocador preciso', 17),
('Tobias Braun', 21, 'Defensa fuerte', 17),
('Lukas Fischer', 25, 'Rematador potente', 17),
('Nico Hoffmann', 20, 'Líbero técnico', 17),

-- EQUIPO 18
('Andrei Popov', 23, 'Rematador ruso', 18),
('Sergei Ivanov', 24, 'Central muy alto', 18),
('Dmitri Volkov', 22, 'Colocador táctico', 18),
('Alexei Smirnov', 21, 'Defensa seguro', 18),
('Nikolai Petrov', 25, 'Rematador fuerte', 18),
('Viktor Sokolov', 20, 'Líbero disciplinado', 18),

-- EQUIPO 19
('Mateo Silva', 23, 'Rematador uruguayo', 19),
('Bruno Pereira', 24, 'Central fuerte', 19),
('Santiago López', 22, 'Colocador creativo', 19),
('Diego Martínez', 21, 'Defensa rápido', 19),
('Agustín Torres', 25, 'Rematador potente', 19),
('Lucas Cabrera', 20, 'Líbero seguro', 19),

-- EQUIPO 20
('Kevin Johnson', 23, 'Rematador rápido', 20),
('Chris Walker', 24, 'Central alto', 20),
('Tyler Adams', 22, 'Colocador preciso', 20),
('Jason Clark', 21, 'Defensa técnico', 20),
('Ryan Lewis', 25, 'Rematador fuerte', 20),
('Evan Harris', 20, 'Líbero ágil', 20),

-- EQUIPO 21
('Sven Larsson', 23, 'Rematador sueco', 21),
('Erik Johansson', 24, 'Central disciplinado', 21),
('Nils Andersson', 22, 'Colocador táctico', 21),
('Oskar Lind', 21, 'Defensa seguro', 21),
('Viktor Berg', 25, 'Rematador potente', 21),
('Jonas Ek', 20, 'Líbero técnico', 21),

-- EQUIPO 22
('Milan Jovanovic', 23, 'Rematador serbio', 22),
('Nikola Petrovic', 24, 'Central fuerte', 22),
('Stefan Markovic', 22, 'Colocador creativo', 22),
('Luka Jankovic', 21, 'Defensa rápido', 22),
('Bojan Milosevic', 25, 'Rematador potente', 22),
('Ivan Stojanovic', 20, 'Líbero seguro', 22),

-- EQUIPO 23
('Omar Hassan', 23, 'Rematador árabe', 23),
('Karim Nasser', 24, 'Central fuerte', 23),
('Yasin Farouk', 22, 'Colocador preciso', 23),
('Samir Khalil', 21, 'Defensa rápido', 23),
('Hassan Idris', 25, 'Rematador potente', 23),
('Adel Rahman', 20, 'Líbero disciplinado', 23),

-- EQUIPO 24
('Leo Martins', 23, 'Rematador portugués', 24),
('Tiago Sousa', 24, 'Central fuerte', 24),
('Rui Carvalho', 22, 'Colocador creativo', 24),
('Miguel Fonseca', 21, 'Defensa seguro', 24),
('André Batista', 25, 'Rematador potente', 24),
('João Ribeiro', 20, 'Líbero técnico', 24),

-- EQUIPO 25
('Kim Minsoo', 23, 'Rematador coreano', 25),
('Park Jisung', 24, 'Central disciplinado', 25),
('Lee Hyunwoo', 22, 'Colocador preciso', 25),
('Choi Minho', 21, 'Defensa rápido', 25),
('Han Seojun', 25, 'Rematador potente', 25),
('Jung Hoseok', 20, 'Líbero ágil', 25);