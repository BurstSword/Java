package General;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {
    public static void main(String[] args) {
        String cadena = "a1";
        Pattern pat = Pattern.compile("^[a-c][0-1]$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}
