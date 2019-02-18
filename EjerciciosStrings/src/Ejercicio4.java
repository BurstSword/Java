import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;

        System.out.println("Escriba una palabra y le diremos cuantas vocales y consonantes tiene");
        palabra = teclado.nextLine();
        contarVocalesYConsonantes(palabra);
    }

    public static void contarVocalesYConsonantes(String palabra) {
        int vocales = 0, consonantes = 0, espacios = 0;
        palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            } else if (letra == ' ') {
                espacios++;
            } else {
                consonantes++;
            }

        }
        System.out.println("La palabra " + palabra + " tiene " + vocales + " vocal/es, " + consonantes + " consonante/s y " + espacios + " espacio/s");
    }
}
