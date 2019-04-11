package Ejercicio9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio9GUI extends JFrame implements ActionListener {
    private JButton convertir;
    private JLabel texto1, texto2;
    private JTextField ptas, euros;
    private JPanel panel;
    private GridLayout gridLayout;
    private GridLayout gridLayoutTextos;

    public Ejercicio9GUI() throws HeadlessException {
        super("Ejercicio 9");
        this.convertir = new JButton("Convertir");
        this.ptas = new JTextField(10);
        this.euros = new JTextField(10);
        this.texto1 = new JLabel("Pesetas", JLabel.CENTER);
        this.texto2 = new JLabel("Euros", JLabel.CENTER);
        this.panel = new JPanel();
        this.gridLayout = new GridLayout(2, 1);
        this.gridLayoutTextos = new GridLayout(2, 2);
        panel.setLayout(gridLayoutTextos);
        panel.add(texto1);
        panel.add(texto2);
        panel.add(ptas);
        panel.add(euros);
        getContentPane().setLayout(gridLayout);
        getContentPane().add(panel);
        getContentPane().add(convertir);

        convertir.addActionListener(this);
    }


    public String convertirAEuros(String ptasStr) {
        final double europtas = 166.386;
        double euros;
        double ptas;
        String eurosStr;
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
