package edu.masanz.LigaVolei.dao;

import edu.masanz.LigaVolei.database.ConnectionManager;
import edu.masanz.LigaVolei.dto.Partidos;

import java.util.List;

public class PartidoDao {

    public static void registrarResultado(int ligaId, int idequipolocal, int idequipovisitante, int puntosLocal, int puntosVisitante) {
        String sql = "INSERT INTO partidos (liga_id, equipo_local_id, equipo_visitante_id, puntos_local, puntos_visitante) VALUES (?, ?, ?, ?, ?)";

        Object[] params = {ligaId, idequipolocal, idequipovisitante, puntosLocal, puntosVisitante};
        ConnectionManager.ejecutarInsertSQL(sql, params);
    }

    public static List<Partidos> obtenerPartidos() {
        String sql = "SELECT * FROM partidos";
<<<<<<< HEAD
        return  null;
=======


>>>>>>> dcc5c8055c547fe5c3718155432927147bcd4a5e
    }
}
