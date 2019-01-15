package Gestoras;

import java.io.*;
import java.util.Scanner;

public class GestoraUnregister {
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


    private static boolean escribirContrasena(String contrasenaIntroducida, String nombrePerfil) {
        boolean contrasenaCoincide;
        String contrasenaCorrecta = "";
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            file = new File("Jugadores\\" + nombrePerfil + "\\contrasena.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            contrasenaCorrecta = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (contrasenaCorrecta.equals(contrasenaIntroducida)) {
            contrasenaCoincide = true;
        } else {
            contrasenaCoincide = false;
        }
        return contrasenaCoincide;

    }

    private static void borrarRegistro(String nombrePerfil) {
        File file = null;
        FileReader fr = null;
        try {
            file = new File("Jugadores\\" + nombrePerfil);
            fr = new FileReader(file);
            file.delete();

        } catch (NullPointerException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void Unregister() {
        Scanner teclado = new Scanner(System.in);
        String nombrePerfil, contrasena;
        boolean nombreExiste, contrasenaCoincide = false;
        do {
            System.out.println("Introduzca su nombre de usuario");
            nombrePerfil = teclado.next();
            nombreExiste = comprobarNombre(nombrePerfil);
            do {


                if (nombreExiste) {
                    System.out.println("Usuario correcto, introduzca la contraseña");
                    contrasena = teclado.next();
                    contrasenaCoincide = escribirContrasena(contrasena, nombrePerfil);
                    if (contrasenaCoincide) {
                        borrarRegistro(nombrePerfil);
                    }
                }
            } while (!contrasenaCoincide);
        } while (!nombreExiste);
    }
}



