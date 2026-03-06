package edu.masanz.LigaVolei.service;

import edu.masanz.LigaVolei.dao.LigaDao;
import edu.masanz.LigaVolei.dto.Liga;

import java.util.List;

public class ServicioLiga {
    public static void agregarLiga(Liga liga) {
        LigaDao.agregarLiga(liga);
    }

    public static void eliminarLiga(int id) {
        LigaDao.eliminarLiga(id);
    }

    public static void actualizarLiga(Liga liga) {
        LigaDao.actualizarLiga(liga);
    }

    public List<Liga> listarLigas() {
        return LigaDao.listarLigas();
    }

}
