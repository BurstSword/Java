import java.sql.*;

public class LoginRegister {


    private static Statement stmt = null;
    private static ResultSet rs = null;



    public static void Login(String nombreUsuario, String contrasena){
        Connection connection = ConnectionHandler.getConnection();
        try {
            String Login = "SELECT ID, Nombre, Contrasena FROM Usuario Where nombre = ?";
            stmt = connection.prepareCall(Login);
            ((CallableStatement) stmt).setString(1,nombreUsuario);
            rs = ((CallableStatement) stmt).executeQuery();
            if(rs.wasNull()){
                System.out.println("Login incorrecto");
            }else{
                if(rs.next()){
                    if(rs.getString(3).equals(contrasena)){
                        System.out.println("Login satisfactorio");
                    }else{
                        System.out.println("Login incorrecto");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void Register(String nombreUsuario, String contrasena){
        Connection connection = ConnectionHandler.getConnection();
        try {
            String Login = "Insert into Usuario (Nombre, Contrasena) Values ?, ?";
            stmt = connection.prepareCall(Login);
            ((CallableStatement) stmt).setString(1,nombreUsuario);
            ((CallableStatement) stmt).setString(2,contrasena);
            rs =((CallableStatement) stmt).executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }





    }

}
