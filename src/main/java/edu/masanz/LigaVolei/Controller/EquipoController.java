package edu.masanz.LigaVolei.Controller;

import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class EquipoController {

    public static void equipo(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/editar-equipos.ftl", model);
    }


    public static void lista(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/VerEquipoVolley.ftl", model);
    }

    public static void eliminar(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/eliminar-equipos.ftl", model);
    }
}
