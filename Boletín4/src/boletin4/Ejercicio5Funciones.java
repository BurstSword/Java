package boletin4;

import java.util.Scanner;

public class Ejercicio5Funciones {
    //En este método ingresamos la dimensión del array a utilizar//
    public static int pedirDimensionArray() {
        int dimensionArray;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que quiera ingresar");
        dimensionArray = teclado.nextInt();
        return dimensionArray;
    }

    //Declaramos el array con la dimensión ingresada anteriormente y la cargamos//
    public static int[] cargarArray(int dimensionArray) {
        int[] numeros = new int[dimensionArray];
        Scanner teclado = new Scanner(System.in);


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el número " + (i + 1) + "/" + (numeros.length));
            numeros[i] = teclado.nextInt();
        }
        return numeros;
    }

    //Hacemos la suma de los valores del array anteriormente cargado//
    public static int sumarValores(int[] numeros) {
        int sumatorio = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumatorio = sumatorio + numeros[i];
        }
        return sumatorio; //Devolvemos el valor del sumatorio//
    }

    public static void mostrarResultado(int sumatorio) { //Tomamos por parámetro el sumatorio//
        // y lo mostramos en pantalla//
        System.out.println("La suma de los valores ingresados es: " + sumatorio);
    }

}
