package Gestora;
/*
Clase gestora encargada de dar de baja a los usuarios de la aplicación
 */
import Entidades.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GestoraUnregister {
    public static Usuario Unregister() {
        //Establecemos la conexión con la BBDD y declaramos las variables necesarias para realizarlo
        String username, contrasena;
        Connection conexion = GestoraConexiones.getConnection();
        Statement stmt;
        ResultSet Rst;
        Scanner keyboard = new Scanner(System.in);
        Usuario usuario = null;



        System.out.println("Introduce your password");
        System.out.print("\nPassword: ");
        contrasena = keyboard.next();
        username = GestoraInfo.usuario.getUsername();
        try {

            stmt = conexion.createStatement();
            Rst = stmt.executeQuery("SELECT * FROM usuarios WHERE usuario = \'" + username + "\'");

            if (Rst.next()) {
                if (Rst.getString("contrasena").equals(contrasena)) {
                    int rst = stmt.executeUpdate("DELETE FROM usuarios WHERE usuario = " + username);
                    System.out.println("User unregistered correctly");
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
