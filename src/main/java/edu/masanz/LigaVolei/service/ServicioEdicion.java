package edu.masanz.LigaVolei.service;

import io.javalin.http.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ServicioEdicion {
    public static ArrayList<Map<String,String>> noticias = new ArrayList<>();

    public static void editarNoticia(Context ctx) {

        int id = Integer.parseInt(ctx.formParam("id"));
        String titulo = ctx.formParam("titulo");
        String descripcion = ctx.formParam("descripcion");
        String texto = ctx.formParam("texto");

        Map<String,String> noticia = noticias.get(id);

        noticia.put("titulo", titulo);
        noticia.put("descripcion", descripcion);
        noticia.put("texto", texto);

        ctx.redirect("/noticias");
    }
}
