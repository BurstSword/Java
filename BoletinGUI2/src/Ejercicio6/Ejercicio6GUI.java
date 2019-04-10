package Ejercicio6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class Ejercicio6GUI extends JFrame implements ActionListener {
    private JLabel texto1, texto2;
    private JButton cambiarFondo, cambiarFuente, cambiarEstilo, cambiarColorLetra, cambiarTamano,reiniciar;
    private JPanel textos, botones;
    private GridLayout gridLayout;
    private FlowLayout flowLayout;
    public Ejercicio6GUI() throws HeadlessException {
        super("Ejercicio 6");
        this.texto1 = new JLabel("Patata");
        this.texto2 = new JLabel("Palisa");
        this.cambiarFondo = new JButton("Color fondo");
        this.cambiarFuente = new JButton("Cambiar fuente");
        this.cambiarEstilo = new JButton("Cambiar estilo");
        this.cambiarColorLetra = new JButton("Cambiar color letra");
        this.cambiarTamano = new JButton("Cambiar tamano letra");
        this.reiniciar = new JButton("Reiniciar");
        this.flowLayout = new FlowLayout();
        this.textos = new JPanel();
        this.botones = new JPanel();
        this.gridLayout = new GridLayout(2, 1);

        //Paneles
        textos.setLayout(flowLayout);
        textos.add(texto1);
        textos.add(texto2);

        botones.setLayout(flowLayout);
        botones.add(cambiarFondo);
        botones.add(cambiarFuente);
        botones.add(cambiarColorLetra);
        botones.add(cambiarTamano);
        botones.add(cambiarEstilo);
        botones.add(reiniciar);

        getContentPane().setLayout(gridLayout);
        getContentPane().add(textos);
        getContentPane().add(botones);

        cambiarColorLetra.addActionListener(this);
        cambiarFondo.addActionListener(this);
        cambiarFuente.addActionListener(this);
        cambiarTamano.addActionListener(this);
        cambiarEstilo.addActionListener(this);
        reiniciar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(cambiarColorLetra)){
            texto1.setForeground(Color.red);
            texto2.setForeground(Color.blue);
        }else if(e.getSource().equals(cambiarFuente)){
            texto1.setFont(new Font("Courier New",texto1.getFont().getStyle(),texto1.getFont().getSize()));
            texto2.setFont(new Font("Verdana",texto2.getFont().getStyle(),texto2.getFont().getSize()));
        }else if (e.getSource().equals(cambiarFondo)){
            textos.setBackground(Color.green);
        }else if (e.getSource().equals(cambiarEstilo)){
            texto1.setFont(new Font(texto1.getFont().getName(),Font.BOLD,texto1.getFont().getSize()));
            texto2.setFont(new Font(texto2.getFont().getName(),Font.ITALIC,texto2.getFont().getSize()));
        }else if (e.getSource().equals(cambiarTamano)){
            texto1.setFont(new Font(texto1.getFont().getName(),texto1.getFont().getStyle(),16));
            texto2.setFont(new Font(texto2.getFont().getName(),texto2.getFont().getStyle(),19));
        }else if(e.getSource().equals(reiniciar)){
            texto1.setFont(new Font("Arial",Font.PLAIN,12));
            texto2.setFont(new Font("Arial",Font.PLAIN,12));
            textos.setBackground(Color.white);
            texto1.setForeground(Color.black);
            texto2.setForeground(Color.black);
        }
    }
}
