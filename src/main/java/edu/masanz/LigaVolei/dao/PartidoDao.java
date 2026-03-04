package edu.masanz.LigaVolei.dao;

import edu.masanz.LigaVolei.database.ConnectionManager;
import edu.masanz.LigaVolei.dto.Partido;

import java.util.Random;

public class PartidoDao {

    public static void registrarResultado(int ligaId, int idequipolocal, int idequipovisitante, int puntosLocal, int puntosVisitante) {

        String sql = "INSERT INTO partidos (liga_id, equipo_local_id, equipo_visitante_id, puntos_local, puntos_visitante) VALUES (?, ?, ?, ?, ?)";

        Object[] params = {ligaId, idequipolocal, idequipovisitante, puntosLocal, puntosVisitante};
        ConnectionManager.ejecutarInsertSQL(sql, params);
    }

    /*
    public static List<Partido> obtenerPartidos() {
        String sql = "SELECT * FROM partidos";

    }
   */

    public static void simularPartido(Partido partido) {
        Random random = new Random();
        int setsLocal = 0;
        int setsVisitante = 0;

        while (setsLocal < 3 && setsVisitante < 3) {
                if (Math.random() < 0.5) {
                    setsLocal++;
                } else {
                    setsVisitante++;
                }

                partido.setPuntosLocal(setsLocal);
        }

        }

    public static void RegistrarResultado (Partido partido, int local, int visitante) {

        partido.setPuntosLocal(local);
        partido.setPuntosVisitante(visitante);
    }


}
