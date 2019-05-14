import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHandler {

    private static String url = "jdbc:mysql://localhost:3306/";
    private static String driver = "com.mysql.jdbc.Driver";
    private static String usuario = "root";
    private static String contrasena = "";
    private static Connection con;


    public static Connection getConnection() {
        try {
            Class.forName(driver);
            try {
                con = DriverManager.getConnection(url,usuario, contrasena);
                System.out.println("Conectado");
            } catch (SQLException ex) {
                ex.getStackTrace();

            }
        } catch (ClassNotFoundException ex) {

            System.out.println("No se encuentra el driver");
        }
        return con;
    }
}
