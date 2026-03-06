package edu.masanz.LigaVolei.service;

import edu.masanz.LigaVolei.dao.UsuarioDao;
import edu.masanz.LigaVolei.dto.Usuario;

public class ServicioUsuario {
    public static Usuario login(String nombre, String contraseña) {

        if (nombre == null && contraseña == null) {

            return null;
        } else {
            return UsuarioDao.userinicio(nombre, contraseña);
        }
    }
    
    public static void borrarUsuario(int id) {
        UsuarioDao.eliminarUsuario(id);
    }

    public static void agregarUsuario(String nombre, String contra) {
        UsuarioDao.registrarUsuario(nombre,contra);
    }
}
