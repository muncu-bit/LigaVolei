package edu.masanz.LigaVolei.service;

import edu.masanz.LigaVolei.Controller.EquipoController;
import edu.masanz.LigaVolei.dao.EquipoDao;
import edu.masanz.LigaVolei.dao.PartidoDao;
import edu.masanz.LigaVolei.dto.Equipo;
import edu.masanz.LigaVolei.dto.Partido;

import java.util.Collections;
import java.util.List;
import java.util.Random;


    public class ServicioPartido {

        public static void agregarPartido(Partido partido) {
            PartidoDao.agregarPartido(partido);
        }


    }