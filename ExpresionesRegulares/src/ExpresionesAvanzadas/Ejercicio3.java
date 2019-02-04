package ExpresionesAvanzadas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {
    public static void main(String[] args) {
        String cadena = "23443063Z";
        Pattern pat = Pattern.compile("^[0-9]{8}[A-Z]$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}
