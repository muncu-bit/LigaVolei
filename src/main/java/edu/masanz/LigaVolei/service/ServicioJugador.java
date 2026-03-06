package edu.masanz.LigaVolei.service;

import edu.masanz.LigaVolei.dao.JugadorDao;
import edu.masanz.LigaVolei.dto.Jugador;

import java.util.List;

public class ServicioJugador {

    public static void agregarJugador(Jugador jugador) {
        JugadorDao.agregarJugador(jugador);
    }

    public static void actualizarJugador(Jugador jugador) {
        JugadorDao.actualizarJugador(jugador);
    }

    public static void eliminarJugador(int id) {
        JugadorDao.eliminarJugador(id);
    }

    public static List<Jugador> listarJugadores(int equipoid) {
        return JugadorDao.listarJugadoresPorEquipo(equipoid);
    }

}
