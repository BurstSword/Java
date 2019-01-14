package Gestoras;

import java.io.*;
import java.util.Scanner;

public class GestoraRegistro {
    private static boolean comprobarNombre(String nombrePerfil) {
        boolean nombreExiste = false;

        File carpetaLista = new File("Jugadores");

        String usuarios[] = carpetaLista.list();

        for (int i = 0; i < usuarios.length && !nombreExiste; i++) {

            if (usuarios[i].equals(nombrePerfil)) {
                nombreExiste = true;

            } else {
                nombreExiste = false;
            }
        }
        return nombreExiste;
    }

    private static void crearUsuario(String nombrePerfil) {
        boolean usuario = new File("Jugadores\\" + nombrePerfil).mkdir();

    }

    private static void crearContrasena(String nombrePerfil, String contrasena) {

        File file = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {

            file = new File("Jugadores\\" + nombrePerfil + "\\contraseña.txt");
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(contrasena);
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void registro() {
        Scanner teclado = new Scanner(System.in);
        String nombrePerfil, contrasena;
        boolean nombreExiste;

        do {
            System.out.println("Introduzca el nombre con el que quiera crear su usuario ");
            nombrePerfil = teclado.next();
            nombreExiste = comprobarNombre(nombrePerfil);

            if (nombreExiste) {
                System.out.println("Este nombre ya existe, elija otro");
            }
        } while (nombreExiste);

        crearUsuario(nombrePerfil);
        do {
            System.out.println("Introduzca su contraseña");
            contrasena = teclado.next();
        } while (contrasena.equals(""));

        crearContrasena(nombrePerfil, contrasena);

    }
}
