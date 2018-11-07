package boletin4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int contador;

        contador = Ejercicio2.contarEnteros();
        Ejercicio2.mostrarContador(contador);

    }

    public static int contarEnteros() {
        boolean esCero;
        int num, contador = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese un número y cuando quiera acabar pulse 0");
            num = teclado.nextInt();
            if (num == 0) {
                esCero = true;
            } else {
                esCero = false;
                contador++;
            }
        } while (!esCero);
        return contador;
    }

    public static void mostrarContador(int contador) {
        System.out.println("Ha ingresado " + contador + " números");
    }
}
