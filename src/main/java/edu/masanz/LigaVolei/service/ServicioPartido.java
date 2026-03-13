package edu.masanz.LigaVolei.service;

import edu.masanz.LigaVolei.Controller.EquipoController;
import edu.masanz.LigaVolei.dao.EquipoDao;
import edu.masanz.LigaVolei.dao.PartidoDao;
import edu.masanz.LigaVolei.dto.Equipo;
import edu.masanz.LigaVolei.dto.Partido;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ServicioPartido {

    public static void generarPartidosLiga(int ligaid) {
        List<Equipo> equipos = EquipoController.servicioEquipo.obtenerEquiposPorLiga(ligaid);
        Random random = new Random();


        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {


                Equipo local = equipos.get(i);
                Equipo visitante = equipos.get(j);

                int puntoslocal = random.nextInt(5);
                int puntosvisitante = random.nextInt(5);

                while (puntoslocal == puntosvisitante) {
                    puntoslocal = random.nextInt(5);

                    Partido partido = new Partido(
                            0,
                            ligaid,
                            local.getId(),
                            visitante.getId(),
                            puntoslocal,
                            puntosvisitante
                    );

                    PartidoDao.agregarPartido(partido);

                    actualizarEquipos(local, visitante, puntoslocal, puntosvisitante);
                }
            }
        }

    }
        public static void actualizarEquipos(Equipo local, Equipo visitante, int puntosLocal, int puntosVisitante){

          if (puntosLocal > puntosVisitante){
              local.setVictorias(local.getVictorias() + 1);
              local.setPuntos(local.getPuntos() + 3);
              visitante.setVictorias(visitante.getVictorias() + 1);

          } else {

              visitante.setVictorias(visitante.getVictorias() + 1);
              local.setPuntos(local.getPuntos() + 3);
              local.setVictorias(local.getVictorias() + 1);
          }

          EquipoDao.actualizarEquipo(local);
          EquipoDao.actualizarEquipo(visitante);

    }

    public static void jugarJornada(int ligaid) {
    }
}
