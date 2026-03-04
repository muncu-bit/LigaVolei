package edu.masanz.LigaVolei;

import edu.masanz.LigaVolei.Controller.*;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinFreemarker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("ARRANCANDO APLICACION");

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("public");
            config.fileRenderer(new JavalinFreemarker());
        }).start(8080);


        // inicio sesion
        app.get("/", LoginController::entrarIndex);
        app.post("/", LoginController::entrarIndex);
        app.get("/registro", LoginController::registro);
        app.post("/registro", LoginController::registro);

        //menu admin
        app.get("/index", LoginController::index);
        app.post("/index", LoginController::index);

        //usuario
        app.get("/usuarios/lista", UsuarioController::lista);
        app.post("/usuarios/lista", UsuarioController::lista);
        app.get("/usuarios/aceptar", UsuarioController::aceptar);
        app.post("/usuarios/aceptar", UsuarioController::aceptar);
        app.get("/usuarios/eliminar", UsuarioController::eliminar);
        app.post("/usuarios/eliminar", UsuarioController::eliminar);

        //equipos
        app.get("/equipos", EquipoController::equipo);
        app.post("/equipos", EquipoController::equipo);
        app.get("/equipos/lista", EquipoController::lista);
        app.post("/equipos/lista", EquipoController::lista);
        app.get("/equipos/eliminar", EquipoController::eliminar);
        app.post("/equipos/eliminar", EquipoController::eliminar);

        //ligas
        app.get("/ligas/crear", LigaController::crear);
        app.post("/ligas/crear", LigaController::crear);
        app.get("/ligas/editar", LigaController::editar);
        app.post("/ligas/editar", LigaController::editar);
        app.get("/ligas/eliminar", LigaController::eliminar);
        app.post("/ligas/eliminar", LigaController::eliminar);
        app.get("/ligas/lista", LigaController::lista);
        app.post("/ligas/lista", LigaController::lista);
        app.get("/ligas/lista/ver-liga", LigaController::ver);
        app.post("/ligas/lista/ver-liga", LigaController::ver);

        //otros
        app.get("/jornadas", EdicionController::jornada);
        app.post("/jornadas", EdicionController::jornada);
        app.get("/noticias", EdicionController::noticia);
    }

}