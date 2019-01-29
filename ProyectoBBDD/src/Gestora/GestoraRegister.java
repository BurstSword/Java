package Gestora;

/*
Clase gestora encargada del registro del usuario, que nos devolverá el objeto de usuario registrado
 */
import Entidades.Usuario;

import java.sql.*;
import java.util.Scanner;

public class GestoraRegister {
    //Declaramos las variables de Statement y ResultSet
    private static Statement stmt;
    private static ResultSet Rst;

    public static Usuario Register()  {
        //Creamos la conexión con la BBDD y declaramos las variables a utilizar por el método
        Connection conexion = GestoraConexiones.getConnection();
        String name, username, password;
        Scanner keyboard = new Scanner(System.in);
        Usuario usuario = null;

        //Pedimos que introduzca los datos del registro
        System.out.println("Hello, please introduce your name, your username and your password to register in this marvelous DataBase");
        System.out.print("Name: ");
        name = keyboard.next();
        System.out.print("\nUserID: ");
        username = keyboard.next();
        System.out.print("\nPassword: ");
        password = keyboard.next();


        try {
            /*Creamos la Query que comprobará si el nombre de usuario existe, si existe no dará error, si no nos podremos
            registrar con éxito
             */

            stmt = conexion.createStatement();
            Rst = stmt.executeQuery("SELECT usuario FROM usuarios WHERE usuario = \'" + username + "\'");

            if (Rst.next()) {
                System.out.println("That username is already in use");
            } else {
                stmt = conexion.createStatement();
                int Rs = stmt.executeUpdate("INSERT INTO usuarios (nombre, usuario, contrasena) VALUES ('" + name + "','" + username + "','" + password + "' )");
                usuario = new Usuario(name,username,password,false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return usuario;
    }
}
