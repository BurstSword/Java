package Entidades;


/*
Clase que se en encanta del objeto de tipo Usuario, que es el que hace las funciones en la base de datos
 */


public class Usuario {
    //Atributos de la clase Usuario
    private String name, username, password;
    boolean admin;

    //Método constructor por defecto
    public Usuario(String name, String username, String password, boolean admin) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.admin = admin;
    }


    //Métodos Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
