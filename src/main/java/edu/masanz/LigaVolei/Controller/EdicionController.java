package edu.masanz.LigaVolei.Controller;

import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class EdicionController {

    public static void jornada(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/editar-jornadas.ftl", model);
    }

    public static void noticia(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/editar-noticias.ftl", model);
    }
}
