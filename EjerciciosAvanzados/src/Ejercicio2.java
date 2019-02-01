import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba un string");
        String cad = teclado.next();
        if ()
            System.out.println("Es un string");
        else
            System.out.println("No es un string");
    }

    public static boolean isString(Object str) {
        if (str.equals(str.toString())) {
            return true;
        } else {
            return false;
        }
    }


    public static String recibeDato(String cadena) {
        String lectura = cadena;
        try {
            InputStreamReader sr = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(sr);
            lectura = bf.readLine();
            return lectura;
        } catch (IOException ioe) {
            System.out.println("Hubo un error al obtener su entrada: " + ioe.getMessage());
            return recibeDato(cadena);
        }


    }
}