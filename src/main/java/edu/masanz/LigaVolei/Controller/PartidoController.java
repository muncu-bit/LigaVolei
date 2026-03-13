package edu.masanz.LigaVolei.Controller;

import edu.masanz.LigaVolei.service.ServicioPartido;
import io.javalin.http.Context;

    public class PartidoController {


        public static void avanzarJornada( Context context) {

            int ligaid = Integer.parseInt(context.pathParam("id"));

            ServicioPartido.jugarJornada(ligaid);

            context.redirect("/liga/"+ligaid);
        }
    }
