package edu.masanz.LigaVolei.Controller;

import edu.masanz.LigaVolei.Crypto.Hash;
import edu.masanz.LigaVolei.database.ConnectionManager;

import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class LoginController {


    public static void entrarIndex(Context context) {
        Map<String, Object> model = new HashMap<>();

        context.render("/templates/login.ftl", model);
        
    }

    public static void index(@NotNull Context context) {
        String email = context.formParam("email");
        String password = context.formParam("password");

        Map<String, Object> model = new HashMap<>();

        String sql = "SELECT contra, salt FROM usuarios WHERE email = ?";
        Object[] params = {email};

        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);

        if (resultado != null && resultado.length > 0) {

            String contraBD = (String) resultado[0][0];
            String saltBD = (String) resultado[0][1];

            String hashIntroducido = Hash.hash(password, saltBD);

            if (hashIntroducido.equals(contraBD)) {
                context.render("/templates/index.ftl", model);
                return;
            }
        }

        model.put("error", "Email o contraseña incorrectos");
        context.render("/templates/login.ftl", model);
    }
}
