package PrimerEjercicio;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;

public class HolaMundo extends JFrame {

    public HolaMundo() throws HeadlessException {
        super("Hola, mundo");
        JLabel label = new JLabel("Hola, mundo", JLabel.CENTER);
        getContentPane().add(label);
        getContentPane().setBackground(black);
        setSize(200,100);
        setVisible(true);
        label.setForeground(white);
        label.setFont(new Font("Verdana", Font.BOLD, 24));
    }
}
