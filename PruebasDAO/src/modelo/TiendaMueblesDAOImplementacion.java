package modelo;

import java.sql.*;
import java.util.ArrayList;

public class TiendaMueblesDAOImplementacion implements TiendaMueblesDAO {
    private Connection conexion;


    public TiendaMueblesDAOImplementacion(){

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
    public ArrayList<Articulo> buscarTodosLosArticulos() throws SQLException {
        ArrayList<Articulo> articulos = new ArrayList<>();
        conexion = getDBConnection();
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery("Select id_articulo, nombre, importe, descuento FROM articulo");
        while (rs.next()) {
            Articulo articulo = new Articulo();

            articulo.setId_articulo(rs.getInt(1));
            articulo.setNombre(rs.getString(2));
            articulo.setImporte(rs.getDouble(3));
            articulo.setDescuento(rs.getDouble(4));
            articulos.add(articulo);
        }
        return articulos;
    }
}
