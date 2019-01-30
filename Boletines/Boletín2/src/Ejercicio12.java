import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int n1;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingrese un número y veamos si es positivo, negativo o 0");
        n1 = teclado.nextInt();

        if (n1 > 0) {
            System.out.println("Su número es positivo");
        } else if (n1 < 0) {
            System.out.println("Su número es negativo");
        } else {
            System.out.println("Su número es 0");
        }
    }
}
