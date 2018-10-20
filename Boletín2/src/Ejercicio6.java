import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.println("Ingrese un número y comprobaremos si es múltiplo de 2 y de 5");
        n = teclado.nextInt();

        if ((n % 2) == 0 && (n % 5) == 0) {
            System.out.println("Es múltiplo de 2 y de 5");

        } else {
            System.out.println("No es múltiplo de 2 y de 5");
        }
    }
}
