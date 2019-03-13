package Carpeta1;

import java.util.ArrayList;
//Clase que hereda de Alumno
public class AlumnoPrimerCurso extends Alumno {

    //Método constructor de la clase AlumnoPrimerCurso
    public AlumnoPrimerCurso(String nombre, String dni, int codigo) {
        super(nombre, dni, codigo, 0);
    }

    //Método sobreescrito de la clase Alumno que se encarga de calcular la media del alumno de primer curso
    public Float calcularMedia(ArrayList<Float> notas) {
        Float media = notas.get(0);

        if (notas.size() < 2) {
            System.out.println("Faltan notas por calcular");

        } else if (notas.size() == 2) {


            media = (notas.get(0) + notas.get(1) + notas.get(2)) / 3;


        }
        return media;
    }

}
