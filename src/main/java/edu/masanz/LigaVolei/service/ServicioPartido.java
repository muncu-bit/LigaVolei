package edu.masanz.LigaVolei.service;

import edu.masanz.LigaVolei.Controller.EquipoController;
import edu.masanz.LigaVolei.dao.EquipoDao;
import edu.masanz.LigaVolei.dao.PartidoDao;
import edu.masanz.LigaVolei.dto.Equipo;
import edu.masanz.LigaVolei.dto.Partido;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ServicioPartido {

    public static void jugarJornada(int ligaId) {

        List<Equipo> equipos = EquipoController.servicioEquipo.obtenerEquiposPorLiga(ligaId);

        // Mezclar equipos para que cada jornada sean partidos distintos
        Collections.shuffle(equipos);

        Random random = new Random();

        // Emparejar de 2 en 2
        for (int i = 0; i < equipos.size(); i += 2) {

            if (i + 1 >= equipos.size()) break; // Si hay impar, uno descansa

            Equipo local = equipos.get(i);
            Equipo visitante = equipos.get(i + 1);

            int puntosLocal = random.nextInt(5);
            int puntosVisitante = random.nextInt(5);

            // Evitar empates
            while (puntosLocal == puntosVisitante) {
                puntosLocal = random.nextInt(5);
                puntosVisitante = random.nextInt(5);
            }

            Partido partido = new Partido(
                    0,
                    ligaId,
                    local.getId(),
                    visitante.getId(),
                    puntosLocal,
                    puntosVisitante
            );

            PartidoDao.agregarPartido(partido);

            actualizarEquipos(local, visitante, puntosLocal, puntosVisitante);
        }
    }



    public static void actualizarEquipos(Equipo local, Equipo visitante, int puntosLocal, int puntosVisitante){

        // Sumar puntos anotados
        local.setPuntos(local.getPuntos() + puntosLocal);
        visitante.setPuntos(visitante.getPuntos() + puntosVisitante);

        // Sumar puntos por victoria
        if (puntosLocal > puntosVisitante){
            local.setVictorias(local.getVictorias() + 1);
            visitante.setDerrotas(visitante.getDerrotas() + 1);

            // 3 puntos por victoria
            local.setPuntos(local.getPuntos() + 3);

        } else {
            visitante.setVictorias(visitante.getVictorias() + 1);
            local.setDerrotas(local.getDerrotas() + 1);

            visitante.setPuntos(visitante.getPuntos() + 3);
        }

        EquipoDao.actualizarEquipo(local);
        EquipoDao.actualizarEquipo(visitante);
    }


}
