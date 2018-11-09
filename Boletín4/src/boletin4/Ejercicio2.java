package boletin4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int contador;  //Declaramos la variable que va a almacenar la cantidad de números que ingresamos//

        //Hacemos la llamada a los métodos para contar los números que ingresamos y luego mostrarlos en pantalla//
        contador = Ejercicio2.contarEnteros();
        Ejercicio2.mostrarContador(contador);

    }


        //Con este método vamos ingresando números hasta que pulsemos el 0, y contará todos esos números menos el 0//
    public static int contarEnteros() {
        boolean esCero;
        int num, contador = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese un número y cuando quiera acabar pulse 0");
            num = teclado.nextInt();
            if (num == 0) {         //Vamos ingresando números hasta que pulsemos el 0, entonces cambia el valor a false
                                    // y sale del bucle
                esCero = true;
            } else {
                esCero = false;
                contador++;
            }
        } while (!esCero);
        return contador; //Devolvemos la variable que ha almacenado la cantidad de números que hemos ingresado//
    }

    public static void mostrarContador(int contador) { //Tomamos por parámetro el contador y lo mostramos en pantalla//
        System.out.println("Ha ingresado " + contador + " números");
    }
}
