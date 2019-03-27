package Carpeta1;

import java.util.ArrayList;

abstract public class Alumno {
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

    //Métodos abstractos de la clase Alumno
    abstract float calcularMedia(ArrayList <Float> notas);


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

