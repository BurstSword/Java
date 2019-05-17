package Vista;

import Modelo.Libro;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VistaLibreria extends JFrame {
    private int altura = 20;

    public VistaLibreria() throws HeadlessException {
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(250,500);
    }


    public void MostrarListadoLibros(ArrayList<Libro> libros) {
        for (Libro libro : libros) {
            generarJLabel(libro.getTitulo());
            altura += 20;
        }
    }

    private void generarJLabel(String titulo){
        JLabel jLabel = new JLabel(titulo);
        jLabel.setBounds(120,altura,180,60);
        getContentPane().add(jLabel);

    }


}
