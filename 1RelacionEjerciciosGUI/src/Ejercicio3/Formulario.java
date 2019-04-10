package Ejercicio3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener {

    private JButton boton1, boton2;

    public Formulario() {
        this.setLayout(null);
        this.boton1 = new JButton("Finalizar");
        this.boton1.setBounds(10, 80, 100, 30);
        this.boton2 = new JButton("Rellenar fondo");
        this.boton2.setBounds(10, 130, 130, 30);
        this.add(boton1);
        this.add(boton2);
        this.boton1.addActionListener(this);
        this.boton2.addActionListener(this);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(boton1)) {
            System.exit(0);
        }

        if (e.getSource().equals(boton2)) {
            this.getContentPane().setBackground(Color.RED);
        }
    }
}
