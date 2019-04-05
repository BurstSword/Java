package Ejercicio2;

import javax.swing.*;
import java.awt.*;


public class Ejercicio2 extends JFrame {


    public Ejercicio2() throws HeadlessException {
        super("Ejercicio 2");
        setSize(650, 250);
        JButton a = new JButton("Registro");
        JButton b = new JButton("Inicio de sesion");
        b.setBounds(550,100,150, 40);
        a.setBounds(750,100,100, 40);
        getContentPane().add(b);
        getContentPane().add(a);
        getContentPane().add(new JLabel("Puedes registrarte e iniciar sesion", JLabel.CENTER));
        setLocation(500, 250);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
