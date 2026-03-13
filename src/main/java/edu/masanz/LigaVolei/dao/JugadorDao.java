package edu.masanz.LigaVolei.dao;

import edu.masanz.LigaVolei.database.ConnectionManager;
import edu.masanz.LigaVolei.dto.Jugador;

import java.util.ArrayList;
import java.util.List;

public class JugadorDao {

    public static void agregarJugador(Jugador jugador) {

        String sql = "Insert into jugadores (nombre, edad, descripcion, idequipo) Values (?,?,?,?)";

        Object[] params = {
                jugador.getNombre(),
                jugador.getEdad(),
                jugador.getDescripcion(),
                jugador.getEquipoid(),
        };

        ConnectionManager.ejecutarInsertSQL(sql, params);
    }

    public static void eliminarJugador(int id) {
        String sql = "DELETE FROM jugadores WHERE id = ?";

        Object[] params = {id};

        ConnectionManager.ejecutarInsertSQL(sql, params);
    }


    public static void actualizarJugador(Jugador jugador) {

        String sql = "UPDATE jugadores SET nombre=?, edad=?, descripcion=?, idequipo=? WHERE id=?";

        Object[] params = {
                jugador.getNombre(),
                jugador.getEdad(),
                jugador.getDescripcion(),
                jugador.getId()
        };
        ConnectionManager.ejecutarInsertSQL(sql, params);
    }

    public static List<Jugador> listarJugadoresPorEquipo(int equipoId) {
        String sql = "SELECT * FROM jugadores WHERE idequipo = ?";
        Object[] params = {equipoId};

        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);

        List<Jugador> jugadores = new ArrayList<>();

        if (resultado != null && resultado.length > 0) {
            for (Object[] row : resultado) {
                Jugador j = new Jugador(
                        (int) row[0],
                        (String) row[1],
                        (int) row[2],
                        (String) row[3],
                        (int) row[4]

                );
                jugadores.add(j);
            }
        }
        return jugadores;
    }
}



