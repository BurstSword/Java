import java.util.Scanner;
import java.lang.Math;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n;

        do {
            System.out.println("Ingrese un número mayor que 0 y haremos la raíz cuadrada");
            n = teclado.nextDouble();

        }while (n<0);

        System.out.println("La raíz cuadrada de " + n + " es: " + Math.sqrt(n));
    }
}
