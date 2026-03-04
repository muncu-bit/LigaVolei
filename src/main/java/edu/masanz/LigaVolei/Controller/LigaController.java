package edu.masanz.LigaVolei.Controller;

import edu.masanz.LigaVolei.dao.LigaDao;
import edu.masanz.LigaVolei.dto.Liga;

public class LigaController {

    public static void AgregarLiga (int id, String nombre) {
    LigaDao.agregarLiga(id, nombre);
    }

    public static void EliminarLiga (int id) {
        LigaDao.eliminarLiga(id);
    }

    public static void EditarLiga (int id, String nombre) {
        LigaDao.editarLiga(id, nombre);
    }

    public static void mostrarLigas() {


    }

    public static void mostrarRankingEquipos(Liga liga) {
        LigaDao.mostrarEquipos(liga);
    }




}
