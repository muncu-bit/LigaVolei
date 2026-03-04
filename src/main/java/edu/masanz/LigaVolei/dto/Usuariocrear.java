package edu.masanz.LigaVolei.dto;

public class Usuariocrear {
    String nombre;
    String contrasena;
    int id;


    public Usuariocrear(String nombre, String contrasena, int id) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.id = id;

    }


    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(String contraseña) {
        this.contrasena = contraseña;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuariocrear{" +
                "nombre='" + nombre + '\'' +
                ", contraseña='" + contrasena + '\'' +
                ", id=" + id +
                '}';
    }
}
