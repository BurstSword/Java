package Cuantificadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {
    public static void main(String[] args) {
        String cadena = "";
        Pattern pat = Pattern.compile("^\\d+$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}
