import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Ejercicio9 ej = new Ejercicio9();
        String CadenaAleatoria;
        char letra1;
        char letra5;

        CadenaAleatoria = ej.leerString();
        letra1 = ej.sacarLetra1(CadenaAleatoria);
        letra5 = ej.sacarLetra5(CadenaAleatoria);
        System.out.println("La letra 1 es " + letra1 + " y la letra 5 es " + letra5);
    }

    String leerString() {
        String Cadena1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba una palabra");
        Cadena1 = teclado.next();
        return Cadena1;
    }
    char sacarLetra1(String CadenaAleatoria){
        char letras;
        letras = CadenaAleatoria.charAt(0);
        return letras;
    }
    char sacarLetra5(String CadenaAleatoria){
        char letra2;
        letra2 = CadenaAleatoria.charAt(4);
        return letra2;
    }
}
