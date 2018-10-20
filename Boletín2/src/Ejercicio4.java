import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char letra;

        System.out.println("Ingrese una letra");
        letra = Character.toLowerCase(teclado.next().charAt(0));

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println(letra + " Es una vocal");

        } else {
            System.out.println(letra + " Es una consonante");
        }

    }
}
