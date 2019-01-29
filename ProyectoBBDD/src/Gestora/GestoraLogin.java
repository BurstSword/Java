package Gestora;


/*
Clase encarga del loggeo de los usuarios en la aplicación, que nos devolverá un usuario
con los datos introducidos por teclado
 */

import Entidades.Usuario;

import java.sql.*;
import java.util.Scanner;

public class GestoraLogin {
    //Declaramos las variables Statement y Resulset
    private static Statement stmt;
    private static ResultSet Rst;

    public static Usuario Login() {
        //Variables que utilizaremos para validad el Login
        String nombre, username, contrasena;
        Scanner keyboard = new Scanner(System.in);
        boolean admin;
        Connection conexion = GestoraConexiones.getConnection();
        Usuario usuario = null;

        //Pedimos que introduzca por teclado su ID y su contraseña
        System.out.println("Introduce your username and your password");
        System.out.print("\nUserID: ");
        username = keyboard.next();
        System.out.print("\nPassword: ");
        contrasena = keyboard.next();

        try {
            /*Comprobamos que el usuario existe, y si existe comprobará la contraseña
            Si todo está correcto nos dejará loggearnos con éxito
             */

            stmt = conexion.createStatement();
            Rst = stmt.executeQuery("SELECT * FROM usuarios WHERE usuario = \'" + username + "\'");

            if (Rst.next()) {
                if (Rst.getString("Contrasena").equals(contrasena)) {

                    System.out.println("Successful login");
                    nombre = Rst.getString("nombre");
                    admin = Rst.getBoolean("admin");
                    usuario = new Usuario(nombre, username, contrasena, admin);
                } else {

                    System.out.println("Wrong username or password");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return usuario;
    }
}
