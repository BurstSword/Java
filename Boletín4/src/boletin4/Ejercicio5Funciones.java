package boletin4;

import java.util.Scanner;

public class Ejercicio5Funciones {
    public static int pedirDimensionArray() {
        int dimensionArray;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de número que quiera ingresar");
        dimensionArray = teclado.nextInt();
        return dimensionArray;
    }

    public static int[] cargarArray(int dimensionArray) {
        int[] numeros = new int[dimensionArray];
        Scanner teclado = new Scanner(System.in);


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el número " + (i + 1) + "/" + (numeros.length));
            numeros[i] = teclado.nextInt();
        }
        return numeros;
    }
    public static int sumarValores(int[] numeros){
        int sumatorio=0;
        for(int i=0; i<numeros.length;i++){
            sumatorio=sumatorio+numeros[i];
        }
        return sumatorio;
    }
    public static void mostrarResultado(int sumatorio){
        System.out.println("La suma de los valores ingresados es: " + sumatorio);
    }

}
