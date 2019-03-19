

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Gestoras.GestoraGuerrero;
import Gestoras.GestoraMonstruo;
import Entidades.Guerrero;
import Entidades.Monstruo;

public class ControlEntradaTeclado {

    public static void crearGuerrero() {
        System.out.println("Introduce el nombre del Guerrero");
        String nombreGuerrero = introducirNombre();
        Guerrero guerrero = GestoraGuerrero.generarGuerrero(nombreGuerrero);


    }

    public static void crearMonstruo() {
        System.out.println("Introduce el nombre del Monstruo");
        String nombreMonstruo = introducirNombre();
        Monstruo monstruo = GestoraMonstruo.generarMonstruo(nombreMonstruo);
    }

    public static String introducirNombre() {
        boolean correcto;
        String nombre;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
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

    public static int controlNumero() {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException i) {
            i.printStackTrace();
        } finally {
            sc.nextLine();
        }

        return num;
    }

}
