package Ejercicio3;

import java.util.ArrayList;
import java.util.Calendar;


public class Usuario {
    private static int generadorID = 1;
    private int ID;
    private String nombreUsuario;
    private ArrayList<Integer> listaFecha;

    public Usuario(String nombre) {
        this.ID = generadorID++;
        this.nombreUsuario = nombre;
        this.listaFecha = getListaFecha();
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

    public ArrayList<Integer> getListaFecha() {
        this.listaFecha = new ArrayList<>();
        return this.listaFecha;
    }

    public void setListaFecha(int dia, int mes) {
        this.listaFecha = new ArrayList<>();
        listaFecha.add(dia);
        listaFecha.add(mes);
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "ID=" + ID +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                '}';
    }
}
