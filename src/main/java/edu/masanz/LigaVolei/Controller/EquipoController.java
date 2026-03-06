package edu.masanz.LigaVolei.Controller;

import edu.masanz.LigaVolei.dao.EquipoDao;
import edu.masanz.LigaVolei.dto.Equipo;
import edu.masanz.LigaVolei.service.ServicioEquipo;

import io.javalin.http.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquipoController {


    public static void eliminarEquipo(int id) {
        EquipoDao.eliminarEquipo(id);
    }


    public static ServicioEquipo servicioEquipo = new ServicioEquipo();

    public static void mostrarEquiposPorLiga(Context context) {
        int idLiga = Integer.parseInt(context.pathParam("ligaid"));
        Map <String, Object> model = new HashMap<>();
        List<Equipo> equipos = servicioEquipo.obtenerEquiposPorLiga(idLiga);
        model.put("equipos.ftl", equipos);
        context.render("templates/lista-equipos", model);

    }

    public static void crearEquipo(Context context) {

        String nombre = context.formParam("nombre");
        Equipo equipo = new Equipo(0,nombre, 0, 0);

        ServicioEquipo.agregarEquipo(equipo);
        context.redirect("/lista-equipos.ftl");

    }
    public static void eliminarEquipo(Context context) {
        int idEquipo = Integer.parseInt(context.pathParam("id"));

        ServicioEquipo.eliminarEquipo(idEquipo);
        context.redirect("/lista-equipos.ftl");
    }

    public static void editarEquipo(Context context) {

        int idEquipo = Integer.parseInt(context.pathParam("id"));
        String nombre = context.formParam("nombre");

        Equipo equipo = new Equipo(idEquipo, nombre, 0, 0);
        ServicioEquipo.actualizarEquipo(equipo);

        context.redirect("/equipo.ftl.ftl" + idEquipo);
    }

}