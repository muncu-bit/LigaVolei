package edu.masanz.LigaVolei.dto;

public class RegistroRequestDto {
    private String usuario;
    private String email;
    private String password;
    private String confirmPassword;

    public RegistroRequestDto() {
    }

    public RegistroRequestDto(String usuario, String email, String password, String confirmPassword) {
        this.usuario = usuario;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "RegistroRequestDto{" +
                "usuario='" + usuario + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
