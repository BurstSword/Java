import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;

        System.out.println("Ingrese dos números");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();

        if (n1 > 0 && n2 > 0) {
            System.out.println("OK");
        } else if (n1 > 0) {
            System.out.println(n1 + " Es positivo");
        } else if (n2 > 0) {
            System.out.println(n2 + " Es positivo");
        } else {
            System.out.println("NO");
        }
    }
}
