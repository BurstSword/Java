import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, min, max;

        System.out.println("Ingrese tres números");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();

        if (n1 > n2) {
            min = n2;
            max = n1;
            if (n1 > n3) {
                if (n2 > n3) {
                    min = n3;
                } else {
                    min = n2;
                }
            } else {
                max = n3;

            }

        } else {
            min = n1;
            max = n2;
            if (n2 > n3) {
                if (n1 > n3) {
                    min = n3;
                }

            } else {
                max = n3;

            }
        }
        System.out.println("El mínimo es " + min + " y el máximo es " + max);


    }
}
