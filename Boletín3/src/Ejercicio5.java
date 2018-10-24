import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] menor = new int['n'];
        int n;
        int min = menor[1];


        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que quiera ingresar  e ingrese los números y se buscará el" +
                "menor de todos");
        n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un número");
            menor[i] = teclado.nextInt();
            if (menor[i] < min) {
                min = menor[i];
            }
        }

        System.out.println("El número menor es :" + min);
    }
}



