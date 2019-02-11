
import Gestoras.GestoraDatos;
import Gestoras.GestoraMen�s;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Colegio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int boton;
        float nota=0;

        do {
            do {
                System.out.println("\nIntroduce el n�mero de la opci�n que quiera realizar");
                GestoraMen�s.menuPrincipal();
                boton=0;
                try {
                    boton = teclado.nextInt();
                } catch (InputMismatchException e) {
                    teclado.nextLine();
                }
            } while (boton < 1 || boton > 5);

            switch (boton) {
                case 1:
                    System.out.println("Introduzca la nota");
                    do {
                        System.out.println("Debe estar en el formato correcto. Ejemplo: 7,5 o 7");
                        try{
                            nota = teclado.nextFloat();
                        }catch (InputMismatchException e){
                            teclado.nextLine();
                        }
                    } while (nota > 10 || nota <= 0);
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
                    System.out.println("Adi�s");
                    break;
            }

        } while (boton != 5);
    }
}
