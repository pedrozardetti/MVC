package br.com.projetospotify.model;

public class Usuario {
    private int id;
    private String username;
    private String fullname;
    private String email;

    // Não faz nada, apenas para sobrecarga
    public Usuario() {
    }

    public Usuario(int id, String username, String fullname, String email) {
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(java.lang.String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
