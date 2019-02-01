package Gestoras;


import java.io.*;
import java.util.Scanner;

public class GestoraLogin {

    public static boolean login() {
        Scanner teclado = new Scanner(System.in);
        String nombrePerfil, contrasena;
        String line;
        String[] usuarios;
        System.out.print("Usuario: ");
        nombrePerfil = teclado.next();
        System.out.print("Contraseña: ");
        contrasena = teclado.next();
        boolean coincide=false;


        try {

            File file = new File("Usuarios_Contrasenas.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                usuarios = line.split("/");
                if (usuarios.equals(nombrePerfil)) {
                    if(usuarios.equals(contrasena)){
                        coincide=true;
                        System.out.println("Login correcto");
                    }
                }else{
                    System.out.println("Login incorrecto");
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return coincide;
    }

}
