import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("Escriba una palabra y la convertiremos en mayúsculas");
        cadena = teclado.nextLine();
        System.out.println(pasarAMayusculas(cadena));

    }

    private static String pasarAMayusculas(String cadena) {
        cadena=cadena.toLowerCase();
        while (cadena.equals(cadena.toLowerCase())) {
            cadena = cadena.toUpperCase();
        }
        return cadena;
    }
}
