package Cuantificadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena = "aac23";
        Pattern pat = Pattern.compile("^[a-z]{3}[0-9]{2}$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}
