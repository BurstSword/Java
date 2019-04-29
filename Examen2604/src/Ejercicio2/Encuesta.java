package Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Encuesta extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JPanel panel;
    private JLabel introNombre;
    private JTextField nombre;
    private JLabel aficiones;
    private JCheckBox aficion1, aficion2, aficion3;
    private JLabel colores;
    private JRadioButton color1, color2, color3;
    private JButton btnEnviar, cerrar;
    private ButtonGroup buttonGroup;
    private JCheckBox[] checkBoxes;

    public Encuesta() throws HeadlessException {
        super("Encuesta sobre aficiones");
        this.introNombre = new JLabel("Introduce tu nombre");
        this.nombre = new JTextField(15);
        this.aficiones = new JLabel("Aficiones");
        this.aficion1 = new JCheckBox("Futbol");
        this.aficion2 = new JCheckBox("Tenis");
        this.aficion3 = new JCheckBox("Nadar");
        this.colores = new JLabel("Colores");
        this.color1 = new JRadioButton("Rojo");
        this.color2 = new JRadioButton("Verde");
        this.color3 = new JRadioButton("Azul");
        this.btnEnviar = new JButton("Enviar");
        this.cerrar = new JButton("Cerrar");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(color1);
        buttonGroup.add(color2);
        buttonGroup.add(color3);
        checkBoxes = new JCheckBox[]{aficion1, aficion2, aficion3};
        btnEnviar.addActionListener(this);
        cerrar.addActionListener(this);
        setVisible(true);
        setSize(350, 300);
        posicionarComponentes();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void posicionarComponentes() {

        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(5, 5));

        panel = new JPanel();
        panel.setLayout(new GridLayout(11, 1));


        panel.add(introNombre);
        panel.add(nombre);
        panel.add(aficiones);
        panel.add(aficion1);
        panel.add(aficion2);
        panel.add(aficion3);
        panel.add(colores);
        panel.add(color1);
        panel.add(color2);
        panel.add(color3);
        panel.add(btnEnviar);
        panel.add(cerrar);

        contentPane.add(panel, BorderLayout.CENTER);

        this.setContentPane(contentPane);
        this.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnEnviar)) {
            Resultado resultado = new Resultado();
            String mensaje;
            mensaje = resultado.getMensajeBienvenida().getText();
            resultado.getMensajeBienvenida().setText(mensaje + this.nombre.getText());
            for (int i = 0; i < checkBoxes.length; i++) {
                if (checkBoxes[i].isSelected()) {
                    resultado.getjLabels()[i].setVisible(true);
                }
            }
            if (color1.isSelected()) {
                resultado.getContentPane().setBackground(Color.RED);
            } else if (color2.isSelected()) {
                resultado.getContentPane().setBackground(Color.green);
            } else if (color3.isSelected()) {
                resultado.getContentPane().setBackground(Color.BLUE);
            }

        } else if (e.getSource().equals(cerrar)) {
            System.exit(0);
        }
    }
}
