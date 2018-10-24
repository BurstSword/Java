import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num[] = new int[5];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("Ingrese un número");
            num[i] = teclado.nextInt();

        }
        if (num[0] < num[1] && num[1] < num[2] && num[2] < num[3] && num[3] < num[4]) {
            System.out.println("Los números están ordenados de menor a mayor ");
        } else {
            System.out.println("Los números no están ordenados de menor a mayor");
        }
    }
}

