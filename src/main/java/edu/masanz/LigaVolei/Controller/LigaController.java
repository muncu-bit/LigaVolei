package edu.masanz.LigaVolei.Controller;

import edu.masanz.LigaVolei.dao.LigaDao;
import edu.masanz.LigaVolei.dto.Liga;
import edu.masanz.LigaVolei.service.ServicioLiga;
import io.javalin.http.Context;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public  class LigaController {

        private static ServicioLiga servicioLiga = new ServicioLiga();

        public static void servirLista(Context context) {
            Map<String,Object> model = new HashMap<>();
            List<Liga> ligas = servicioLiga.listarLigas();
            model.put("ligas", ligas);
            context.render("templates/lista-ligas.ftl", model);
        }

        public static void servirListaParaEliminar(Context context) {
            Map<String,Object> model = new HashMap<>();
            List<Liga> ligas = servicioLiga.listarLigas();
            model.put("ligas", ligas);
            context.render("templates/EliminarLigas.ftl", model);
        }


        public static void servirEditarLiga(Context ctx) {
            int id = Integer.parseInt(ctx.pathParam("id"));
            Liga liga = ServicioLiga.obtenerLiga(id);

            ctx.render("templates/EditarLiga.ftl", Map.of(
                    "liga", liga
            ));
        }

        public static void servirCrearLiga(Context context) {
            context.render("/templates/CrearLigaVolley.ftl");
        }

        public static void crearLiga(Context context) {
            String nombre = context.formParam("nombre");
            Liga liga = new Liga(0, nombre);
            liga.setNombre(nombre);
            servicioLiga.agregarLiga(liga);
            context.redirect("/ligas");

        }

        public static void editarLiga(Context ctx) {
            int id = Integer.parseInt(ctx.pathParam("id"));
            String nuevoNombre = ctx.formParam("nombreNuevo");

            ServicioLiga.actualizarNombreLiga(id, nuevoNombre);

            ctx.redirect("/ligas");
        }

        public static void eliminarLiga(Context context) {
            int idLiga = Integer.parseInt(context.pathParam("id"));
            servicioLiga.eliminarLiga(idLiga);
            context.redirect("/ligas");
        }

        public static void mostrarLigasParaEditar(Context ctx) {

            List<Liga> ligas = LigaDao.listarLigas();

            ctx.render("templates/SeleccionarLigaEditar.ftl", Map.of(
                    "ligas", ligas
            ));
        }

    }
