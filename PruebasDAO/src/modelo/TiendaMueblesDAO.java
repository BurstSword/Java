package modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public interface TiendaMueblesDAO {
    String DRIVER_BD = "com.mysql.jdbc.Driver";
    String RUTA_BD = "jdbc:mysql://localhost:3306/test";
    String USER_BD = "root";
    String PASS_BD = "";
    Connection getDBConnection();

    ArrayList<Articulo>
    buscarTodosLosArticulos() throws
            SQLException;
}
