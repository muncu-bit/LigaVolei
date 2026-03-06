package edu.masanz.LigaVolei.dto;

public class Usuario {
    String nombre;
    String contraseña;
    int id;


    public Usuario(String nombre, String contraseña, int id) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuariocrear{" +
                "nombre='" + nombre + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", id=" + id +
                '}';
    }
}
