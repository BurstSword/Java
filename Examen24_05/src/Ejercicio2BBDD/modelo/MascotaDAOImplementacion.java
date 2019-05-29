package Ejercicio2BBDD.modelo;

import java.sql.*;
import java.util.ArrayList;

public class MascotaDAOImplementacion implements MascotaDAO {
    private Connection dbConnection;
    private Statement st;
    private ResultSet rs;

    @Override
    public Connection getDBConnection() {
        try {
            Class.forName(DRIVER_BD);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            dbConnection = DriverManager.getConnection(RUTA_BD, USER_BD, PASS_BD);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }

    @Override
    public void insertarMascota(Mascota mascota) {
        dbConnection = getDBConnection();

        try {
            st = dbConnection.createStatement();
            rs = st.executeQuery("Select MAX(id_mascota) from mascota");
            while (rs.next()) {
                mascota.setIdMascota(rs.getInt(1) + 1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            st = dbConnection.createStatement();
            int rst = st.executeUpdate("Insert into mascota values ('"+mascota.getIdMascota()+"', '"+ mascota.getTipo()+"', '"+mascota.getNombre()+"'," +
                    "'"+mascota.getEdad()+"', '"+ mascota.getRaza()+"', '"+mascota.getAnyoVacuna()+"')");
            System.out.println("Insercion realizada");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Mascota> mostrarMascotas() {
        ArrayList<Mascota> mascotas = new ArrayList<>();

        dbConnection = getDBConnection();
        try {
            st = dbConnection.createStatement();
            rs = st.executeQuery("SELECT * from mascota");
            while (rs.next()) {
                Mascota mascota = new Mascota();
                mascota.setIdMascota(rs.getInt(1));
                mascota.setTipo(rs.getString(2));
                mascota.setNombre(rs.getString(3));
                mascota.setEdad(rs.getInt(4));
                mascota.setRaza(rs.getString(5));
                mascota.setAnyoVacuna(rs.getInt(6));

                mascotas.add(mascota);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mascotas;
    }

    @Override
    public ArrayList<Mascota> mostrarMascotasOrdenadas() {
        ArrayList<Mascota> mascotas = new ArrayList<>();

        dbConnection = getDBConnection();
        try {
            st = dbConnection.createStatement();
            rs = st.executeQuery("SELECT * from mascota order by edad asc");
            while (rs.next()) {
                Mascota mascota = new Mascota();
                mascota.setIdMascota(rs.getInt(1));
                mascota.setTipo(rs.getString(2));
                mascota.setNombre(rs.getString(3));
                mascota.setEdad(rs.getInt(4));
                mascota.setRaza(rs.getString(5));
                mascota.setAnyoVacuna(rs.getInt(6));

                mascotas.add(mascota);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mascotas;
    }

    @Override
    public Mascota mostrarMascotaNecesitaVacuna(int id) {
        Mascota mascota = null;

        dbConnection = getDBConnection();
        try {
            st = dbConnection.createStatement();
            rs = st.executeQuery("SELECT * from mascota where id_mascota = " + '"' + id + '"' + " and anyo_vacuna < " + 2019);
            while (rs.next()) {
                mascota = new Mascota();
                mascota.setIdMascota(rs.getInt(1));
                mascota.setTipo(rs.getString(2));
                mascota.setNombre(rs.getString(3));
                mascota.setEdad(rs.getInt(4));
                mascota.setRaza(rs.getString(5));
                mascota.setAnyoVacuna(rs.getInt(6));


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mascota;
    }
}
