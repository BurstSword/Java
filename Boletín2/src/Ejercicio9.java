import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Ingrese tres números");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();

        if (n1 + n2 >= n3) {
            System.out.println("n1+n2>=n3");
        } else {
            System.out.println("n1+n2<n3");
        }
    }
}
