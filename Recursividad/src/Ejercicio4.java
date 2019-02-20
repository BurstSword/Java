import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        System.out.println("Introduzca 5 valores y le daremos la suma de esos valores");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + cont);
            numeros[i] = teclado.nextInt();
            cont++;
        }

        System.out.println("La suma de los valores introducidos es " + sumarValores(numeros, numeros.length - 1));
    }

    private static int sumarValores(int[] numeros, int posiArray) {

        if (posiArray == 0) {
            return numeros[posiArray];
        } else {
            return numeros[posiArray] + sumarValores(numeros, posiArray - 1);
        }

    }
}
