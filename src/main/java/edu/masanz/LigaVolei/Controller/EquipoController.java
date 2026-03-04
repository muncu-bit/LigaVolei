package edu.masanz.LigaVolei.Controller;

import edu.masanz.LigaVolei.dao.EquipoDao;

public class EquipoController {


    public static void eliminarEquipo(int id) {
        EquipoDao.eliminarEquipo(id);
    }

    public static void agregarEquipo(int id, String nombre) {
        EquipoDao.agregarEquipo(id, nombre);
    }
}
