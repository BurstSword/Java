import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;

        System.out.println("Ingrese dos números");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();

        if (n2 * n2 == n1) {
            System.out.println("El primero es el cuadrado del segundo");
        } else {
            System.out.println("El primero no es el cuadrado del segundo");
        }

    }
}
