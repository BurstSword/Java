package General;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio8 {
    public static void main(String[] args) {
        String cadena = "hola";
        Pattern pat = Pattern.compile("^hola$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("S�");
        } else {
            System.out.println("No");
        }
    }
}
