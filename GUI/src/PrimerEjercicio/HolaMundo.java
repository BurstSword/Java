package PrimerEjercicio;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;

public class HolaMundo extends JFrame {

    public HolaMundo() throws HeadlessException {
        super("Hola, mundo");
        setSize(300,100);
        setVisible(true);
        JLabel label = new JLabel("Hola, mundo", JLabel.CENTER);
        getContentPane().add(label);
        getContentPane().setBackground(black);
        label.setForeground(white);
        label.setFont(new Font("Verdana", Font.BOLD, 24));

    }
}
