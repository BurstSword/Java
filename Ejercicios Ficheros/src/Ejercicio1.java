import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num, resultado;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número y lo dividiremos por 0");

        num = teclado.nextInt();
        try {
            resultado = num / 0;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        }

    }
}
