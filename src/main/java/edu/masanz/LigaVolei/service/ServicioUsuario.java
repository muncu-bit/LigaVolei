package edu.masanz.LigaVolei.service;

import edu.masanz.LigaVolei.dao.UsuarioDao;
import edu.masanz.LigaVolei.dto.Usuario;

import java.util.List;

public class ServicioUsuario {
    public static Usuario login(String nombre, String contrasena) {

        if (nombre == null && contrasena == null) {

            return null;
        } else {
            return UsuarioDao.userinicio(nombre, contrasena);
        }
    }

    public static void borrarUsuario(int id) {
        UsuarioDao.eliminarUsuario(id);
    }

    public static void agregarUsuario(String nombre, String contra, String email, String salt) {
        UsuarioDao.registrarUsuario(nombre,contra, email, salt);
    }

    public static List<Usuario> listarUsuarios() {
        return UsuarioDao.listarUsuarios();
    }
}
