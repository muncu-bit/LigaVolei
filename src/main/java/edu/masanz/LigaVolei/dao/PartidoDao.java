package edu.masanz.LigaVolei.dao;

import edu.masanz.LigaVolei.database.ConnectionManager;
import edu.masanz.LigaVolei.dto.Equipo;
import edu.masanz.LigaVolei.dto.Partido;

import java.util.ArrayList;
import java.util.List;

    public  class PartidoDao {


        public static void agregarPartido(Partido partido) {

            String sql = "INSERT INTO partidos (ligaId, idequipoLocal, idequipoVisitante, puntosLocal, puntosVisitante) VALUES (?, ?, ?, ?, ?)";

            Object[] params = {
                    partido.getLigaId(),
                    partido.getIdequipoLocal(),
                    partido.getIdequipoVisitante(),
                    partido.getPuntosLocal(),
                    partido.getPuntosVisitante()

            };

            ConnectionManager.ejecutarInsertSQL(sql, params);

        }
    }
