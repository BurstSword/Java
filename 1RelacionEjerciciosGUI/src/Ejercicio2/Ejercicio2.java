package Ejercicio2;

import javax.swing.*;
import java.awt.*;


public class Ejercicio2 extends JFrame {
    private JLabel etiqueta;
    private JButton boton1, boton2;

    public Ejercicio2() throws HeadlessException {
        super("Ejercicio 2");
        setSize(650, 250);
        this.boton1 = new JButton("Registro");
        this.boton2 = new JButton("Inicio de sesion");
        boton1.setBounds(550, 100, 150, 40);
        boton2.setBounds(750, 100, 100, 40);
        etiqueta = new JLabel("Puedes registrarte e iniciar sesion", JLabel.CENTER);
        this.add(boton1);
        this.add(boton2);
        this.add(etiqueta);
        setLocation(500, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
