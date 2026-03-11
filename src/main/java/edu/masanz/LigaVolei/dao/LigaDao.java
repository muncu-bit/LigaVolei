package edu.masanz.LigaVolei.dao;

import edu.masanz.LigaVolei.database.ConnectionManager;
import edu.masanz.LigaVolei.dto.Equipo;
import edu.masanz.LigaVolei.dto.Liga;

import java.util.ArrayList;
import java.util.List;

public class LigaDao {


    public static void agregarLiga(Liga liga) {
        String sql = "INSERT INTO ligas (nombre) VALUES (?)";
        Object[] params =  {liga.getNombre()};

        ConnectionManager.ejecutarInsertSQL(sql, params);
    }

    public static void actualizarLiga (Liga liga) {
        String sql = "UPDATE ligas SET nombre = ? WHERE id = ?";
        Object[] params = {liga.getNombre(), liga.getId()};
        ConnectionManager.ejecutarInsertSQL(sql, params);
    }


    public static void eliminarLiga(int id) {
        String sql = "delete from ligas where id = ?";
        Object[] params = {id};
        ConnectionManager.ejecutarInsertSQL(sql, params);
    }




    public static List<Liga> listarLigas() {
        String sql = "Select * from ligas";
        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, null);

        List<Liga> ligas = new ArrayList<>();
        if (resultado != null) {
            for (Object[] row : resultado) {
                ligas.add(new Liga(
                        (int) row[0],
                        (String) row[1]

                ));
            }
        }
        return ligas;
    }

}
