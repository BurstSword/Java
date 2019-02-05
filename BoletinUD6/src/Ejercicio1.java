

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {
    private static Pattern pat;
    private static Matcher mat;
    public static void main(String[] args) {
        String matricula;
        Scanner teclado = new Scanner(System.in);

        matricula=teclado.nextLine();
        mostrar(matricula);

    }

    public static void mostrar(String matricula){
        if(leerMatricula(matricula)){
            System.out.println(matricula + " matricula correcta");
        }else{
            System.out.println("Formato incorrecto");
        }
    }

    public static boolean leerMatricula(String nombre){
        boolean correcto;
        pat = Pattern.compile("[0-9]{4}[A-Z]{3}$");
        mat = pat.matcher(nombre);
        if (mat.matches()) {
            correcto=true;
        } else {
            correcto=false;
        }
        return correcto;
    }
}
