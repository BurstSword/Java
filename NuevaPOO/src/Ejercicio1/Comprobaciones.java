package Ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comprobaciones {
    private boolean DNICorrecto;
    private boolean FechaCorrecta;
    private static Pattern pat;
    private static Matcher mat;


    public Comprobaciones(boolean DNICorrecto, boolean fechaCorrecta) {
        this.DNICorrecto = DNICorrecto;
        this.FechaCorrecta = fechaCorrecta;
    }

    public boolean isDNICorrecto() {
        return DNICorrecto;
    }

    public void setDNICorrecto(boolean DNICorrecto) {
        this.DNICorrecto = DNICorrecto;
    }

    public boolean isFechaCorrecta() {
        return FechaCorrecta;
    }

    public void setFechaCorrecta(boolean fechaCorrecta) {
        FechaCorrecta = fechaCorrecta;
    }

    public static boolean comprobarDNI(String DNI) {
        boolean correcto;
        pat = Pattern.compile("^[0-9]{8}[A-Z]{1}$");
        mat = pat.matcher(DNI);

        if (mat.matches()) {
            correcto = true;
        } else {
            correcto = false;
        }

        return correcto;
    }

    public static boolean comprobarFecha(String fechaNac) {
        boolean correcto;
        pat = Pattern.compile("^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))/02/29)$"
                + "|^(((19|2[0-9])[0-9]{2})/02/(0[1-9]|1[0-9]|2[0-8]))$"
                + "|^(((19|2[0-9])[0-9]{2})/(0[13578]|10|12)/(0[1-9]|[12][0-9]|3[01]))$"
                + "|^(((19|2[0-9])[0-9]{2})/(0[469]|11)/(0[1-9]|[12][0-9]|30))$");
        mat = pat.matcher(fechaNac);

        if (mat.matches()) {
            correcto = true;
        } else {
            correcto = false;
        }

        return correcto;
    }
}
