import Modelo.Conexion.Conexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlmacenarPartida {
    private static PreparedStatement preparedStatement = null;


    public static void prepareStatement() {
        try {
            // Creamos el PreparedStatement si no estaba ya creado.
            if (null == preparedStatement) {
                preparedStatement = Conexion.prepareStatement(
                        "insert into partida values (?,?,?)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void almacenarPartida(Partida partida) throws SQLException {
        preparedStatement.setString(1, partida.getNombreEquipo());
        preparedStatement.setInt(2, partida.getTiempo());
        preparedStatement.setString(3, partida.getItinerario());
        preparedStatement.executeUpdate();
    }
}
