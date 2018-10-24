import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int media = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número");
            numeros[i] = teclado.nextInt();
            media = media + numeros[i];
        }
        media = media / 5;
        for (int j = 0; j < 5; j++) {
            if (numeros[j] > media) {
                System.out.println(numeros[j] + " es mayor que la media");
            }
        }

    }
}
