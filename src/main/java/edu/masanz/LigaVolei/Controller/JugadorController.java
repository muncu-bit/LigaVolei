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
    List<Jugador> jugadores = ServicioJugador.listarJugadores(idequipo);
    model.put("jugadores", jugadores);
    context.render("templates/lista-jugadores", model);

}

public static void crearJugador(Context context) {

    String nombre = context.formParam("nombre");
    int edad = Integer.parseInt(context.formParam("edad"));
    String descripcion = context.formParam("descripcion");
    int equipoid = Integer.parseInt(context.formParam("equipoid"));

    Jugador jugador = new Jugador(0, nombre, edad, descripcion, equipoid);
    ServicioJugador.agregarJugador(jugador);
    context.redirect("/lista-jugadores");
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
