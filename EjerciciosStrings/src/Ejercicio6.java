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
        String parte1, parte2, parte3;

        parte1 = codigos[2].substring(0, 3);
        parte2 = codigos[1].substring(0, 3);
        parte3 = codigos[0].substring(0, 3);

        System.out.println(parte1 + parte2 + parte3);

    }
}
