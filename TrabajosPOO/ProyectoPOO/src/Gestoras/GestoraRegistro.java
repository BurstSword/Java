package Gestoras;

import java.io.*;
import java.util.Scanner;

public class GestoraRegistro {
    private static boolean comprobarNombre(String nombrePerfil) {
        boolean nombreExiste = false;
        File Usuarios;
        FileReader fr;
        BufferedReader br;
        String line;
        String usuario;
        String[] usuarios;
        int i;
        try {
            Usuarios = new File("Usuarios_Contrasenas.txt");
            fr = new FileReader(Usuarios);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                usuarios = line.split("/");

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return nombreExiste;
    }

    private static void crearUsuarioYContrasena(String nombrePerfil, String contrasena) {
        File escribir = null;
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            escribir = new File("Usuarios_Contrasenas.txt");
            fw = new FileWriter(escribir, true);
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(nombrePerfil + "/" + contrasena);
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
        String nombrePerfil, contrasena = "";
        boolean nombreExiste;

        do {
            System.out.println("Introduzca el nombre con el que quiera crear su usuario ");
            nombrePerfil = teclado.next();
            nombreExiste = comprobarNombre(nombrePerfil);

            if (nombreExiste) {
                System.out.println("Este nombre ya existe, elija otro");
            }
        } while (nombreExiste);
        do {
            System.out.println("Introduzca su contraseña");
            contrasena = teclado.next();
        } while (contrasena.equals(""));

        crearUsuarioYContrasena(nombrePerfil, contrasena);


    }


}

