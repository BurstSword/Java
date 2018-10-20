import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingrese dos números y veamos si su suma es positiva, negativa o igual a 0");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();

        if (n1 + n2 > 0) {
            System.out.println("Su suma es positiva " + (n1+n2));
        } else if (n1 + n2 < 0) {
            System.out.println("Su suma es negativa " + (n1+n2));
        } else {
            System.out.println("Su suma es 0 " + (n1+n2));
        }
    }
}