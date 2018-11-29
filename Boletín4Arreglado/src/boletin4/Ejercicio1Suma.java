package boletin4;

import java.util.Scanner;

public class Ejercicio1Suma {
    public static void main(String[] args) {
        //Declaramos las variables de los dos números a sumar y dónde almacenaremos la suma//
        int num1, num2, suma;

        //Hacemos la llamada a los métodos de leer número, realizar la suma y mostrar el resultado//
        num1 = leerNum();
        num2 = leerNum();
        suma = suma(num1, num2);
        mostrarSuma(suma);

        searchCousins(588,613);
    }

    private static void searchCousins(int i, int i1) {
        System.out.println();
    }

    public static int leerNum() { //Este método nos permite leer números y devolverlos al main//
        int num1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número");
        num1 = teclado.nextInt();
        return num1;
    }

    public static int suma(int num1, int num2) { /*Con este método tomamos por parámetros los anteriores números y
         realizamos y devolvemos el valor de la suma*/
        int suma = num1 + num2;

        return suma;
    }
        //En este método omamos por parámetro el resultado de la suma y lo mostramos en pantalla//
    public static void mostrarSuma(int suma) {
        System.out.println("El resultado es: " + suma);
    }
}
