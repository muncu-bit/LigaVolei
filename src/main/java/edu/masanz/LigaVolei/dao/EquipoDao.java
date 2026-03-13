package edu.masanz.LigaVolei.dao;

import edu.masanz.LigaVolei.database.ConnectionManager;
import edu.masanz.LigaVolei.dto.Equipo;

import java.util.ArrayList;
import java.util.List;

public class EquipoDao {

    public static void eliminarEquipo(int id) {
        String sql = "delete from equipos where id = ?";
        Object[] params = {id};
        ConnectionManager.ejecutarInsertSQL(sql, params);
    }

    public static void agregarEquipo(Equipo equipo) {
        String sql = "INSERT INTO equipos (nombre, victorias, derrotas, puntos) VALUES (?,0,0,0)";
        Object[] params = {equipo.getNombre()};
        ConnectionManager.ejecutarInsertSQL(sql, params);
    }

    public static void actualizarEquipo(Equipo equipo) {

        String sql = "UPDATE equipos SET nombre = ?, victorias=?, derrotas=?, puntos=? WHERE id = ?";

        Object[] params = {
                equipo.getNombre(),
                equipo.getVictorias(),
                equipo.getDerrotas(),
                equipo.getId(),
                equipo.getPuntos()
        };
        ConnectionManager.ejecutarInsertSQL(sql, params);
    }



    public static List<Equipo> obtenerEquiposPorLiga(int ligaid) {
        String sql = "SELECT * FROM equipos WHERE idliga = ?";
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


}
