package vista;

import modelo.Articulo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VistaTiendaMuebles extends JFrame {
    private int altura = 20;

    public VistaTiendaMuebles() throws HeadlessException {
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(250,500);
    }


    public void MostrarListadoMuebles(ArrayList<Articulo> articulos) {
        for (Articulo articulo : articulos) {
            generarJLabel(articulo.getNombre());
            altura += 20;
        }
    }

    private void generarJLabel(String titulo){
        JLabel jLabel = new JLabel(titulo);
        jLabel.setBounds(120,altura,180,60);
        getContentPane().add(jLabel);

    }


}
