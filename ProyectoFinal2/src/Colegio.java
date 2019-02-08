
import Gestoras.GestoraDatos;
import Gestoras.GestoraMenús;


import java.util.Scanner;

public class Colegio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int boton;
        float nota;


        do {
            do {
                System.out.println("\nIntroduce el número de la opción que quiera realizar");
                GestoraMenús.menuPrincipal();
                boton = teclado.nextInt();
            } while (boton < 1 || boton > 5);

            switch (boton) {
                case 1:
                    System.out.println("Introduzca la nota");
                    do {
                        System.out.println("Debe estar en el formato correcto. Ejemplo: 7,5 o 7");
                        nota = teclado.nextFloat();
                    } while (nota > 10 || nota < 1);
                    GestoraDatos.anadirNota(nota);
                    break;
                case 2:
                    GestoraDatos.mostrarIDyNota();
                    if (!GestoraDatos.vacia()) {
                        GestoraDatos.cambiarNota();
                    }
                    break;
                case 3:
                    GestoraDatos.mostrarIDyNota();
                    if (!GestoraDatos.vacia()) {
                        GestoraDatos.eliminarNota();
                    }
                    break;
                case 4:
                    GestoraDatos.ordenarNotas();
                    break;
                case 5:
                    System.out.println("Adiós");
                    break;
            }

        } while (boton != 5);
    }
}
