package EjercicioFinal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GestoraComprobar {
    public static void Nombre(String nombre){
        Pattern pat = Pattern.compile("^[A-Z]{1}[a-z]+$");
        Matcher mat = pat.matcher(nombre);
        if (mat.matches()) {
            System.out.println("Correcto");
        } else {
            System.out.println("Inválido");
        }
    }
    public static void edad(String edad){
        Pattern pat = Pattern.compile("^[A-Z]{1}[a-z]+$");
        Matcher mat = pat.matcher(edad);
        if (mat.matches()) {
            System.out.println("Correcto");
        } else {
            System.out.println("Inválido");
        }
    }

    public static void tlf(String tlf){
        Pattern pat = Pattern.compile("^955[0-9]{6}$");
        Matcher mat = pat.matcher(tlf);
        if (mat.matches()) {
            System.out.println("Correcto");
        } else {
            System.out.println("Inválido, debe comenzar por 955");
        }
    }

    public static void mail(String mail){
        Pattern pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(mail);
        if (mat.matches()) {
            System.out.println("Correcto");
        } else {
            System.out.println("Correo inválido");
        }
    }
}
