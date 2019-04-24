import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo1GUI extends JFrame implements ActionListener {
    private JTextField texto1;
    private JButton boton;
    private JCheckBox caja1, caja2, caja3;
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup bg;
    private JCheckBox[] cajas;
    private JRadioButton[] botones;
    public Ejemplo1GUI() {
        this.texto1 = new JTextField(10);
        this.caja1 = new JCheckBox("Patata");
        this.caja2 = new JCheckBox("Patatita");
        this.caja3 = new JCheckBox("Koala");
        this.boton = new JButton("Enviar");
        this.radio1 = new JRadioButton("Patatas fritas");
        this.radio2 = new JRadioButton("Hamburguesa");
        this.radio3 = new JRadioButton("Queso");
        this.bg = new ButtonGroup();
        this.cajas = new JCheckBox[]{caja1, caja2, caja3};
        this.botones = new JRadioButton[] {radio1, radio2, radio3};

        this.bg.add(radio1);
        this.bg.add(radio2);
        this.bg.add(radio3);

        GridLayout gridLayout = new GridLayout(8, 1);
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

            for (int i = 0; i < cajas.length; i++) {
                if (cajas[i].isSelected()) {
                    ejemplo2_1.getEtiquetas()[i].setText(cajas[i].getText());
                }

            }
            for (JRadioButton botone : botones) {
                if (botone.isSelected()) {
                    ejemplo2_1.getEtiqueta4().setText(botone.getText());
                }
            }

        }
    }
}
