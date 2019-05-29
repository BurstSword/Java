package Ejercicio2BBDD.modelo;

import java.sql.Connection;
import java.util.ArrayList;

public interface MascotaDAO {
    String DRIVER_BD = "com.mysql.jdbc.Driver";
    String RUTA_BD = "jdbc:mysql://localhost/test";
    String USER_BD = "root";
    String PASS_BD = "";

    void insertarMascota(Mascota mascota);

    Connection getDBConnection();

    ArrayList<Mascota> mostrarMascotas();

    ArrayList<Mascota> mostrarMascotasOrdenadas();

    Mascota mostrarMascotaNecesitaVacuna(int id);
}
