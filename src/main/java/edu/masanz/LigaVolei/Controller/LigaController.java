package edu.masanz.LigaVolei.Controller;

import edu.masanz.LigaVolei.dao.LigaDao;
import edu.masanz.LigaVolei.dto.Liga;
import edu.masanz.LigaVolei.service.ServicioLiga;
import io.javalin.http.Context;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LigaController {

    private static ServicioLiga servicioLiga = new ServicioLiga();

    public static void servirLista(Context context) {
        Map<String,Object> model = new HashMap<>();
        List<Liga> ligas = servicioLiga.listarLigas();
        model.put("ligas", ligas);
        context.render("templates/lista-ligas.ftl", model);
    }

    public static void crearLiga(Context context) {
        String nombre = context.formParam("nombre");
        String descripcion = context.formParam("descripcion");
        Liga liga = new Liga(0, nombre, descripcion);
        servicioLiga.agregarLiga(liga);
        context.redirect("/lista-ligas.ftl");

    }

    public static void editarLiga(Context context) {
        int idLiga = Integer.parseInt(context.formParam("id"));
        String nombre = context.formParam("nombre");
        String descripcion = context.formParam("descripcion");
        Liga liga = new Liga(idLiga, nombre, descripcion);
        servicioLiga.actualizarLiga(liga);
        context.redirect("/liga" + idLiga);
    }

    public static void eliminarLiga(Context context) {
        int idLiga = Integer.parseInt(context.formParam("id"));
        servicioLiga.eliminarLiga(idLiga);
        context.redirect("/lista-ligas.ftl");
    }
}
