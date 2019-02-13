import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        System.out.println("Escriba una frase utilizando espacios entre cada palabra");
        frase = teclado.nextLine();
        System.out.println("Ha escrito " + contarPalabras(frase) + " palabras");
    }

    public static int contarPalabras(String frase) {
        String[] palabras = frase.split(" ");

        return palabras.length;
    }
}
