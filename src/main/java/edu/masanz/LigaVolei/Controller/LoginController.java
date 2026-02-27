package edu.masanz.LigaVolei.Controller;

import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class LoginController {


    public static void entrarIndex(Context context) {
        Map<String, Object> model = new HashMap<>();

        context.render("/templates/login.ftl", model);
        /*
        String rolUsuario = context.sessionAttribute("rol");

        if (rolUsuario == null) {
            context.redirect("/");
            return;
        }

        if (rolUsuario.equalsIgnoreCase("ADMIN")) {
            model.put("encabezado", "Menu Administrador");
            context.render("templates/index-admin.ftl", model);
        } else {
            model.put("encabezado", "Menu Usuario");
            context.render("templates/index-admin.ftl", model);
        }*/
    }

    public static void Index(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/index.ftl", model);
    }
}
