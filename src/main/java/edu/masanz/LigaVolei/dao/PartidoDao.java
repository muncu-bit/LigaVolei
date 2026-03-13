package edu.masanz.LigaVolei.dao;

import edu.masanz.LigaVolei.database.ConnectionManager;
import edu.masanz.LigaVolei.dto.Equipo;
import edu.masanz.LigaVolei.dto.Partido;

import java.util.ArrayList;
import java.util.List;

    public  class PartidoDao {


        public static void agregarPartido(Partido partido) {

            String sql = "INSERT INTO partidos (ligaId, idequipoLocal, idequipoVisitante, puntosLocal, puntosVisitante) VALUES (?, ?, ?, ?, ?)";

            Object[] params = {
                    partido.getLigaId(),
                    partido.getIdequipoLocal(),
                    partido.getIdequipoVisitante(),
                    partido.getPuntosLocal(),
                    partido.getPuntosVisitante()

            };

            ConnectionManager.ejecutarInsertSQL(sql, params);

        }


        public static void registrarResultado(int ligaId, int idequipolocal, int idequipovisitante, int puntosLocal, int puntosVisitante) {
            String sql = "INSERT INTO partidos (liga_id, equipo_local_id, equipo_visitante_id, puntos_local, puntos_visitante) VALUES (?, ?, ?, ?, ?)";

            Object[] params = {ligaId, idequipolocal, idequipovisitante, puntosLocal, puntosVisitante};
            ConnectionManager.ejecutarInsertSQL(sql, params);
        }

        public static List<Equipo> obtenerPartidosPorLigaOrdenados(int ligaId) {
            String sql = "SELECT id, nombre, victorias, derrotas, puntos from equipos where idliga = ? order by puntos desc";

            Object[] params = {ligaId};
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


    }
