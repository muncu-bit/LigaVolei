package edu.masanz.LigaVolei.dao;

import edu.masanz.LigaVolei.database.ConnectionManager;
import edu.masanz.LigaVolei.dto.Usuariocrear;
import org.eclipse.jetty.server.Authentication;

public class UsuarioDao {

    public static Usuariocrear userinicio(String nombre, String contrasena) {

        String sql = "SELECT id, nombre, contraseña FROM usuarios WHERE nombre = ? AND contraseña = ?";
        Object[] usuario = {nombre, contrasena};
       Object [][] usuarioregistrado = ConnectionManager.ejecutarSelectSQL(sql,usuario);


        if (usuarioregistrado != null && usuarioregistrado.length > 0) {

            int id = (int) usuarioregistrado[0][0];

            Usuariocrear ejemplo = new Usuariocrear(nombre, contrasena, id);

                    return ejemplo;
        }
        return null;
    }



    public static void eliminarUsuario (int id) {
        String sql = "Delete from usuarios where id = ?";
        Object[]params = {id};
        ConnectionManager.ejecutarInsertSQL(sql, params);
    }


    public static void main(String[] args) {
        ConnectionManager.conectar("voleiLiga", "prueba", "prueba123");


    }


}
