
import modelo.Conexion.Conexion;

import java.sql.*;
import java.util.ArrayList;

public class PartidaMVC {


    public void almacenarPartida(Partida partida) throws SQLException {
        Connection dbConnection;
        PreparedStatement ps;
        try {
            dbConnection = Conexion.getConnection();
            String consulta = "INSERT INTO Partida values ?,?,?";
            ps = dbConnection.prepareStatement(consulta);

            ps.setString(1, partida.getNombreEquipo());
            ps.setInt(2, partida.getTiempo());
            ps.setString(3, partida.getItinerario());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Partida> verPartidas() throws SQLException {

        Connection dbConnection = null;
        Statement stmt;
        ResultSet Rst;
        Partida partida = new Partida();
        ArrayList<Partida> listaPartida = new ArrayList<>();
        try {
            dbConnection = Conexion.getConnection();
            stmt = dbConnection.createStatement();
            Rst = stmt.executeQuery("SELECT * FROM partida");
            while (Rst.next()) {
                partida.setTiempo(Rst.getInt("Tiempo"));
                partida.setNombreEquipo(Rst.getString("NombreEquipo"));
                partida.setItinerario(Rst.getString("Itinerario"));
                listaPartida.add(partida);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert dbConnection != null;
                dbConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return listaPartida;
    }
}
