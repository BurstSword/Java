import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca 5 valores y le daremos la suma de esos valores");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + i);
            numeros[i] = teclado.nextInt();
        }

        System.out.println("La suma de los valores introducidos es " + sumarValores(numeros, numeros.length - 1));
    }

    public static int sumarValores(int[] numeros, int posiArray) {
        int posicTmp = posiArray;

        if (posicTmp == 0) {
            return numeros[posicTmp];
        } else {
            return numeros[posicTmp] + sumarValores(numeros, posicTmp - 1);
        }

    }
}
