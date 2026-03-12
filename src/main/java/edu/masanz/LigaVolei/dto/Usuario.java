package edu.masanz.LigaVolei.dto;

public class Usuario {
    String nombre;
    String contrasena;
    String email;
    int id;

    public Usuario(String nombre, String contrasena, int id) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.id = id;
        this.email = "";
    }

    public Usuario(String nombre, String contrasena, String email, int id) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.email = email;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuariocrear{" +
                "nombre='" + nombre + '\'' +
                ", contraseña='" + contrasena + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
