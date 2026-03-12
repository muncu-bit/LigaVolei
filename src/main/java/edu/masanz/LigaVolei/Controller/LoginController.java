package edu.masanz.LigaVolei.Controller;

import edu.masanz.LigaVolei.Crypto.Hash;
import edu.masanz.LigaVolei.database.ConnectionManager;

import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class LoginController {


    public static void mostrarLogin(Context context) {
        Map<String, Object> model = new HashMap<>();

        context.render("/templates/login.ftl", model);
    }

    public static void mostrarRegistro(Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/registro.ftl", model);
    }

}
