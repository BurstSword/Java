package boletin4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1 ej = new Ejercicio1();
        int num1, num2, suma;
        num1 = ej.leerNum();
        num2 = ej.leerNum();
        suma = ej.suma(num1, num2);
        ej.mostrarSuma(suma);
    }

    int leerNum() {
        int num1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número");
        num1 = teclado.nextInt();
        return num1;
    }

    int suma(int num1, int num2) {
        int suma = num1 + num2;

        return suma;
    }

    void mostrarSuma(int suma) {
        System.out.println("El resultado es: " + suma);
    }
}
