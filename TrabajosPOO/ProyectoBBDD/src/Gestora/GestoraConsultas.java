package Gestora;

/*
Clase gestora encargada de realizar las distintas consultas que realice el usuario con los m�todos SelectAll, Insert
y Delete
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;

public class GestoraConsultas {
    //Declaramos las clase Statement, ResultSet y el objeto teclado, que nos servir�n para todos los m�todos
    private static Statement stmt;
    private static ResultSet Rst;
    private static Scanner keyboard = new Scanner(System.in);

    //Este m�todo se encarga de realizar una consulta que nos muestre todo el contenido de la base de datos
    public static void SelectAll() {
        //Llamada al m�todo que conecta con la base de datos
        Connection conexion = GestoraConexiones.getConnection();

        try {
            stmt = conexion.createStatement();
            Rst = stmt.executeQuery("SELECT * FROM videojuegos");//Realizamos la consulta
            while (Rst.next()) {//Nos muestra en pantalla el resultado de la siguiente forma
                System.out.println("ID: " + Rst.getString("ID") + " ");
                System.out.println("Name: " + Rst.getString("Nombre") + " ");
                System.out.println("Developer: " + Rst.getString("Desarrolladora") + " ");
                System.out.println("Year: " + Rst.getString("A�O_DE_PUBLICACI�N"));
                System.out.println("<------------------------------>");
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
    }

    //M�todo que nos permite insertar nuevos registros en la base de datos
    public static void Insert() {
        //Variables a utilizar
        String nombre, developer;
        int year;
        //Llamada al m�todo que conecta con la base de datos
        Connection conexion = GestoraConexiones.getConnection();

        //El usuario introduce los siguientes valores que ser�n introducidos en la base de datos
        System.out.println("Introduce the name of the game, the developer and the year (xxxx) the game was released");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Name: ");
        nombre = keyboard.nextLine();
        System.out.print("Developer :");
        developer = keyboard.nextLine();
        System.out.print("Year: ");
        do {
            year = keyboard.nextInt();
        } while (year < 1000 || year > 2019);
        try {
            //Creamos la Query y la ejecutamos. Comprobamos que el nombre no exista, y en caso de que no existe se har� el Insert
            stmt = conexion.createStatement();
            Rst = stmt.executeQuery("select * from videojuegos WHERE nombre =  \'" + nombre + "\'");

            if (Rst.next()) {
                System.out.println("That videogame is already registered");
            } else {
                //Insert que se realizar� s�lo si el nombre del juego no exisit�a con anterioridad
                stmt = conexion.createStatement();
                int Rs = stmt.executeUpdate("INSERT INTO videojuegos (NOMBRE, DESARROLLADORA, A�O_DE_PUBLICACI�N) VALUES ('" + nombre + "','" + developer + "','" + year + "' )");
                System.out.println("Successful update");

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
    }
    //M�todo que nos permite borrar registros de la base de datos
    public static void Delete() {
        int ID;
        //Llamada al m�todo que conecta con la base de datos
        Connection conexion = GestoraConexiones.getConnection();


        try {
            //Creamos la Query y la ejecutamos para que nos muestre los distintos registros
            stmt = conexion.createStatement();
            Rst = stmt.executeQuery("select * from videojuegos ");
            while (Rst.next()) {
                System.out.println("ID: " + Rst.getString("ID") + " ");
                System.out.println("Name: " + Rst.getString("Nombre") + " ");
                System.out.println("Developer: " + Rst.getString("Desarrolladora") + " ");
                System.out.println("Year: " + Rst.getString("A�O_DE_PUBLICACI�N"));
                System.out.println("<------------------------------>");
            }
            //Pedimos que se introduzca el juego a borrar, en caso de que exista ser� eliminado, si no saltar� un mensaje de error
            System.out.println("Introduce the ID number of the game you want to delete");

            ID = keyboard.nextInt();

            stmt = conexion.createStatement();
            Rst = stmt.executeQuery("select * from videojuegos WHERE ID = " + ID);

            if (Rst.next()) {
                stmt = conexion.createStatement();
                int Rs = stmt.executeUpdate("DELETE FROM videojuegos WHERE ID = " + ID);
                System.out.println("Removed correctly");
            } else {
                System.out.println("That ID doesn�t match with our database");
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
    }

}


