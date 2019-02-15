import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreYApellidos;

        System.out.println("Escriba su nombre y apellidos separados por espacios");
        nombreYApellidos = teclado.nextLine();
        generarCodigo(nombreYApellidos);
    }

    public static void generarCodigo(String nombreYApellidos) {
        nombreYApellidos = nombreYApellidos.toUpperCase();
        String[] codigos = nombreYApellidos.split(" ");

        System.out.println("Su código es " + codigos[2].substring(0, 3) + codigos[1].substring(0, 3) + codigos[0].substring(0, 3));

    }
}
