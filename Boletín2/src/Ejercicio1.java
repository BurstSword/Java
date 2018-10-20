import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mayor;
        System.out.println("Ingrese 3 números ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();


        if (num1 > num2) {
            mayor = num1;
            num1 = num2;
            num2 = mayor;
        }

        if (num2 > num3) {
            mayor = num2;
            num2 = num3;
            num3 = mayor;
        }

        if (num1 > num2) {
            mayor = num1;
            num1 = num2;
            num2 = mayor;
        }

        System.out.println("los números ordenados son " + num1 + " " + num2 + " y " + num3);
    }
}
