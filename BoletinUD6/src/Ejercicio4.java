import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String nombre;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        nombre = teclado.nextLine();
        aMayusculas(nombre);
    }

    public static void aMayusculas(String nombre) {
        int contador = 0;
        while (nombre != null && contador != 5) {
            contador++;
            System.out.println(nombre.toUpperCase());
        }

    }
}
