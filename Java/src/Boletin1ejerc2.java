import java.util.Scanner;

public class Boletin1ejerc2 {

    public static void main(String[] args) {

        int n;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número");
        n = teclado.nextInt();

        if (n > 100) {

            System.out.println("El número es mayor que 100");
        } else if (n == 100) {

            System.out.println("El número es 100");
        } else {
            System.out.println("El número es menor que 100");

        }


    }
}
