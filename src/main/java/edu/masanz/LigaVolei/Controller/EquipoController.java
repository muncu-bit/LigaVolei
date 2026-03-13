package edu.masanz.LigaVolei.Controller;

import edu.masanz.LigaVolei.dao.EquipoDao;
import edu.masanz.LigaVolei.dao.LigaDao;
import edu.masanz.LigaVolei.dto.Equipo;
import edu.masanz.LigaVolei.dto.Jugador;
import edu.masanz.LigaVolei.dto.Liga;
import edu.masanz.LigaVolei.service.ServicioEquipo;

import edu.masanz.LigaVolei.service.ServicioJugador;
import edu.masanz.LigaVolei.service.ServicioLiga;
import io.javalin.http.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class EquipoController {
        private static ServicioLiga servicioLiga = new ServicioLiga();


        public static void eliminarEquipo(int id) {
            EquipoDao.eliminarEquipo(id);
        }


        public static ServicioEquipo servicioEquipo = new ServicioEquipo();

        public static void mostrarEquiposPorLiga(Context context) {

            int idLiga = Integer.parseInt(context.pathParam("id"));

            Map<String, Object> model = new HashMap<>();
            List<Liga> ligas = LigaDao.listarLigas();
            model.put("ligas", ligas);
            Liga ligaActual = null;
            for (Liga l : ligas) {
                if (l.getId() == idLiga) {
                    ligaActual = l;
                    break;
                }
            }
            model.put("ligaActual", ligaActual);
            List<Equipo> equipos = servicioEquipo.obtenerEquiposPorLiga(idLiga);
            model.put("equipos", equipos);
            context.render("templates/VerLigaVolley.ftl", model);
        }


        public static void crearEquipo(Context context) {

            String nombre = context.formParam("nombre");
            int ligaId = Integer.parseInt(context.formParam("ligaId"));
            Equipo equipo = new Equipo(0,nombre, 0, 0, 0);

            equipo.setLigaid(ligaId);
            long idGenerado = ServicioEquipo.agregarEquipo(equipo);

            context.redirect("/equipos/" + idGenerado + "/jugadores/crear");

        }
        public static void eliminarEquipo(Context context) {
            int idEquipo = Integer.parseInt(context.pathParam("id"));

            ServicioEquipo.eliminarEquipo(idEquipo);
            context.redirect("/equipos/eliminar");
        }

        public static void mostrarEquiposParaEliminar(Context ctx) {
            List<Equipo> equipos = EquipoDao.listarEquipos();
            ctx.render("templates/EliminarEquipos.ftl", Map.of("equipos", equipos));
        }

        public static void editarEquipo(Context context) {

            int idEquipo = Integer.parseInt(context.pathParam("id"));
            String nombre = context.formParam("nombre");

            Equipo equipo = new Equipo(idEquipo, nombre, 0, 0, 0);
            ServicioEquipo.actualizarEquipo(equipo);

            context.redirect("/equipo.ftl.ftl" + idEquipo);


        }

        public static void verEquipo(Context context) {
            int idEquipo = Integer.parseInt(context.pathParam("id"));

            Equipo equipo = servicioEquipo.obtenerEquipoPorId(idEquipo);
            List <Jugador> jugadores = ServicioJugador.listarJugadoresPorEquipo(idEquipo);

            Map<String, Object> model = new HashMap<>();
            model.put("equipo", equipo);
            model.put("jugadores", jugadores);

            context.render("templates/VerEquipo.ftl", model);

        }

        public static void servirCrearEquipo(Context ctx) {
            Map<String, Object> model = new HashMap<>();
            model.put("ligas", servicioLiga.listarLigas());
            ctx.render("templates/CrearEquipoVolley.ftl", model);
        }


    }