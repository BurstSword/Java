package Gestoras;

import java.io.*;

public class GestoraArchivos {

    public static void mensajeBienvenida(String nombreGuerrero) {
        String mensaje;
        File mensajeBienvenida = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            mensajeBienvenida = new File("MensajeBienvenida.txt");
            fr = new FileReader(mensajeBienvenida);
            br = new BufferedReader(fr);
            mensaje = br.readLine();
            System.out.printf(mensaje, nombreGuerrero);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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

    }

}
