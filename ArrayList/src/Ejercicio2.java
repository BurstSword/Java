import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre;
        String[] nombres = {"Juan", "Pedro", "Teresa", "Olga"};
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

        int l, m;
        for (l = m = 0; m < nombres.length; ++m) {
            if (!nombre.equals(nombres[m])) {
                nombres[l++] = nombres[m];
                nombres = Arrays.copyOf(nombres, l);
            }
        }

        for (int n = 0; n < nombres.length; n++) {
            System.out.println("Nombre Nº" + n + ": " + nombres[n]);
        }
    }
}

