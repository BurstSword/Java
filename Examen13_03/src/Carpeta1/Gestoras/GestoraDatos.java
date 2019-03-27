package Carpeta1.Gestoras;

import Carpeta1.Entidades.Alumno;
import Carpeta1.Entidades.AlumnoPrimerCurso;
import Carpeta1.Entidades.AlumnoSegundoCurso;

import java.util.ArrayList;
import java.util.Arrays;
//Clase encargada de almacenar los Alumnos
public class GestoraDatos {

    public static Alumno[] Alumnos = {new AlumnoPrimerCurso("Manuel", "12345678H", 1),
            new AlumnoPrimerCurso("Carmen", "12345478H", 2),
            new AlumnoSegundoCurso("Óscar", "12348678H", 4, true),
            new AlumnoSegundoCurso("Nacho", "12745678H", 6,false)};

    public static ArrayList<Alumno> listaAlumnos = new ArrayList<>(Arrays.asList(Alumnos));
}
