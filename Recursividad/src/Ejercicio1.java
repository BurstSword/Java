import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();


        System.out.println("\nEl factorial de " + num + " es: " + CalculoFactorial(num));
    }

    private static int CalculoFactorial(int num) {
        if (num == 0) {
            num = 1;
        } else
            num = num * CalculoFactorial(num - 1);
        return num;
    }
}

