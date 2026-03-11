package edu.masanz.LigaVolei.Controller;

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
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/index.ftl", model);
    }
}
