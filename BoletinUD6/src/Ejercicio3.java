import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {
    private static Pattern pat;
    private static Matcher mat;

    public static void main(String[] args) {
        String matricula, nombre, tlf;
        Scanner teclado = new Scanner(System.in);

        matricula = teclado.nextLine();
        nombre = teclado.nextLine();
        tlf = teclado.nextLine();
        mostrar(matricula, nombre, tlf);

    }

    public static void mostrar(String matricula, String nombre, String tlf) {
        if (leerMatricula(matricula)) {
            System.out.println(matricula + " matricula correcta");
        } else {
            System.out.println(matricula + " formato incorrecto");
        }
        if (leerNombre(nombre)) {
            System.out.println(nombre + " nombre correcto");
        } else {
            System.out.println(nombre + " formato incorrecto");
        }
        if (leerTlf(tlf)) {
            System.out.println(tlf + " teléfono correcto");
        } else {
            System.out.println(tlf + " formato incorrecto");
        }
    }

    public static boolean leerMatricula(String nombre) {
        boolean correcto;
        pat = Pattern.compile("[0-9]{4}[A-Z]{3}$");
        mat = pat.matcher(nombre);
        if (mat.matches()) {
            correcto = true;
        } else {
            correcto = false;
        }
        return correcto;
    }

    public static boolean leerNombre(String nombre) {
        boolean correcto;
        pat = Pattern.compile("^[A-Z]{1}[a-z]+$");
        mat = pat.matcher(nombre);
        if (mat.matches()) {
            correcto = true;
        } else {
            correcto = false;
        }
        return correcto;
    }

    public static boolean leerTlf(String nombre) {
        boolean correcto;
        pat = Pattern.compile("^955[0-9]{6}$");
        mat = pat.matcher(nombre);
        if (mat.matches()) {
            correcto = true;
        } else {
            correcto = false;
        }
        return correcto;
    }
}
