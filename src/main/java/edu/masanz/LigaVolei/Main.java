package edu.masanz.LigaVolei;

import edu.masanz.LigaVolei.Controller.EdicionController;
import edu.masanz.LigaVolei.Controller.LigaController;
import edu.masanz.LigaVolei.Controller.LoginController;

import edu.masanz.LigaVolei.Controller.UsuarioController;
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


        //Zona login
        app.get("/", LoginController::entrarIndex);
        app.post("/", LoginController::entrarIndex);

        //index
        app.get("/index", LoginController::index);
        app.post("/index", LoginController::index);

        // usuarios
        app.get("/usuarios/lista", UsuarioController::lista);


        //ligas
        app.get("/liga/lista", LigaController::servirLista);

        //equipos


        //otros
        app.get("/jornada/editar", EdicionController::jornada);
        app.get("/noticia/editar", EdicionController::noticia);



    }

}