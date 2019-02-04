package ExpresionesAvanzadas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {
    public static void main(String[] args) {
        String cadena = "prueba@gmail.com";
        Pattern pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}
