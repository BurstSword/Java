import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un número");
        numero = teclado.nextInt();
        System.out.println(sumaDigitos(numero));
    }


    public static int sumaDigitos(int numero) {

        if (numero == 0) {
            return 0;
        } else {
            return sumaDigitos(numero / 10) + numero % 10;
        }

    }
}
