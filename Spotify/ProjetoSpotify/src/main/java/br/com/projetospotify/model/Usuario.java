package br.com.projetospotify.model;

public class Usuario implements java.io.Serializable {
    private int id;
    private String username;
    private String fullname;
    private String email;

    public Usuario(int id, String username, String fullname, String email) {
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.email = email;
    }
}
