package Gestoras;

import java.util.Scanner;


public class GestoraEntradaTeclado {

    /**
     * M�todo encargado de comprobar que el nombre introducido sea correcto
     * @return boolean que tiene valor false si el nombre no tiene el formato correcto y true si el formato es correcto
     */
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
                System.out.println("Error: El nombre debe comenzar con may�sculas.");
            }
        } while (!correcto);
        return nombre;
    }


}
