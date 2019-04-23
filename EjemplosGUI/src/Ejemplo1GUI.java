import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo1GUI extends JFrame implements ActionListener {
    private JTextField texto1;
    private JButton boton;
    private GridLayout gridLayout;
    private JCheckBox caja1, caja2, caja3;
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup bg;

    public Ejemplo1GUI() {
        this.texto1 = new JTextField(10);
        this.caja1 = new JCheckBox("Patata");
        this.caja2 = new JCheckBox("Patatita");
        this.caja3 = new JCheckBox("Koala");
        this.boton = new JButton("Enviar");
        radio1 = new JRadioButton("Patatas fritas");
        radio2 = new JRadioButton("Hamburguesa");
        radio3 = new JRadioButton("Queso");
        bg = new ButtonGroup();
        bg.add(radio1);
        bg.add(radio2);
        bg.add(radio3);
        this.gridLayout = new GridLayout(8, 1);
        getContentPane().setLayout(gridLayout);
        getContentPane().add(texto1);
        getContentPane().add(caja1);
        getContentPane().add(caja2);
        getContentPane().add(caja3);
        getContentPane().add(radio1);
        getContentPane().add(radio2);
        getContentPane().add(radio3);
        getContentPane().add(boton);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        boton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(boton)) {
            Ejemplo2_1 ejemplo2_1 = new Ejemplo2_1();
            ejemplo2_1.getTextField().setText(texto1.getText());
            this.texto1.setText(null);
            JCheckBox[] cajas = {caja1, caja2, caja3};
            for (int i = 0; i < cajas.length; i++) {
                if (cajas[i].isSelected()) {
                    ejemplo2_1.getEtiquetas()[i].setText(cajas[i].getText());
                }

            }

        }
    }
}
