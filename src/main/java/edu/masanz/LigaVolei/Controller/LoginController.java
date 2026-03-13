package edu.masanz.LigaVolei.Controller;

import edu.masanz.LigaVolei.Crypto.Hash;
import edu.masanz.LigaVolei.database.ConnectionManager;

import edu.masanz.LigaVolei.dto.Usuario;
import edu.masanz.LigaVolei.service.ServicioUsuario;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
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

    public static void mostrarIndex(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        List<Usuario> usuario = ServicioUsuario.listarUsuarios();
        model.put("usuarios", usuario);
        context.render("/templates/index.ftl", model);
    }
}
