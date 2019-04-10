package Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2GUI extends JFrame implements ActionListener {
    private JButton boton;
    private FlowLayout fLayout;

    public Ejercicio2GUI() throws HeadlessException {
        super("Ejercicio 2");
        this.boton = new JButton("Cerrar");
        fLayout=new FlowLayout();
        getContentPane().setLayout(fLayout);
        getContentPane().add(boton);
        boton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(boton)){
            System.exit(0);
        }
    }
}
