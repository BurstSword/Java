package EjercicioFinal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GestoraComprobar {
    private static Pattern pat;
    private static Matcher mat;
    public static void nombre(String nombre){
        pat = Pattern.compile("^[A-Z]{1}[a-z]+$");
        mat = pat.matcher(nombre);
        if (mat.matches()) {
            System.out.println("Correcto");
        } else {
            System.out.println("Inválido");
        }
    }
    public static void edad(String edad){
        pat = Pattern.compile("^[0-9]{1}+$");
        mat = pat.matcher(edad);
        if (mat.matches()) {
            System.out.println("Correcto");
        } else {
            System.out.println("Inválido");
        }
    }

    public static void tlf(String tlf){
        pat = Pattern.compile("^955[0-9]{6}$");
        mat = pat.matcher(tlf);
        if (mat.matches()) {
            System.out.println("Correcto");
        } else {
            System.out.println("Inválido, debe comenzar por 955");
        }
    }

    public static void mail(String mail){
        pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        mat = pat.matcher(mail);
        if (mat.matches()) {
            System.out.println("Correcto");
        } else {
            System.out.println("Correo inválido");
        }
    }
}
