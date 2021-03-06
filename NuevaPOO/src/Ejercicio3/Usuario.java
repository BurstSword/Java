package Ejercicio3;

import java.util.ArrayList;


public class Usuario {
    private static int generadorID = 1;
    private int ID;
    private String nombreUsuario;
    private ArrayList<Fecha> listaFecha;
    private boolean penalizado;

    public Usuario(String nombre) {
        this.ID = generadorID++;
        this.nombreUsuario = nombre;
        this.listaFecha = new ArrayList<>();
        this.penalizado = false;
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

    public static int getGeneradorID() {
        return generadorID;
    }

    public static void setGeneradorID(int generadorID) {
        Usuario.generadorID = generadorID;
    }

    public ArrayList<Fecha> getListaFecha() {
        return listaFecha;
    }

    public void setListaFecha(ArrayList<Fecha> listaFecha) {
        this.listaFecha = listaFecha;
    }

    public boolean isPenalizado() {
        return penalizado;
    }

    public void setPenalizado(boolean penalizado) {
        this.penalizado = penalizado;
    }

    public void anadirFecha(Fecha fecha) {
        listaFecha.add(fecha);

    }

    public void anadirFecha(int dia, int mes) {
        Fecha fecha = new Fecha(dia, mes);
        listaFecha.add(fecha);

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ID=" + ID +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                '}';
    }
}
