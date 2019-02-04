package General;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio6 {
    public static void main(String[] args) {
        String cadena = "a";
        Pattern pat = Pattern.compile("^[a-z]$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}
