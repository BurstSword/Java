package Metacaracteres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {
    public static void main(String[] args) {
        String cadena = "6";
        Pattern pat = Pattern.compile("^\\D$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("S�");
        } else {
            System.out.println("No");
        }
    }
}
