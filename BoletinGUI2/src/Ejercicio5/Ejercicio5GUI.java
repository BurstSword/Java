package Ejercicio5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio5GUI extends JFrame implements ActionListener {
    private JTextField texto1, texto2;
    private JButton boton;
    private GridLayout gridLayout;

    public Ejercicio5GUI() throws HeadlessException {
        super("Ejercicio 5");
        this.texto1 = new JTextField(10);
        this.texto2 = new JTextField(10);
        this.boton = new JButton("Transcribir");
        this.gridLayout = new GridLayout(1, 3);
        this.texto2.setEditable(false);
        getContentPane().setLayout(gridLayout);
        getContentPane().add(texto1);
        getContentPane().add(boton);
        getContentPane().add(texto2);
        boton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(boton)) {
            this.texto2.setText(texto1.getText());
        }
    }
}
