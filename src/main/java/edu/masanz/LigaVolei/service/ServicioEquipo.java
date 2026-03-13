package edu.masanz.LigaVolei.service;

import edu.masanz.LigaVolei.dao.EquipoDao;
import edu.masanz.LigaVolei.dto.Equipo;

import java.util.List;

public class ServicioEquipo {


    public static long agregarEquipo(Equipo equipo) {
        return EquipoDao.agregarEquipo(equipo);
    }

    public Equipo obtenerEquipoPorId(int idEquipo) {
        return EquipoDao.obtenerEquipoPorId(idEquipo);
    }

    public static void eliminarEquipo(int id) {
        EquipoDao.eliminarEquipo(id);
    }

    public static void actualizarEquipo(Equipo equipo) {
        EquipoDao.actualizarEquipo(equipo);
    }

    public List<Equipo> obtenerEquiposPorLiga(int ligaid) {
        return EquipoDao.obtenerEquiposPorLiga(ligaid);
    }
}
