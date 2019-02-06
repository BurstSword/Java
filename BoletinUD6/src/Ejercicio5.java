import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String nombre;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        nombre = teclado.nextLine();
        aMayusculas(nombre);
    }

    public static void aMayusculas(String nombre) {

        for (int i = 0; i <= 5; i++) {
            System.out.println(nombre.toLowerCase());
        }

    }
}
