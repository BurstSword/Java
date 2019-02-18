package Ejercicio2;

import java.sql.*;
import java.util.Scanner;

public class TiendaJuegos {
    /*Método main el que tendremos el programa principal, dónde iremos llamando a los distintos métodos para interactuar
    con la base de datos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int btn;

    /*
    Aquí validamos que el usuario elige una opción existente y estos bucles no terminan hasta que el usuario
    pulse la opción de salir
    */
        System.out.println("Bienvenido a tu tienda de juegos favorita");
        do {
            do {
                Menu();
                btn = teclado.nextInt();

            } while (btn < 1 || btn > 3);

            switch (btn) {
                case 1:
                    AnadirDatos();
                    break;

                case 2:
                    ConsultarDatos();
                    break;
            }

        } while (btn != 3);
        System.out.println("Adiós!");
    }

    //Método que conecta con la base de datos
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/tienda_juegos";
        String driver = "com.mysql.jdbc.Driver";
        String usuario = "root";
        String contrasena = "";
        Connection con = null;

        try {
            Class.forName(driver);
            try {
                con = DriverManager.getConnection(url, usuario, contrasena);
                System.out.println("Conectado");
            } catch (SQLException ex) {
                ex.getStackTrace();

            }
        } catch (ClassNotFoundException ex) {

            System.out.println("No se encuentra el driver");
        }
        return con;
    }

    //Método que muestra el menú principal del programa
    public static void Menu() {
        System.out.println("Pulse el número correspondiente a la acción que quiera realizar");
        System.out.println("1. Dar de alta un juego nuevo");
        System.out.println("2. Ver todo el listado de juegos");
        System.out.println("3. Salir");
    }

    /*
    Método que nos permite insertar datos en la base de datos
     */
    public static void AnadirDatos() {
        Connection conexion = getConnection();
        Statement stm;
        ResultSet rst;
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoStr = new Scanner(System.in);
        String juego, autor;
        int cod;


        System.out.println("Introduzca el nombre del juego");
        juego = tecladoStr.nextLine();
        System.out.println("Introduzca el autor del juego");
        autor = tecladoStr.nextLine();
        System.out.println("Introduzca el código del juego");
        cod = teclado.nextInt();


        try {
            stm = conexion.createStatement();
            int Rst = stm.executeUpdate("INSERT INTO juego (codigo, titulo, autor) VALUES (\' + cod + \', \' + juego+\', \'+autor+\')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
    Método que nos permite consultar datos en la base de datos
     */
    public static void ConsultarDatos() {
        Connection conexion = getConnection();
        Statement stm;
        ResultSet rst;
        String aut;
        Scanner tecladoStr = new Scanner(System.in);
        System.out.println("Introduzca el autor que quiere  comprobar");
        aut = tecladoStr.nextLine();

        try {
            stm = conexion.createStatement();
            rst = stm.executeQuery("SELECT codigo, titulo FROM juego WHERE autor=aut");
            while (rst.next()) {
                System.out.println("ID:" + rst.getString("codigo"));
                System.out.println("Juego: " + rst.getString("titulo"));
                System.out.println("<------------------------>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


