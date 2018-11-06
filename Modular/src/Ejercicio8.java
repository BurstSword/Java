import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Ejercicio8 ej = new Ejercicio8();
        String Cadena1;
        String Cadena2;
        String Concat;


        Cadena1 = ej.leerCadena1();
        Cadena2 = ej.leerCadena2();
        Concat = ej.concat1(Cadena1, Cadena2);
        System.out.println(Concat);

    }

    String leerCadena1() {
        String Cadena1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba una cadena de caractéres");
        Cadena1 = teclado.next();
        return Cadena1;

    }

    String leerCadena2() {
        String Cadena2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba otra cadena de caractéres");
        Cadena2 = teclado.next();
        return Cadena2;
    }
    String concat1(String Cadena1, String Cadena2){
        String concate;
        concate = Cadena1.concat(Cadena2);
        return concate;
    }
}
