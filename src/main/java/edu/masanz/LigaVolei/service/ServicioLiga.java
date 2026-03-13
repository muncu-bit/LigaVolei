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

        public static void actualizarNombreLiga(int id, String nuevoNombre) {
        LigaDao.actualizarNombreLiga(id, nuevoNombre);
        }

        public List<Liga> listarLigas() {
            return LigaDao.listarLigas();
        }

        public static Liga obtenerLiga(int id) {
            return LigaDao.obtenerLiga(id);
        }

    }
