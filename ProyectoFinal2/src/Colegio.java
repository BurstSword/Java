
import Gestoras.GestoraDatos;
import Gestoras.GestoraMenús;


import java.util.Scanner;

public class Colegio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int boton, nota, ID;


        do {
            do {
                System.out.println("Introduce el número de la opción que quiera realizar");
                GestoraMenús.menuPrincipal();
                boton = teclado.nextInt();
            } while (boton < 1 || boton > 5);

            switch (boton) {
                case 1:
                    System.out.println("Introduzca la nota");
                    nota = teclado.nextInt();
                    GestoraDatos.anadirNota(nota);
                    break;
                case 2:
                    System.out.println("Introduzca la ID del alumno del que quiere modificar su nota");
                    GestoraDatos.mostrarIDyNota();
                    if (GestoraDatos.mostrarIDyNota()) {
                        ID = teclado.nextInt();
                        System.out.println("Introduzca la nota nueva");
                        nota = teclado.nextInt();
                        GestoraDatos.cambiarNota(ID, nota);
                    }
                    break;
                case 3:
                    System.out.println("Introduzca la ID del alumno que quiere eliminar");
                    GestoraDatos.mostrarIDyNota();
                    if (GestoraDatos.mostrarIDyNota()) {
                        ID = teclado.nextInt();
                        GestoraDatos.EliminarNotayAlumno(ID);
                    }
                    break;
                case 4:
                    GestoraDatos.mostrarIDyNota();
                    break;
                case 5:
                    System.out.println("Adiós");
                    break;
            }

        } while (boton != 5);
    }
}
