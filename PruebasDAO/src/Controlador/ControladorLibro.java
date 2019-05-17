package Controlador;


import Modelo.LibreriaDAOImplementacion;
import Vista.VistaLibreria;

import java.sql.SQLException;

public class ControladorLibro {
    public void generarVentana(){
        LibreriaDAOImplementacion libreriaDAOImplementacion = new LibreriaDAOImplementacion();
        try {
            VistaLibreria vistaLibreria = new VistaLibreria();
            vistaLibreria.MostrarListadoLibros(libreriaDAOImplementacion.buscarTodosLosLibros());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
