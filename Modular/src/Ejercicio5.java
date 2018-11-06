import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número por teclado y veremos si es mayor que 5 o no");
        num = teclado.nextInt();
        Boolean a;

        if (num > 5) {
            a = true;

        } else {
            a = false;

        }
        if (a == true) {
            System.out.println("El número es mayor a 5");
        } else {
            System.out.println("El número es menor a 5");
        }
    }
}