package Ejercicio8;



import Ejercicio1.Ejercicio1GUI;
import Ejercicio2.Ejercicio2GUI;
import Ejercicio3.Ejercicio3GUI;
import Ejercicio4.Ejercicio4GUI;
import Ejercicio5.Ejercicio5GUI;
import Ejercicio6.Ejercicio6GUI;
import Ejercicio7.Ejercicio7GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio8GUI extends JFrame implements ActionListener {
    private JButton ejercicio1, ejercicio2, ejercicio3, ejercicio4, ejercicio5, ejercicio6, ejercicio7;
    private JLabel inicio, texto;
    private GridLayout gridLayout;
    private JPanel panelBotones, panelInteraccion;

    public Ejercicio8GUI() throws HeadlessException {
        super("Ejercicio 8");
        this.ejercicio1 = new JButton("Ejercicio 1");
        this.ejercicio2 = new JButton("Ejercicio 2");
        this.ejercicio3 = new JButton("Ejercicio 3");
        this.ejercicio4 = new JButton("Ejercicio 4");
        this.ejercicio5 = new JButton("Ejercicio 5");
        this.ejercicio6 = new JButton("Ejercicio 6");
        this.ejercicio7 = new JButton("Ejercicio 7");
        this.inicio = new JLabel("Ejercicio 8");
        this.texto = new JLabel("Pulse cualquier boton para acceder a ese ejercicio");
        this.gridLayout = new GridLayout(2, 1);
        this.panelBotones = new JPanel();
        this.panelInteraccion = new JPanel();

        panelInteraccion.setLayout(gridLayout);
        panelInteraccion.add(inicio);
        panelInteraccion.add(texto);

        panelBotones.add(ejercicio1);
        panelBotones.add(ejercicio2);
        panelBotones.add(ejercicio3);
        panelBotones.add(ejercicio4);
        panelBotones.add(ejercicio5);
        panelBotones.add(ejercicio6);
        panelBotones.add(ejercicio7);

        getContentPane().setLayout(gridLayout);
        getContentPane().add(panelInteraccion);
        getContentPane().add(panelBotones);

        ejercicio1.addActionListener(this);
        ejercicio2.addActionListener(this);
        ejercicio3.addActionListener(this);
        ejercicio4.addActionListener(this);
        ejercicio5.addActionListener(this);
        ejercicio6.addActionListener(this);
        ejercicio7.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(ejercicio1)){
            Ejercicio1GUI ejercicio1GUI = new Ejercicio1GUI();
            ejercicio1GUI.setVisible(true);
            ejercicio1GUI.setSize(500,300);
        }else if(e.getSource().equals(ejercicio2)){
            Ejercicio2GUI ejercicio2GUI = new Ejercicio2GUI();
            ejercicio2GUI.setVisible(true);
            ejercicio2GUI.setSize(300,100);
        }else if(e.getSource().equals(ejercicio3)){
            Ejercicio3GUI ejercicio3GUI = new Ejercicio3GUI();
            ejercicio3GUI.setVisible(true);
            ejercicio3GUI.setSize(300,200);
        }else if (e.getSource().equals(ejercicio4)){
            Ejercicio4GUI ejercicio4GUI = new Ejercicio4GUI();
            ejercicio4GUI.setVisible(true);
            ejercicio4GUI.setSize(500,300);
        }else if (e.getSource().equals(ejercicio5)){
            Ejercicio5GUI ejercicio5GUI = new Ejercicio5GUI();
            ejercicio5GUI.setVisible(true);
            ejercicio5GUI.setSize(400,100);
        }else if (e.getSource().equals(ejercicio6)){
            Ejercicio6GUI ejercicio6GUI = new Ejercicio6GUI();
            ejercicio6GUI.setVisible(true);
            ejercicio6GUI.setSize(500,170);
        }else if (e.getSource().equals(ejercicio7)){
            Ejercicio7GUI ejercicio7GUI = new Ejercicio7GUI();
            ejercicio7GUI.setVisible(true);
            ejercicio7GUI.setSize(150,100);
        }
    }
}
