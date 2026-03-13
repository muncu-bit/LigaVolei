package edu.masanz.LigaVolei.dto;

public class Partidos {

    private int id;
    private int ligaId;
    private int idequipoLocal;
    private int idequipoVisitante;
    private int puntosLocal;
    private int puntosVisitante;

    public Partidos(int id, int ligaId, int idequipoLocal, int idequipoVisitante, int puntosLocal, int puntosVisitante) {
        this.id = id;
        this.ligaId = ligaId;
        this.idequipoLocal = idequipoLocal;
        this.idequipoVisitante = idequipoVisitante;
        this.puntosLocal = puntosLocal;
        this.puntosVisitante = puntosVisitante;
    }

    public int getId() {
        return id;
    }

    public int getLigaId() {
        return ligaId;
    }

    public int getIdequipoLocal() {
        return idequipoLocal;
    }

    public int getIdequipoVisitante() {
        return idequipoVisitante;
    }

    public int getPuntosLocal() {
        return puntosLocal;
    }

    public int getPuntosVisitante() {
        return puntosVisitante;
    }
}
