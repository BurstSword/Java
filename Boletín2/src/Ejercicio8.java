import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, n3;

        System.out.println("Ingrese tres números y veremos si son iguales o distintos");

        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();

        if ((n1 == n2) && (n2 == n3)) {
            System.out.println("Los números son iguales");
        } else {
            System.out.println("Los números son distintos");
        }
    }
}
