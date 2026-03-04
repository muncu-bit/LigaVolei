package edu.masanz.LigaVolei.dto;


public class Equipo {

    private int id;
    private String nombre;
    private int victorias;
    private int derrotas;
    private int puntos;

    public Equipo(int id, String nombre, int victorias, int derrotas) {
        this.id = id;
        this.nombre = nombre;
        this.victorias = victorias;
        this.derrotas = derrotas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    // Pasamos directamente el valor por ganar, las derrotas ni suman ni restan así que no hay que cambiar nada
    public int getPuntos() {
        return victorias * 3;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
