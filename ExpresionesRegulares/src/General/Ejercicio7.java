package General;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio7 {
    public static void main(String[] args) {
        String cadena = "99";
        Pattern pat = Pattern.compile("^[0-9]$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}
