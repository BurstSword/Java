package Gestoras;


import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestoraDatos {
    private static ArrayList<Float> notas = new ArrayList<>();
    private static int ID;
    private static float nota;
    private static Scanner teclado = new Scanner(System.in);

    public static void anadirNota(float nota) {
        notas.add(nota);
        System.out.println("Nota añadida con éxito");
    }

    public static void cambiarNota() {
        System.out.println("Introduzca la ID del alumno del que quiere modificar su nota");
        do {
            System.out.println("La ID debe corresponderse con una de la lista");
            try {
                ID = teclado.nextInt();
            } catch (InputMismatchException e) {
                teclado.nextLine();
            }
        } while (ID > notas.size());
        do {
            System.out.println("Introduzca la nota nueva");
            nota = teclado.nextFloat();
        } while (nota > 10);
        System.out.println("Cambio realizado");
        notas.set(ID, nota);
    }

    public static void mostrarIDyNota() {

        if (!notas.isEmpty()) {
            for (int i = 0; i < notas.size(); i++) {
                System.out.println("ID: " + i + " Nota: " + notas.get(i));
            }
        } else {
            System.out.println("No hay notas registradas");
        }
    }

    public static void eliminarNota() {
        System.out.println("Introduzca la ID del alumno del que quiere eliminar su nota");
        do {
            System.out.println("La ID debe corresponderse con una de la lista");
            try {
                ID = teclado.nextInt();
            } catch (InputMismatchException e) {
                teclado.nextLine();
            }
        } while (ID > notas.size());
        notas.remove(ID);
        System.out.println("Cambio realizado");
    }

    public static boolean vacia() {
        boolean vacia;
        if (notas.isEmpty()) {
            vacia = true;
        } else {
            vacia = false;
        }

        return vacia;
    }

    public static void ordenarNotas() {
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
        if (!notas.isEmpty()) {
            Collections.sort(notas);
            for (int i = 0; i < notas.size(); i++) {
                System.out.println("ID: " + i + " Nota: " + notas.get(i));
            }
        } else {
            System.out.println("No hay datos registrados");
        }

    }
}

