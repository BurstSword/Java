import Gestoras.GestoraMenús;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Pruebas {
    private static float[] arrayN = {5, 6, 8, 1, 7};
    private static ArrayList<Float> listaNotas = new ArrayList(Arrays.asList(arrayN));
    private static int ID;
    private static float nota;
    private static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        int boton;
        do {
            do {
                System.out.println("Introduce el número de la opción que quiera realizar");
                GestoraMenús.menuPrincipal();
                boton = teclado.nextInt();
            } while (boton < 1 || boton > 5);


            switch (boton) {
                case 1:
                    nota = teclado.nextFloat();
                    anadirNota(nota);
                    System.out.println(listaNotas.toString());
                    break;
                case 2:
                    cambiarNota();
                    System.out.println(listaNotas.toString());
                    break;
                case 3:
                    eliminarNota();
                    System.out.println(listaNotas.toString());
                    break;
                case 4:
                    ordenarNotas();
                    break;
                case 5:
                    System.out.println("Adiós");
                    break;
            }
        } while (boton < 1 || boton > 5);
    }

    private static void cambiarNota() {
        do {
            System.out.println("Introduzca la ID del alumno del que quiere modificar su nota");
            ID = teclado.nextInt();
        } while (ID > listaNotas.size());
        do {
            System.out.println("Introduzca la nota nueva");
            nota = teclado.nextFloat();
        } while (nota > 10);
        System.out.println("Cambio realizado");
        listaNotas.set(ID, nota);
    }

    private static void eliminarNota() {
        do {
            System.out.println("Introduzca la ID del alumno del que quiere eliminar su nota");
            ID = teclado.nextInt();
        } while (ID > listaNotas.size());
        listaNotas.remove(ID);
        System.out.println("Cambio realizado");
    }

    private static void mostrarIDyNota() {

        if (!listaNotas.isEmpty()) {
            for (int i = 0; i < listaNotas.size(); i++) {
                System.out.println("ID: " + i + " Nota: " + listaNotas.get(i));
            }
        } else {
            System.out.println("No hay notas registradas");
        }
    }

    private static void anadirNota(float nota) {
        listaNotas.add(nota);
        System.out.println("Nota añadida con éxito");
    }

    private static void ordenarNotas() {
        /*
        for (int i = 0; i < notas.size(); i++) {
            for (int j = 0; j < notas.size()-1; j++) {
                if (notas.get(i) < notas.get(i + 1)) {
                    float tmp = notas.get(i);
                    notas.toArray()[i] = notas.get(i+1);
                    notas.toArray()[i+1] = tmp;
                }
            }
        }
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("ID: " + i + " Nota: " + notas.get(i));
        }
        */
        Collections.sort(listaNotas);
        for (int i = 0; i < listaNotas.size(); i++) {
            System.out.println("ID: " + i + " Nota: " + listaNotas.get(i));
        }
    }
}
