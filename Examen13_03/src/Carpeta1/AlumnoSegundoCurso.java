package Carpeta1;

import java.util.ArrayList;

//Clase que hereda de Alumno
public class AlumnoSegundoCurso extends Alumno {
    //Atributos de la clase AlumnoSegundoCurso
    private boolean fctAprobada;

    //Método constructor de la clase AlumnoSegundoCurso
    AlumnoSegundoCurso(String nombre, String dni, int codigo, boolean fctAprobada) {
        super(nombre, dni, codigo, 0);
        this.fctAprobada = fctAprobada;
    }

    //Método sobreescrito de la clase Alumno que se encarga de calcular la media del alumno de segundo curso
    public float calcularMedia(ArrayList<Float> notas) {
        float media = 0;

        notas.size();
        if (notas.size() == 1 && this.fctAprobada) {


            media = (this.getNotas().get(0) + this.getNotas().get(1)) / 2;


        }
        return media;
    }

    //Métodos Getter y Setter
    public boolean isFctAprobada() {
        return fctAprobada;
    }

    public void setFctAprobada(boolean fctAprobada) {
        this.fctAprobada = fctAprobada;
    }

    //Método toString de la clase AlumnoSegundoCurso
    @Override
    public String toString() {
        return "AlumnoSegundoCurso{" +
                "fctAprobada=" + fctAprobada +
                '}';
    }
}
