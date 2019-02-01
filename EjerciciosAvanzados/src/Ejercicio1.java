import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static int numero;
    public static boolean error;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        do {
            try {
                numero = teclado.nextInt();
                if (Character.isDigit(numero)) {
                    error = false;
                } else {
                    error = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número");
            }
        } while (error);
    }
}
