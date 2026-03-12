package edu.masanz.LigaVolei.dao;

import edu.masanz.LigaVolei.database.ConnectionManager;
import edu.masanz.LigaVolei.dto.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    public static Usuario userinicio(String nombre, String contrasena) {

        String sql = "SELECT id, nombre, contraseña FROM usuarios WHERE nombre = ? AND contraseña = ?";
        Object[] usuario = {nombre, contrasena};
        Object [][] usuarioregistrado = ConnectionManager.ejecutarSelectSQL(sql,usuario);


        if (usuarioregistrado != null && usuarioregistrado.length > 0) {

            int id = (int) usuarioregistrado[0][0];
            Usuario ejemplo = new Usuario(nombre, contrasena, id);

            return ejemplo;
        }
        return null;
    }



    public static void eliminarUsuario (int id) {
        String sql = "Delete from usuarios where id = ?";
        Object[]params = {id};
        ConnectionManager.ejecutarInsertSQL(sql, params);
    }

    public static void registrarUsuario(String usuario, String contra, String email, String salt) {
        String sql = "INSERT INTO usuarios (usuario,contra,email,salt) VALUES (?,?,?,?)";
        Object[] params = {usuario,contra,email,salt};

        ConnectionManager.ejecutarInsertSQL(sql,params);
    }

    public static List<Usuario> obtenerTodos() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        String sql = "SELECT  nombre FROM usuarios";
        Object[][] resultados = ConnectionManager.ejecutarSelectSQL(sql, new Object[]{});
        if (resultados != null) {
            for (Object[] fila : resultados) {
                int id = (int) fila[0];
                String nombre = (String) fila[1];
                String contra = (String) fila[2];
                listaUsuarios.add(new Usuario(nombre, contra, id));
            }
        }

        return listaUsuarios;
    }



    public static void main(String[] args) {
        ConnectionManager.conectar("voleiLiga", "Iker", "2345");
    }



}
