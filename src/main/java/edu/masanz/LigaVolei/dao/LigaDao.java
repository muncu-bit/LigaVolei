package edu.masanz.LigaVolei.dao;

import edu.masanz.LigaVolei.database.ConnectionManager;
import edu.masanz.LigaVolei.dto.Equipo;
import edu.masanz.LigaVolei.dto.Liga;

public class LigaDao {


    public static void agregarLiga(int id, String nombre) {
        String sql = "INSERT INTO ligas (id, nombre) VALUES (?,?)";
        Object[] params = {nombre, id};

        ConnectionManager.ejecutarInsertSQL(sql, params);
    }

    public static void editarLiga ( int id, String nombre) {
        String sql = "update ligas set nombre = ? where id = ?";
        Object[] params = {nombre, id};
        ConnectionManager.ejecutarInsertSQL(sql, params);
    }


    public static void eliminarLiga(int id) {
        String sql = "delete from ligas where id = ?";
        Object[] params = {id};
        ConnectionManager.ejecutarInsertSQL(sql, params);


    }
    public static void mostrarEquipos(Liga Liga) {
        System.out.println("Equipos de la liga: " );


    }

    public void simularPartidos() {
        
    }

/*
    public static List<LigaCrear> ListarRanking() {
        String sql = "Select * from ligas";




    }
*/
}
