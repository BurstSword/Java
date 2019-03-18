package Carpeta2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioRecursividad {
    //Método Main
    public static void main(String[] args) {
        //Variables del método main
        int numero = -1;
        Scanner teclado = new Scanner(System.in);
        //Bucle que controla la entrada por teclado para que el número introducido sea un número, positivo y entero
        do {
            System.out.println("Introduzca un número entero positivo");
            try {
                numero = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error");
            } finally {
                teclado.nextLine();
            }
        } while (numero <= 0);
        System.out.println(calcularSumaHasta1(numero));

    }

    //Método que calcula la suma de un número desde ese número hasta 1
    public static int calcularSumaHasta1(int numero) {

        if (numero == 1) {

            return 1;
        } else {
            return numero + calcularSumaHasta1(numero - 1);
        }

    }

}
