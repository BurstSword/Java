import java.util.Scanner;

public class Boletin1ejerc8 {

    public static void main(String[] args) {
        int n, cont = 0;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingrese números enteros y cuando quiera terminar pulse 0");
        n = teclado.nextInt();

        while (n > 0 || n < 0) {
            cont++;
            n = teclado.nextInt();

        }
        if (cont == 1) {
            System.out.println("Has introducido 1 número");
        } else {
            System.out.println("Has introducido " + cont + " números");
        }

    }
}

