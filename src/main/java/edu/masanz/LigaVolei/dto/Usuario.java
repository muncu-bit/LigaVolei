package edu.masanz.LigaVolei.dto;

public class Usuario {
    String nombre;
    String contrasena;
    String email;
    String salt;
    int rol;
    int id;

    public Usuario(String nombre, String contrasena, int id) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.id = id;
        this.email = "";
        this.salt = "";
        this.rol = 0;
    }

    public Usuario(String nombre, String contrasena, String email, int id) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.email = email;
        this.id = id;
        this.salt = "";
        this.rol = 0;
    }

    public Usuario(int id, String nombre, String email, String contrasena, String salt, int rol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.salt = salt;
        this.rol = rol;
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

    public String getSalt() {
        return salt;
    }

    public int getRol() {
        return rol;
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

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setRol(int rol) {
        this.rol = rol;
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
