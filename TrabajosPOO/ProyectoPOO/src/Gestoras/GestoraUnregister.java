package Gestoras;

import java.io.*;
import java.util.Scanner;

public class GestoraUnregister {


    public static void Unregister() {

        File file;
        FileWriter fw = null;
        BufferedWriter bw = null;

        Scanner teclado = new Scanner(System.in);
        String usuario;
        String contrasena;

        System.out.print("Usuario: ");
        usuario = teclado.nextLine();
        System.out.print("Contraseña: ");
        contrasena = teclado.nextLine();

        try {

            file = new File("Usuarios_Contrasenas.txt");

            File ficheroNuevo = new File(file.getAbsolutePath() + ".tmp");

            BufferedReader br = new BufferedReader(new FileReader("Usuarios_Contrasenas.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter(ficheroNuevo));

            String line;

            while ((line = br.readLine()) != null) {

                if (!line.trim().equals(usuario)) {

                    pw.println(line);
                    pw.flush();
                }

            }

            pw.close();
            br.close();


            file.delete();

            ficheroNuevo.renameTo(file);

        } catch (IOException ex) {
            ex.getMessage();

        }

        try {

            file = new File("Usuarios_Contrasenas.txt");

            File ficheroNuevo = new File(file.getAbsolutePath() + ".tmp");

            BufferedReader br = new BufferedReader(new FileReader("Usuarios_Contrasenas.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter(ficheroNuevo));

            String linea;

            while ((linea = br.readLine()) != null) {

                if (!linea.trim().equals(contrasena)) {

                    pw.println(linea);
                    pw.flush();
                }
            }

            pw.close();
            br.close();


            if (file.delete()) {
                System.out.println("\nUsuario eliminado satisfactoriamente");
            }

            ficheroNuevo.renameTo(file);


        } catch (IOException ex) {
            ex.getMessage();

        }
    }
}



