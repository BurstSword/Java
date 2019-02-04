package Cuantificadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {
    public static void main(String[] args) {
        String cadena = "aac";
        Pattern pat = Pattern.compile("^[a-z]{3}$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}
