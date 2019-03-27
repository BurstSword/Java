package Carpeta1.Entidades;

import java.util.ArrayList;

//Clase que hereda de Alumno
public class AlumnoPrimerCurso extends Alumno {

    //Método constructor de la clase AlumnoPrimerCurso
    public AlumnoPrimerCurso(String nombre, String dni, int codigo) {
        super(nombre, dni, codigo, 0);
    }

    //Método sobreescrito de la clase Alumno que se encarga de calcular la media del alumno de primer curso
    public float calcularMedia(ArrayList<Float> notas) {
        float media = 0;

        if (notas.size() < 2) {
            System.out.println("Faltan notas por calcular");

        } else if (notas.size() > 2) {

            media = (this.getNotas().get(0) + this.getNotas().get(1) + this.getNotas().get(2)) / 3;

        }
        return media;
    }

}
