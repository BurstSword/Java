package boletin4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num1 = leerNumero();


        mostrarResultado(esMultiploDeDos(num1), esMultiploDeCinco(num1), num1);
    }

    public static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un número y comprobaremos si es múltiplo de 2 y de 5");
        num1 = teclado.nextInt();
        return num1;
    }

    public static boolean esMultiploDeDos(int num1) {
        boolean esMultiplo2;
        if (num1 % 2 == 0) {
            esMultiplo2 = true;
        } else {
            esMultiplo2 = false;
        }
        return esMultiplo2;
    }

    public static boolean esMultiploDeCinco(int num1) {
        boolean esMultiplo5;
        if (num1 % 5 == 0) {
            esMultiplo5 = true;
        } else {
            esMultiplo5 = false;
        }
        return esMultiplo5;
    }

    public static void mostrarResultado(boolean esMultiplo2, boolean esMultiplo5, int num1) {
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
