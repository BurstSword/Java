package General;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {
    public static void main(String[] args) {
        String cadena = "b";
        Pattern pat = Pattern.compile("^[^a]$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("S�");
        } else {
            System.out.println("No");
        }
    }
}
