import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int base, exponente;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la base");
        base = teclado.nextInt();
        System.out.println("Introduzca el exponente");
        exponente = teclado.nextInt();
        System.out.println(potencia(base,exponente));
    }

    public static int potencia(int base, int exponente) {

        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            return potencia(base, exponente + 1 / base);
        } else {
            return base * potencia(base, exponente - 1);
        }

    }
}
