package edu.masanz.LigaVolei;

import edu.masanz.LigaVolei.Controller.*;
import edu.masanz.LigaVolei.database.ConnectionManager;
import edu.masanz.LigaVolei.service.ServicioEdicion;
import edu.masanz.LigaVolei.service.ServicioLogin;
import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinFreemarker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("ARRANCANDO APLICACION");

        ConnectionManager.conectar("VoleiLiga", "proy", "password");

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("public");
            config.fileRenderer(new JavalinFreemarker());
        }).start(7070);

        //Zona login
        app.get("/", LoginController::mostrarLogin);
        app.post("/", ServicioLogin::login);

        app.get("/registro", LoginController::mostrarRegistro);
        app.post("/registro", ServicioLogin::registrar);

        //index
        app.get("/index",LoginController::mostrarIndex);
        app.post("/index",LoginController::mostrarIndex);

        // usuarios
        app.get("/usuarios/lista", UsuarioController::lista);
        app.post("/usuarios/lista", UsuarioController::lista);
        app.get("/usuarios/eliminar", ctx -> {
            String idParam = ctx.queryParam("id");
            if (idParam != null) {
                int id = Integer.parseInt(idParam);
                UsuarioController.EliminacionUsuario(id);
            }
            ctx.redirect("/usuarios/lista");
        });


        //ligas
        app.get("/liga/crear", LigaController::servirCrearLiga);
        app.post("/liga/crear", LigaController::crearLiga);
        app.get("/ligas/editar", LigaController::mostrarLigasParaEditar);
        app.get("/liga/{id}/editar", LigaController::servirEditarLiga);
        app.post("/liga/{id}/editar", LigaController::editarLiga);
        app.get("/liga/eliminar", LigaController::servirListaParaEliminar);
        app.post("/ligas/{id}/eliminar", LigaController::eliminarLiga);
        app.get("/ligas", LigaController::servirLista);
        app.get("/liga/{id}", EquipoController::mostrarEquiposPorLiga);

        //Crear Equipo

        app.get("/equipos/crear", EquipoController::servirCrearEquipo);
        app.post("/equipos/crear", EquipoController::crearEquipo);

        app.get("/equipos/eliminar", EquipoController::mostrarEquiposParaEliminar);
        app.post("/equipo/{id}/eliminar", EquipoController::eliminarEquipo);

        app.get("/equipos/{id}", EquipoController::verEquipo);

        //Crear jugadores (6)

        app.get("/equipos/{id}/jugadores/crear", JugadorController::servirCrearJugadores);
        app.post("/jugadores/crear", JugadorController::crearJugadores);

        app.get("equipos/{id}/jugadores", JugadorController::servicioListaPorEquipo);
        app.post("/liga/{id}/avanzar", PartidoController::avanzarJornada);

        //otros
        app.get("/jornada/editar", EdicionController::jornada);
        app.get("/noticia/editar", EdicionController::noticia);

        // editar noticias
        app.post("/editar-noticia", ServicioEdicion::editarNoticia);
    }

}