import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("Escriba una palabra y la convertiremos en minúsculas");
        cadena = teclado.nextLine();
        System.out.println(pasarAMinusculas(cadena));

    }

    private static String pasarAMinusculas(String cadena) {
        for (int i = 0; i < 1; i++) {
            cadena = cadena.toLowerCase();
        }
        return cadena;
    }
}
