package edu.masanz.LigaVolei.service;

import edu.masanz.LigaVolei.dao.UsuarioDao;
import edu.masanz.LigaVolei.dto.Usuariocrear;

public class ServicioUsuario {
    public static Usuariocrear login(String nombre, String contraseña) {

        if (nombre == null && contraseña == null) {

            return null;
        } else {
            return UsuarioDao.userinicio(nombre, contraseña);
        }

    }
}
