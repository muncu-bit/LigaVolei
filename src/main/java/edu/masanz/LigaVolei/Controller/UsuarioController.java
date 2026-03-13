package edu.masanz.LigaVolei.Controller;

import edu.masanz.LigaVolei.dto.Usuario;
import edu.masanz.LigaVolei.service.ServicioUsuario;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsuarioController {

    public static void procesarLogin(String nombre, String contrasena) {
        Usuario usuario = ServicioUsuario.login(nombre, contrasena);

        if (usuario != null) {
            System.out.println("Bienvenido" + usuario.getNombre());

        } else {
            System.out.println("Error: Usuario o contraseña incorrectos.");
        }
    }

    public static void EliminacionUsuario(int id) {
        ServicioUsuario.borrarUsuario(id);
    }

    public static void agregarUsuario(String nombre, String contra, String email, String salt) {
        ServicioUsuario.agregarUsuario(nombre, contra, email, salt);
    }

    public static void lista(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        List<Usuario> usuario = ServicioUsuario.listarUsuarios();
        model.put("usuarios", usuario);
        context.render("templates/lista-usuarios.ftl", model);
    }

}
