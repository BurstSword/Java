package Ejercicio9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio9GUI extends JFrame implements ActionListener {
    private JButton convertir;
    private JTextField ptas, euros;
    private JPanel panel;
    private GridLayout gridLayout;

    public Ejercicio9GUI() throws HeadlessException {
        super("Ejercicio 9");
        this.convertir = new JButton("Convertir");
        this.ptas = new JTextField(10);
        this.euros = new JTextField(10);
        this.panel = new JPanel();
        panel.add(ptas);
        panel.add(euros);
        this.gridLayout = new GridLayout(2, 2);

        getContentPane().setLayout(gridLayout);
        getContentPane().add(panel);
        getContentPane().add(convertir);

        convertir.addActionListener(this);
    }


    public String convertirAEuros(String ptasStr) {
        double euros;
        double ptas;
        String eurosStr;
        double europtas = 166.386;
        ptas = Double.parseDouble(ptasStr);

        euros = ptas / europtas;

        eurosStr = Double.toString(euros);


        return eurosStr;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(convertir) && !ptas.getText().isEmpty()) {
            euros.setText(convertirAEuros(ptas.getText()));
        }
    }
}
