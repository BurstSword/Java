package Cuantificadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {
    public static void main(String[] args) {
        String cadena = "41312HHH";
        Pattern pat = Pattern.compile("^\\d+[A-Z]+$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}
