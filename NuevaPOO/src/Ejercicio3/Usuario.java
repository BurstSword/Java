package Ejercicio3;

public class Usuario {
    private static int generadorID = 1;
    private int ID;
    private String nombreUsuario;

    public Usuario(String nombre) {
        this.ID = generadorID++;
        this.nombreUsuario = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ID=" + ID +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                '}';
    }
}
