import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre;
        String[] nombres = {"Juan", "Pedro", "Teresa", "Olga"};
        String[] nombresNuevos;
        boolean existe = false;
        int o = 0;
        ArrayList<String> listaNombres = new ArrayList<String>() {
            {
                add("Pedro");
                add("Juan");
                add("Teresa");
                add("Olga");
            }
        };
        Scanner teclado = new Scanner(System.in);

        System.out.println(listaNombres.toString());

        System.out.println("Introduza un nombre");
        nombre = teclado.nextLine();

        for (int j = 0; j < listaNombres.size(); j++) {
            if (listaNombres.contains(nombre)) {
                System.out.println("Eliminando nombre");
                listaNombres.remove(j);
            }
        }
        System.out.println(listaNombres.toString());


        for (int k = 0; k < nombres.length; k++) {
            System.out.println("Nombre Nº" + k + ": " + nombres[k]);
        }

        System.out.println("Introduce un nombre");
        nombre = teclado.nextLine();

        nombresNuevos = new String[nombres.length - 1];


        for (int l = 0; l < nombres.length && !existe; l++) {
            if (nombre.equals(nombres[l])) {
                existe = true;
            }
        }
        if (existe) {
            for (int m = 0; m < nombres.length; m++) {
                if (!nombre.equals(nombres[m])) {
                    nombresNuevos[o] = nombres[m];
                    o++;
                }
            }
        }


        for (int n = 0; n < nombresNuevos.length; n++) {
            System.out.println("Nombre Nº" + n + ": " + nombresNuevos[n]);
        }
    }
}

