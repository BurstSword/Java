import java.util.Scanner;

public class Boletin1ejerc3 {

    public static void main(String[] args) {

        int n;
        Scanner teclado = new Scanner(System.in);


        do {
            System.out.println("Ingrese su nota");
            n = teclado.nextInt();
            if (n > 10 || n < 0) {
                System.out.println("Debe ingresar un número entre 0 y 10");
            }
        } while (n > 10 || n < 0);

        if (n < 5 && n > 0) {
            System.out.println("Está suspenso");

        } else {
            System.out.println("Está aprobado");

        }

    }
}
