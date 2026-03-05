package edu.masanz.LigaVolei.dao;

public class LigaDao {

    public static void crearLiga(String nombre,String descripcion,String img,String estadio){
        String sql = "INSERT INTO ligas (nombre,descripcion,img,estadio) VALUES (?,?,?,?);";
    }

    public static void eliminarLiga(String nombre){
        String sql = "DELETE FROM ligas WHERE nombre = ?;";
    }

    public static void verLigas(){
        String sql ="SELECT * FROM ligas";
    }

    public static void editarLiga(String nombre, String descripcion){
        String sql = "UPDATE ligas SET nombre = ?, descripcion = ? where id = ?";
    }

}
