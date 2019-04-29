package Ejercicio1.Gestoras;

import Ejercicio1.Entidades.Libro;
import Ejercicio1.Entidades.Revista;

import java.util.ArrayList;
import java.util.Arrays;

public class GestoraDatos {
    public static Libro[] ArrayL = {
            new Libro(0, "El Quijote", 1600, false),
            new Libro(1, "Codigo Da Vinci", 2000, false),
            new Libro(2, "Pilares de la Tierra", 2000, false)};
    public static Revista[] ArrayR = {
            new Revista(3, "Hola", 2000, 45,false),
            new Revista(4, "Que interesante", 2000, 65,false),
            new Revista(5, "Vogue", 2000, 75,false)};

    public static ArrayList<Libro> listaLib = new ArrayList<>(Arrays.asList(ArrayL));
    public static ArrayList<Revista> listaRev = new ArrayList<>(Arrays.asList(ArrayR));
}
