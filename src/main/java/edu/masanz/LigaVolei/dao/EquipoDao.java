package edu.masanz.LigaVolei.dao;

import edu.masanz.LigaVolei.database.ConnectionManager;
import edu.masanz.LigaVolei.dto.Equipo;

import java.util.ArrayList;
import java.util.List;

    public  class EquipoDao {

        public static void eliminarEquipo(int id) {
            String sql = "delete from equipos where id = ?";
            Object[] params = {id};
            ConnectionManager.ejecutarInsertSQL(sql, params);
        }

        public static long agregarEquipo(Equipo equipo) {
            String sql = "INSERT INTO equipos (nombre, idliga, victorias, derrotas, puntos) VALUES (?, ?, ?, ?, ?)";

            Object[] params = {
                    equipo.getNombre(),
                    equipo.getLigaid(),
                    equipo.getVictorias(),
                    equipo.getDerrotas(),
                    equipo.getPuntos()
            };

            return ConnectionManager.ejecutarInsertSQL(sql, params);
        }



        public static void actualizarEquipo(Equipo equipo) {

            String sql = "UPDATE equipos SET nombre = ?, victorias=?, derrotas=?, puntos=? WHERE id = ?";

            Object[] params = {
                    equipo.getNombre(),
                    equipo.getVictorias(),
                    equipo.getDerrotas(),
                    equipo.getPuntos(),
                    equipo.getId()
            };
            ConnectionManager.ejecutarInsertSQL(sql, params);
        }

        public static Equipo obtenerEquipoPorId(int idEquipo) {
            String sql = "select * from equipos where id = ?";
            Object[] params = {idEquipo};
            Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);

            if (resultado != null && resultado.length > 0) {
                Object[] row = resultado[0];

                Equipo equipo = new Equipo(
                        (int) row[0],   //id
                        (String) row[1], //nombre
                        (int) row[2],   //victorias
                        (int) row[3],   //derrotas
                        (int) row[4]   //puntos

                );

                equipo.setLigaid((int) row[5]); // lo que guarda es el Id de la liga

                return equipo;
            }
            return null;
        }



        public static List<Equipo> obtenerEquiposPorLiga(int ligaid) {
            String sql = "SELECT * FROM equipos WHERE idliga = ? order by puntos desc";
            Object[] params = {ligaid};

            Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);

            List<Equipo> listaEquipos = new ArrayList<>();

            if (resultado != null && resultado.length > 0) {
                for (Object[] row : resultado) {
                    Equipo e = new Equipo(
                            (int) row[0],
                            (String) row[1],
                            (int) row[2],
                            (int) row[3],
                            (int) row[4]
                    );
                    listaEquipos.add(e);
                }
            }
            return listaEquipos;
        }

        public static List<Equipo> listarEquipos() {

            String sql = "Select * from equipos";
            Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, null);

            List<Equipo> equipos = new ArrayList<>();
            if (resultado != null) {
                for (Object[] row : resultado) {
                    int id = (int) row[0];
                    String nombre = (String) row[1];

                    equipos.add(new Equipo(id, nombre))
                    ;
                }
            }
            return equipos;
        }




    }

