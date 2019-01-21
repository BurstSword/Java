package Gestoras;


import java.io.*;
import java.util.Scanner;

public class GestoraLogin {

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

    private static boolean escribirContraseña(String contrasenaIntroducida, String nombrePerfil) {
        boolean contrasenaCoincide;
        String contrasenaCorrecta = "";
        File file ;
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

    public static void login() {
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
                    contrasenaCoincide = escribirContraseña(contrasena, nombrePerfil);
                    if (contrasenaCoincide) {
                        System.out.println("Identificado correctamente");
                    }
                }
            } while (!contrasenaCoincide);
        } while (!nombreExiste);
    }


}
