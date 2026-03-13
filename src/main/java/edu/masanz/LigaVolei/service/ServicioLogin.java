package edu.masanz.LigaVolei.service;

import edu.masanz.LigaVolei.Crypto.Hash;
import edu.masanz.LigaVolei.dao.UsuarioDao;
import edu.masanz.LigaVolei.dto.LoginRequestDto;
import edu.masanz.LigaVolei.dto.RegistroRequestDto;
import edu.masanz.LigaVolei.dto.Usuario;

public class ServicioLogin {

    public static Usuario autenticar(LoginRequestDto request) {
        if (request == null) {
            return null;
        }

        String email = request.getEmail();
        String password = request.getPassword();

        if (isBlank(email) || isBlank(password)) {
            return null;
        }

        Usuario usuario = UsuarioDao.obtenerPorEmail(email);
        if (usuario == null) {
            return null;
        }

        String hashIntroducido = Hash.hash(password, usuario.getSalt());
        if (!hashIntroducido.equals(usuario.getContrasena())) {
            return null;
        }

        return usuario;
    }

    public static String registrar(RegistroRequestDto request) {
        if (request == null) {
            return "Datos de registro invalidos";
        }

        String usuario = request.getUsuario();
        String email = request.getEmail();
        String password = request.getPassword();
        String confirmPassword = request.getConfirmPassword();

        if (isBlank(usuario) || isBlank(email) || isBlank(password) || isBlank(confirmPassword)) {
            return "Rellena todos los campos";
        }

        if (!password.equals(confirmPassword)) {
            return "Las contrasenas no coinciden";
        }

        if (UsuarioDao.existeEmail(email)) {
            return "El email ya esta registrado";
        }

        if (UsuarioDao.existeUsuario(usuario)) {
            return "El usuario ya esta registrado";
        }

        String salt = Hash.generarSalt();
        String hash = Hash.hash(password, salt);

        int rol = 2;
        long id = UsuarioDao.registrarUsuario(usuario, hash, email, salt, rol);

        if (id <= 0) {
            return "Error al registrar usuario";
        }

        return null;
    }

    private static boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}
