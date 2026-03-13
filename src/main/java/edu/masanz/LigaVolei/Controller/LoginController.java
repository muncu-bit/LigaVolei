package edu.masanz.LigaVolei.Controller;

import edu.masanz.LigaVolei.dto.LoginRequestDto;
import edu.masanz.LigaVolei.dto.RegistroRequestDto;
import edu.masanz.LigaVolei.dto.Usuario;
import edu.masanz.LigaVolei.service.ServicioLogin;
import edu.masanz.LigaVolei.service.ServicioUsuario;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginController {

    public static void mostrarLogin(Context context) {
        if (context.sessionAttribute("usuarioId") != null) {
            context.redirect("/index");
            return;
        }
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/login.ftl", model);
    }

    public static void procesarLogin(@NotNull Context context) {
        LoginRequestDto request = new LoginRequestDto(
                context.formParam("email"),
                context.formParam("password")
        );

        Usuario usuario = ServicioLogin.autenticar(request);
        if (usuario != null) {
            context.sessionAttribute("usuarioId", usuario.getId());
            context.sessionAttribute("usuarioNombre", usuario.getNombre());
            context.sessionAttribute("usuarioRol", usuario.getRol());
            context.redirect("/index");
            return;
        }

        Map<String, Object> model = new HashMap<>();
        model.put("error", "Email o contrasena incorrectos");
        context.render("/templates/login.ftl", model);
    }

    public static void mostrarRegistro(Context context) {
        if (context.sessionAttribute("usuarioId") != null) {
            context.redirect("/index");
            return;
        }
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/registro.ftl", model);
    }

    public static void procesarRegistro(@NotNull Context context) {
        RegistroRequestDto request = new RegistroRequestDto(
                context.formParam("usuario"),
                context.formParam("email"),
                context.formParam("password"),
                context.formParam("confirmPassword")
        );

        String error = ServicioLogin.registrar(request);
        if (error != null) {
            Map<String, Object> model = new HashMap<>();
            model.put("error", error);
            context.render("/templates/registro.ftl", model);
            return;
        }

        context.redirect("/");
    }

    public static void cerrarSesion(@NotNull Context context) {
        context.req().getSession().invalidate();
        context.redirect("/");
    }

    public static void mostrarIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        List<Usuario> usuario = ServicioUsuario.listarUsuarios();
        model.put("usuarios", usuario);
        context.render("/templates/index.ftl", model);
    }
}
