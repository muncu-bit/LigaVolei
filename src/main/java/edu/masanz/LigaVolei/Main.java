package edu.masanz.LigaVolei;

import edu.masanz.LigaVolei.Controller.*;

import edu.masanz.LigaVolei.database.ConnectionManager;
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
        }).start(8080);


        //Zona login
        app.get("/", LoginController::mostrarLogin);
        app.post("/", LoginController::mostrarLogin);

        app.get("/registro", LoginController::mostrarRegistro);
        app.post("/registro", LoginController::registrar);

        //index
        app.get("/index", LoginController::login);
        app.post("/index", LoginController::login);

        // usuarios
        app.get("/usuarios/lista", UsuarioController::lista);
        app.post("/usuarios/lista", UsuarioController::lista);




        //ligas

        app.get("/liga/crear", LigaController::servirCrearLiga); // CrearLiga
        app.post("/liga/crear", LigaController::crearLiga);

        app.get("/ligas/{id}/editar", LigaController::servirListaParaEditar);
        app.post("/ligas/{id}/editar", LigaController::editarLiga);


        app.get("/liga/eliminar", LigaController::servirListaParaEliminar);
        app.post("/liga/{id}/eliminar", LigaController::eliminarLiga); // EliminarLiga

        app.get("/ligas", LigaController::servirLista);// Lista todas las ligas
        app.get("/liga/{id}", EquipoController::mostrarEquiposPorLiga); // Verliga

        //equipos.ftl





        //otros
        app.get("/jornada/editar", EdicionController::jornada);
        app.get("/noticia/editar", EdicionController::noticia);



    }

}