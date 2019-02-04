package ExpresionesAvanzadas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {
    public static void main(String[] args) {
        String cadena = "1998/11/23";
        Pattern pat = Pattern.compile("^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))/02/29)$"
                + "|^(((19|2[0-9])[0-9]{2})/02/(0[1-9]|1[0-9]|2[0-8]))$"
                + "|^(((19|2[0-9])[0-9]{2})/(0[13578]|10|12)/(0[1-9]|[12][0-9]|3[01]))$"
                + "|^(((19|2[0-9])[0-9]{2})/(0[469]|11)/(0[1-9]|[12][0-9]|30))$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}
