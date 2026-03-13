package edu.masanz.LigaVolei.dao;

import edu.masanz.LigaVolei.database.ConnectionManager;
import edu.masanz.LigaVolei.dto.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    public static Usuario userinicio(String nombre, String contrasena) {

        String sql = "SELECT id, usuario, contra FROM usuarios WHERE usuario = ? AND contra = ?";
        Object[] usuario = {nombre, contrasena};
        Object [][] usuarioregistrado = ConnectionManager.ejecutarSelectSQL(sql,usuario);

        if (usuarioregistrado != null && usuarioregistrado.length > 0) {
            int id = (int) usuarioregistrado[0][0];
            return new Usuario(nombre, contrasena, id);
        }
        return null;
    }



    public static void eliminarUsuario (int id) {
        String sql = "Delete from usuarios where id = ?";
        Object[]params = {id};
        ConnectionManager.ejecutarInsertSQL(sql, params);
    }

    public static Usuario obtenerPorEmail(String email) {
        String sql = "SELECT id, usuario, email, contra, salt, rol FROM usuarios WHERE email = ?";
        Object[] params = {email};
        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);

        if (resultado != null && resultado.length > 0) {
            Object[] row = resultado[0];
            int id = (int) row[0];
            String usuario = (String) row[1];
            String emailDb = (String) row[2];
            String contra = (String) row[3];
            String salt = (String) row[4];
            int rol = (int) row[5];
            return new Usuario(id, usuario, emailDb, contra, salt, rol);
        }
        return null;
    }

    public static boolean existeEmail(String email) {
        String sql = "SELECT id FROM usuarios WHERE email = ?";
        Object[] params = {email};
        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);
        return resultado != null && resultado.length > 0;
    }

    public static boolean existeUsuario(String usuario) {
        String sql = "SELECT id FROM usuarios WHERE usuario = ?";
        Object[] params = {usuario};
        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);
        return resultado != null && resultado.length > 0;
    }

    public static long registrarUsuario(String usuario, String contra, String email, String salt) {
        return registrarUsuario(usuario, contra, email, salt, 2);
    }

    public static long registrarUsuario(String usuario, String contra, String email, String salt, int rol) {
        String sql = "INSERT INTO usuarios (email, usuario, contra, salt, rol) VALUES (?, ?, ?, ?, ?)";
        Object[] params = {email, usuario, contra, salt, rol};

        return ConnectionManager.ejecutarInsertSQL(sql,params);
    }

    public static List<Usuario> listarUsuarios() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        String sql = "SELECT id, usuario FROM usuarios";
        Object[][] resultados = ConnectionManager.ejecutarSelectSQL(sql, new Object[]{});
        if (resultados != null) {
            for (Object[] fila : resultados) {
                int id = (int) fila[0];
                String nombre = (String) fila[1];
                listaUsuarios.add(new Usuario(nombre, "", id));
            }
        }

        return listaUsuarios;
    }



    public static void main(String[] args) {
        ConnectionManager.conectar("voleiLiga", "Iker", "2345");
    }



}
