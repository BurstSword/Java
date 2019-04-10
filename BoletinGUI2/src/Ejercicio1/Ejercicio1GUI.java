package Ejercicio1;

import javax.swing.*;
import java.awt.*;

public class Ejercicio1GUI extends JFrame {
    private JLabel texto1, texto2;
    private FlowLayout fLayout;
    public Ejercicio1GUI() throws HeadlessException {
        super("Ejercicio1");
        this.texto1  = new JLabel("PROGRAMACION");
        this.texto2  = new JLabel("1º DAW");
        fLayout = new FlowLayout();

        getContentPane().setLayout(fLayout);
        getContentPane().add(texto1);
        getContentPane().add(texto2);
    }
}
