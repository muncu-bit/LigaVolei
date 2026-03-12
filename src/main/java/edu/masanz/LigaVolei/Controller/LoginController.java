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

    public static void login(@NotNull Context context) {
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

    public static void registrar(Context context) {
        String usuario = context.formParam("usuario");
        String email = context.formParam("email");
        String password = context.formParam("password");
        String confirmPassword = context.formParam("confirmPassword");

        Map<String, Object> model = new HashMap<>();

        // comprobar contraseñas
        if (!password.equals(confirmPassword)) {
            model.put("error", "Las contraseñas no coinciden");
            context.render("/templates/registro.ftl", model);
            return;
        }

        // generar SALT
        String salt = Hash.generarSalt();

        // generar HASH
        String hash = Hash.hash(password, salt);

        // rol por defecto (usuario normal)
        int rol = 2;

        String sql = "INSERT INTO usuarios (email, usuario, contra, salt, rol) VALUES (?, ?, ?, ?, ?)";
        Object[] params = {email, usuario, hash, salt, rol};

        long id = ConnectionManager.ejecutarInsertSQL(sql, params);

        if (id > 0) {
            context.redirect("/login");
        } else {
            model.put("error", "Error al registrar usuario");
            context.render("/templates/registro.ftl", model);
        }
    }
}
