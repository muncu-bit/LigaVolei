package edu.masanz.LigaVolei.Controller;

import edu.masanz.LigaVolei.dao.UsuarioDao;
import edu.masanz.LigaVolei.dto.Usuariocrear;
import edu.masanz.LigaVolei.service.ServicioUsuario;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class UsuarioController {

    public static void procesarLogin(String nombre, String contraseña) {
        Usuariocrear usuario = ServicioUsuario.login(nombre, contraseña);

        if (usuario != null) {
            System.out.println("Bienvenido" + usuario.getNombre());

        } else {
            System.out.println("Error: Usuario o contraseña incorrectos.");
        }
    }

    public static void EliminacionUsuario(int id) {
        ServicioUsuario.borrarUsuario(id);
    }

    public static void agregarUsuario(String nombre, String contra) {
        ServicioUsuario.agregarUsuario(nombre, contra);
    }

    public static void lista(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/lista-usuarios.ftl", model);
    }

    public static void aceptar(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/aceptar-usuario.ftl", model);
    }

    public static void eliminar(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/eliminar-usuario.ftl", model);
    }
}
