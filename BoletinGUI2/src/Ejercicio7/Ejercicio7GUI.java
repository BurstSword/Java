package Ejercicio7;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;


public class Ejercicio7GUI extends JFrame {
    private JButton boton;
    private JTextField texto;
    private FlowLayout flowLayout;
    private Document document;

    public Ejercicio7GUI() throws HeadlessException {
        super("Ejercicio 7");
        this.boton = new JButton("Hola");
        this.texto = new JTextField(10);
        this.flowLayout = new FlowLayout();
        this.document = texto.getDocument();
        this.document.addDocumentListener(new JButtonListener(boton));
        this.boton.setEnabled(false);
        getContentPane().setLayout(flowLayout);
        getContentPane().add(texto);
        getContentPane().add(boton);
    }


}
