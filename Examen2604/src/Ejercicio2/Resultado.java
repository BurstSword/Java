package Ejercicio2;

import javax.swing.*;
import java.awt.*;

public class Resultado extends JFrame {
    private JLabel mensajeBienvenida, mensajeAficion1, mensajeAficion2, mensajeAficion3;
    private GridLayout gridLayout;
    private JLabel[] jLabels;

    public Resultado() throws HeadlessException {
        super("Resultado de la encuesta");
        this.mensajeBienvenida = new JLabel("Bienvenido ");
        this.mensajeAficion1 = new JLabel("Has elegido el futbol");
        mensajeAficion1.setVisible(false);
        this.mensajeAficion2 = new JLabel("Has elegido el tenis");
        mensajeAficion2.setVisible(false);
        this.mensajeAficion3 = new JLabel("Has elegido la natacion");
        mensajeAficion3.setVisible(false);
        this.gridLayout = new GridLayout(4, 1);
        jLabels = new JLabel[]{mensajeAficion1, mensajeAficion2, mensajeAficion3};
        getContentPane().setLayout(gridLayout);
        getContentPane().add(mensajeBienvenida);
        getContentPane().add(mensajeAficion1);
        getContentPane().add(mensajeAficion2);
        getContentPane().add(mensajeAficion3);
        setVisible(true);
        setSize(250, 300);
    }

    public JLabel getMensajeBienvenida() {
        return mensajeBienvenida;
    }

    public void setMensajeBienvenida(JLabel mensajeBienvenida) {
        this.mensajeBienvenida = mensajeBienvenida;
    }

    public JLabel getMensajeAficion1() {
        return mensajeAficion1;
    }

    public void setMensajeAficion1(JLabel mensajeAficion1) {
        this.mensajeAficion1 = mensajeAficion1;
    }

    public JLabel getMensajeAficion2() {
        return mensajeAficion2;
    }

    public void setMensajeAficion2(JLabel mensajeAficion2) {
        this.mensajeAficion2 = mensajeAficion2;
    }

    public JLabel getMensajeAficion3() {
        return mensajeAficion3;
    }

    public void setMensajeAficion3(JLabel mensajeAficion3) {
        this.mensajeAficion3 = mensajeAficion3;
    }

    public JLabel[] getjLabels() {
        return jLabels;
    }

    public void setjLabels(JLabel[] jLabels) {
        this.jLabels = jLabels;
    }
}
