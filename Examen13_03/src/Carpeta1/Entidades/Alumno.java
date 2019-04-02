package Carpeta1.Entidades;


import Carpeta1.Calculable;
import Carpeta1.Imprimible;

import java.util.ArrayList;

public class Alumno implements Imprimible, Calculable {
    //Atributos de la clase abstracta Alumno
    private String nombre;
    private String dni;
    private int codigo;
    private int notaMedia;
    private ArrayList<Float> notas;

    //Método constructor de la clase abstracta Alumno
    public Alumno(String nombre, String dni, int codigo, int notaMedia) {
        this.nombre = nombre;
        this.dni = dni;
        this.codigo = codigo;
        this.notaMedia = notaMedia;
        this.notas = new ArrayList<>();
    }
    @Override
    public void imprimirString() {
        System.out.println("Soy un alumno");
    }

    @Override
    public void imprimirArrayList() {
        if(this.getNotas().isEmpty()){
            System.out.println("No tienes notas");
        }else{
            for(int i =0;i<this.getNotas().size();i++){
                System.out.println(this.getNotas().get(i));
            }
        }
    }

    @Override
    public float calcularMedia(ArrayList<Float> notas) {
        return 0;
    }

    //Métodos getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(int notaMedia) {
        this.notaMedia = notaMedia;
    }

    public ArrayList<Float> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }

    //Método toString de la clase Alumno
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}

