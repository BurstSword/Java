import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] elementos = new int['n'];
        int n, suma = 0;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingrese la cantidad de números que quiera ingresar e ingrese los números y se hará la suma " +
                "de todos los elementos");
        n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un número");
            elementos[i] = teclado.nextInt();
            suma = suma + elementos[i];
        }
        System.out.println("La suma de todos los números es :" + suma);
    }
}
