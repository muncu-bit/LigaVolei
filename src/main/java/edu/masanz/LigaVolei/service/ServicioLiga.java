package edu.masanz.LigaVolei.service;

import edu.masanz.LigaVolei.dao.LigaDao;

public class ServicioLiga {

    public static void crearLiga(String nombre,String descripcion,String img,String estadio){
        LigaDao.crearLiga(nombre,descripcion,img,estadio);
    }

    public static void eliminarLiga(String nombre){
        LigaDao.eliminarLiga(nombre);
    }


}
