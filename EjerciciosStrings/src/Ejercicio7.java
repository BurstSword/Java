import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;
        System.out.println("Escriba una palabra y le invertiremos el orden");
        palabra = teclado.nextLine();
        reOrdenar(palabra);
    }

    public static void reOrdenar(String palabra) {
        String palabraOrdenada = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraOrdenada = palabraOrdenada + palabra.charAt(i);
        }
        System.out.println(palabraOrdenada);
    }
}
