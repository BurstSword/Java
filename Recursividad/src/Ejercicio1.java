import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();


        System.out.println("\nEl factorial de " + num + " es: " + CalculoFactorial(num));
    }

    public static int CalculoFactorial(int num) {
        if (num == 0) {
            return 1;
        } else
            return num * CalculoFactorial(num - 1);
    }
}

