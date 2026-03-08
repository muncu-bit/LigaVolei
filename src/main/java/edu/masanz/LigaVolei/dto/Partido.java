package edu.masanz.LigaVolei.dto;

public class Partido {

    private int id;
    private int ligaId;
    private int idequipoLocal;
    private int idequipoVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private int puntos;

    public Partido(int id, int ligaId, int idequipoLocal, int idequipoVisitante, int puntosLocal, int puntosVisitante) {
        this.id = id;
        this.ligaId = ligaId;
        this.idequipoLocal = idequipoLocal;
        this.idequipoVisitante = idequipoVisitante;
        this.puntosLocal = puntosLocal;
        this.puntosVisitante = puntosVisitante;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
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
