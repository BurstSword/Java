package Carpeta1;

import java.util.ArrayList;
import java.util.Arrays;
//Clase encargada de almacenar los Alumnos
public class Datos {

    public static Alumno[] Alumnos = {new AlumnoPrimerCurso("Manuel", "12345678H", 01),
            new AlumnoPrimerCurso("Carmen", "12345478H", 02),
            new AlumnoSegundoCurso("Óscar", "12348678H", 004, true),
            new AlumnoSegundoCurso("Nacho", "12745678H", 006,false)};

    public static ArrayList<Alumno> listaAlumnos = new ArrayList<>(Arrays.asList(Alumnos));
}
