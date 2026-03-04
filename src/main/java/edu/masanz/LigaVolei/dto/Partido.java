package edu.masanz.LigaVolei.dto;

public class Partido {

    private int id;
    private int ligaId;
    private int idequipoLocal;
    private int idequipoVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private int jornada;

    public Partido(int id, int ligaId, int idequipoLocal, int idequipoVisitante, int puntosLocal, int puntosVisitante, int jornada) {
        this.id = id;
        this.ligaId = ligaId;
        this.idequipoLocal = idequipoLocal;
        this.idequipoVisitante = idequipoVisitante;
        this.puntosLocal = puntosLocal;
        this.puntosVisitante = puntosVisitante;
        this.jornada = jornada;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setLigaId(int ligaId) {
        this.ligaId = ligaId;
    }

    public void setIdequipoLocal(int idequipoLocal) {
        this.idequipoLocal = idequipoLocal;
    }

    public void setIdequipoVisitante(int idequipoVisitante) {
        this.idequipoVisitante = idequipoVisitante;
    }

    public void setPuntosLocal(int puntosLocal) {
        this.puntosLocal = puntosLocal;
    }

    public void setPuntosVisitante(int puntosVisitante) {
        this.puntosVisitante = puntosVisitante;
    }
}
