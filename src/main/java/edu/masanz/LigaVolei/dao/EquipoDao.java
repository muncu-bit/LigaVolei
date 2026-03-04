package edu.masanz.LigaVolei.dao;

import edu.masanz.LigaVolei.database.ConnectionManager;

public class EquipoDao {

    public static void eliminarEquipo(int id) {
        String sql = "delete from equipos where id = ?";
        Object[] params = {id};
        ConnectionManager.ejecutarInsertSQL(sql, params);


    }

    public static void agregarEquipo(int id, String nombre) {
        String sql = "INSERT INTO equipos (id, nombre) VALUES (?,?)";
        Object[] params = {id, nombre};
        ConnectionManager.ejecutarInsertSQL(sql, params);

    }

}
