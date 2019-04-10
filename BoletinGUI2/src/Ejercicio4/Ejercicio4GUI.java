package Ejercicio4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio4GUI extends JFrame implements ActionListener {
    private JTextField nombre, apellido1, apellido2;
    private JButton boton;
    private JLabel etiqueta;
    private GridLayout gridLayout;

    public Ejercicio4GUI() throws HeadlessException {
        super("Ejercicio 4");
        this.nombre = new JTextField(12);
        this.apellido1 = new JTextField(12);
        this.apellido2 = new JTextField(12);
        this.gridLayout = new GridLayout(5, 1);
        this.boton = new JButton("Finalizar");
        this.etiqueta = new JLabel();
        getContentPane().setLayout(gridLayout);
        getContentPane().add(nombre);
        getContentPane().add(apellido1);
        getContentPane().add(apellido2);
        getContentPane().add(boton);
        getContentPane().add(etiqueta);

        boton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(boton)) {
            this.etiqueta.setText(nombre.getText() + " " + apellido1.getText() + " " + apellido2.getText());

        }
    }
}
