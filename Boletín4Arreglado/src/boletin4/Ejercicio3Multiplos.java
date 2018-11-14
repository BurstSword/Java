package boletin4;

import java.util.Scanner;

public class Ejercicio3Multiplos {
    public static void main(String[] args) { //Declaramos la variable donde almacenaremos el número a comprobar//
        int num1;

        //Llamamos a los métodos para ingresar números y de comprobación de si es múltiplo y no, dentro
        // del de mostrar resultado
        num1 = leerNumero();
        mostrarResultado(esMultiploDeX(num1), esMultiploDeX(num1), num1);
    }

    public static int leerNumero() { //Este método nos permite leer números y devolverlos al main//
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un número y comprobaremos si es múltiplo de 2 y de 5");
        num1 = teclado.nextInt();
        return num1;
    }

    public static boolean esMultiploDeX(int num1) { //Mediante el uso de booleanos nos permite comprobar si es//
        // múltiplo de 2 o no tomando por parámetro el número ingresado//
        int dividendo;
        Scanner teclado = new Scanner(System.in);
        boolean esMultiploX;
        System.out.println("Ingrese el número por el que quiere ver si es múltiplo o no");
        dividendo = teclado.nextInt();

        if (num1 % dividendo == 0) {
            esMultiploX = true;
        } else {
            esMultiploX = false;
        }

        return esMultiploX;
    }


    public static void mostrarResultado(boolean esMultiplo2, boolean esMultiplo5, int num1) {
        // Comprobamos mediante los booleanos si es múltiplo de ambos, de uno de los dos o de ninguno,//
        // y mostramos el resultado obtenido//
        if (esMultiplo2 && esMultiplo5) {
            System.out.println(num1 + " es múltiplo de 2 y de 5");

        } else if (esMultiplo2 && !esMultiplo5) {
            System.out.println(num1 + " es múltiplo de 2 y de 5 no");

        } else if (!esMultiplo2 && esMultiplo5) {
            System.out.println(num1 + " es múltiplo de 5 y de 2 no");

        } else {
            System.out.println("No es múltiplo ni de 2 ni de 5");
        }
    }
}
