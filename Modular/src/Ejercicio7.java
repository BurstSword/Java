import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Ejercicio7 ej = new Ejercicio7();
        String perro;
        int medida;

        perro = ej.leerString();
        medida = ej.medir(perro);
        System.out.println("El nombre de su perro contiene " + medida + " letras");

    }

    String leerString() {
        String perro1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba el nombre de su perro");
        perro1 = teclado.next();
        return perro1;
    }

    int medir(String medida1) {
        int medida2;

        medida2 = medida1.length();

        return medida2;
    }

}
