package edu.masanz.LigaVolei.dto;

public class Jugador {

    private int id;
    private String nombre;
    private int edad;
    private String descripcion;
    private int equipoid;

    public Jugador(int id, String nombre, int edad, String descripcion, int equipoid) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.descripcion = descripcion;
        this.equipoid = equipoid;
    }


    public int getEquipoid() {
        return equipoid;
    }

    public void setEquipoid(int equipoid) {
        this.equipoid = equipoid;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
