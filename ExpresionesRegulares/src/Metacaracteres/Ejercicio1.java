package Metacaracteres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {
    public static void main(String[] args) {
        String cadena = "4";
        Pattern pat = Pattern.compile("\\d");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}
