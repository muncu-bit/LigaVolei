package edu.masanz.LigaVolei.Controller;

import edu.masanz.LigaVolei.dto.Jugador;
import edu.masanz.LigaVolei.service.ServicioJugador;
import io.javalin.http.Context;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JugadorController {


public static void servicioListaPorEquipo(Context context) {
    int idequipo = Integer.parseInt(context.pathParam("id"));
    Map<String, Object> model = new HashMap<>();
    List<Jugador> jugadores = ServicioJugador.listarJugadoresPorEquipo(idequipo);
    model.put("jugadores", jugadores);
    context.render("templates/lista-jugadores", model);

}

    public static void servirCrearJugadores(Context ctx) {
        int idEquipo = Integer.parseInt(ctx.pathParam("id"));

        Map<String, Object> model = new HashMap<>();
        model.put("equipoId", idEquipo);

        ctx.render("templates/CrearJugadores.ftl", model);
    }


public static void crearJugadores(Context context) {


    int equipoId = Integer.parseInt(context.formParam("equipoId"));

    String[] nombres = context.formParams("nombreJugador[]").toArray(new String[0]);
    String[] edades = context.formParams("edadJugador[]").toArray(new String[0]);
    String[] descripciones = context.formParams("descripcionJugador[]").toArray(new String[0]);


    for (int i = 0; i < nombres.length; i++) {

        // Evitar jugadores vacíos si el usuario deja alguno sin rellenar
        if (nombres[i] == null || nombres[i].isBlank())  continue;

        Jugador jugador = new Jugador(
                0,
                nombres[i],
                Integer.parseInt(edades[i]),
                descripciones[i],
                equipoId
        );

        ServicioJugador.agregarJugador(jugador);

    }

    context.redirect("/equipos/" + equipoId);
}

    public static void editarJugador(Context context) {

        int id = Integer.parseInt(context.pathParam("id"));
        String nombre = context.formParam("nombre");
        int edad = Integer.parseInt(context.formParam("edad"));
        String descripcion = context.formParam("descripcion");
        int equipoid = Integer.parseInt(context.formParam("equipoid"));

        Jugador jugador = new Jugador(id, nombre, edad, descripcion, equipoid);
        ServicioJugador.actualizarJugador(jugador);
        context.redirect("/jugador.ftl/" + id);
    }

    public static void eliminarJugador(Context context) {
    int id = Integer.parseInt(context.pathParam("id"));
    ServicioJugador.eliminarJugador(id);
    context.redirect("/lista-jugadores");
    }








}
