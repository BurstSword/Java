package controlador;


import modelo.TiendaMueblesDAOImplementacion;
import vista.VistaTiendaMuebles;

import java.sql.SQLException;

public class ControladorMueble {
    public void generarVentana(){
        TiendaMueblesDAOImplementacion tiendaMueblesDAOImplementacion = new TiendaMueblesDAOImplementacion();
        try {
            VistaTiendaMuebles vistaTiendaMuebles = new VistaTiendaMuebles();
            vistaTiendaMuebles.MostrarListadoMuebles(tiendaMueblesDAOImplementacion.buscarTodosLosArticulos());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
