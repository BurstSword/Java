import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int num1;
        int numVeces = 10;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número y le mostraremos la tabla de multiplicar de ese número");
        num1 = teclado.nextInt();
        calculoMultiplicacion(num1, numVeces);
    }


    public static void calculoMultiplicacion(int num, int numVeces) {

        if (numVeces > 0) {
            calculoMultiplicacion(num, numVeces - 1);
            System.out.println("\t" + num + " x " + numVeces + " = " + (num * numVeces));
        }

    }
}
