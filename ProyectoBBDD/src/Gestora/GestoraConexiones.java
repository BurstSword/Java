package Gestora;

/*
Clase encargada de la conexi�n con la base de datos a la hora de hacer cualquier query
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestoraConexiones {
//Variables en las que almacenamos la localizaci�n de la base de datos, el driver, y el usuario y contrase�a//
    private static String url = "jdbc:mysql://localhost:3306/videojuegos";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "";
    private static Connection con;


    public static Connection getConnection() {
        try {
            Class.forName(driverName); //Cargamos la clase del driver de JDBC
            try {
                con = DriverManager.getConnection(url,username,password); //Establecemos conexi�n con la base de datos
                System.out.println("Successful connection");
            } catch (SQLException ex) {
                ex.getStackTrace();

            }
        } catch (ClassNotFoundException ex) {
        //En caso de error dir� que no encontr� el driver
            System.out.println("Driver not found.");
        }
        return con;
    }
}

