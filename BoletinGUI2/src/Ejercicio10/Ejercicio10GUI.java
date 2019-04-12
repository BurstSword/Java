package Ejercicio10;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Ejercicio10GUI extends JFrame {

    private JTextField pantalla;
    private double resultado;
    private String operacion;
    private JPanel panelNumeros, panelOperaciones;
    private boolean nuevaOperacion = true;


    public Ejercicio10GUI() {
        super();
        setSize(250, 300);
        setTitle("Calculadora");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);


        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(new BorderLayout());

        pantalla = new JTextField("0", 20);
        pantalla.setBorder(new EmptyBorder(4, 4, 4, 4));
        pantalla.setFont(new Font("Verdana", Font.BOLD, 25));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setEditable(false);
        pantalla.setBackground(Color.LIGHT_GRAY);
        panel.add("North", pantalla);

        panelNumeros = new JPanel();
        panelNumeros.setLayout(new GridLayout(4, 3));
        panelNumeros.setBorder(new EmptyBorder(4, 4, 4, 4));

        for (int n = 9; n >= 0; n--) {
            nuevoBotonNumerico("" + n);
        }

        nuevoBotonNumerico(".");

        panel.add("Center", panelNumeros);

        panelOperaciones = new JPanel();
        panelOperaciones.setLayout(new GridLayout(6, 1));
        panelOperaciones.setBorder(new EmptyBorder(4, 4, 4, 4));

        nuevoBotonOperacion("+");
        nuevoBotonOperacion("-");
        nuevoBotonOperacion("*");
        nuevoBotonOperacion("/");
        nuevoBotonOperacion("=");
        nuevoBotonOperacion("C");

        panel.add("East", panelOperaciones);


        validate();
    }


    private void nuevoBotonNumerico(String numero) {
        JButton btn = new JButton();
        btn.setText(numero);
        btn.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent evt) {
                JButton btn = (JButton) evt.getSource();
                numeroPulsado(btn.getText());
            }
        });

        panelNumeros.add(btn);
    }


    private void nuevoBotonOperacion(String operacion) {
        JButton btn = new JButton(operacion);
        btn.setForeground(Color.BLACK);

        btn.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent evt) {
                JButton btn = (JButton) evt.getSource();
                operacionPulsado(btn.getText());
            }
        });

        panelOperaciones.add(btn);
    }


    private void numeroPulsado(String numero) {
        if (pantalla.getText().equals("0") || nuevaOperacion) {
            pantalla.setText(numero);
        } else {
            pantalla.setText(pantalla.getText() + numero);
        }
        nuevaOperacion = false;
    }


    private void operacionPulsado(String tecla) {
        if (tecla.equals("=")) {
            calcularResultado();
        } else if (tecla.equals("C")) {
            resultado = 0;
            pantalla.setText("");
            nuevaOperacion = true;
        } else {
            operacion = tecla;
            if ((resultado > 0) && !nuevaOperacion) {
                calcularResultado();
            } else {
                resultado = new Double(pantalla.getText());
            }
        }

        nuevaOperacion = true;
    }


    private void calcularResultado() {
        if (operacion.equals("+")) {
            resultado += new Double(pantalla.getText());
        } else if (operacion.equals("-")) {
            resultado -= new Double(pantalla.getText());
        } else if (operacion.equals("/")) {
            resultado /= new Double(pantalla.getText());
        } else if (operacion.equals("*")) {
            resultado *= new Double(pantalla.getText());
        }

        pantalla.setText("Result: " + resultado);
        operacion = "";
    }
}