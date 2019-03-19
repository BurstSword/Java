package Gestoras;

import java.util.Scanner;


public class GestoraEntradaTeclado {


    public static String introducirNombre() {
        boolean correcto;
        String nombre;
        Scanner sc = new Scanner(System.in);


        do {
            nombre = sc.nextLine();
            correcto = nombre.matches("^[A-Z][a-z]*$");
            if (correcto) {
                System.out.println("Nombre introducido correctamente");
            } else {
                System.out.println("Error: El nombre debe comenzar con mayúsculas.");
            }
        } while (!correcto);
        return nombre;
    }


}
