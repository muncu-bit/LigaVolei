package edu.masanz.LigaVolei.Controller;

import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class LigaController {
    public static void crear(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/CrearLigaVolley.ftl", model);
    }

    public static void editar(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/EditarLigaVolley.ftl", model);
    }

    public static void eliminar(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/EliminarLigas.ftl", model);
    }

    public static void lista(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/ListadeLigasVolley.ftl", model);
    }

    public static void ver(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();
        context.render("/templates/VerLigaVolley.ftl", model);
    }
}
