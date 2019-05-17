package Modelo;

import java.sql.*;
import java.util.ArrayList;

public class LibreriaDAOImplementacion implements LibreriaDAO {
    private Connection conexion;
    private Statement st;
    private ResultSet rs;


    public LibreriaDAOImplementacion(){

    }

    @Override
    public Connection getDBConnection() {
        try {
            Class.forName(DRIVER_BD);
            System.out.println("driver cargado");
        } catch (Exception e) {
            System.out.println("Se ha encontrado un error: " + e);
        }
        try {
            conexion = DriverManager.getConnection(RUTA_BD, USER_BD,
                    PASS_BD);
            System.out.println("...conectando a la base de datos...");
        } catch (SQLException e) {
            System.out.println("Se ha encontrado un error: " + e);
        }
        return conexion;
    }

    @Override
    public ArrayList<Libro> buscarTodosLosLibros() throws SQLException {
        ArrayList<Libro> libros = new ArrayList<>();
        conexion = getDBConnection();
        st = conexion.createStatement();
        rs = st.executeQuery("Select isbn, titulo, autor FROM libro");
        while (rs.next()) {
            Libro libro = new Libro();

            libro.setIsbn(rs.getInt(1));
            libro.setAutor(rs.getString(3));
            libro.setTitulo(rs.getString(2));
            libros.add(libro);
        }
        return libros;
    }
}
