import javax.swing.*;
import java.awt.*;

public class Ejemplo2_1 extends JFrame {
    private JTextField textField;
    private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4;
    private GridLayout gridLayout;
    private JLabel[] etiquetas;


    public Ejemplo2_1() {
        textField = new JTextField(10);
        etiqueta1 = new JLabel();
        etiqueta2 = new JLabel();
        etiqueta3 = new JLabel();
        etiqueta4 = new JLabel();

        etiquetas = new JLabel[]{etiqueta1, etiqueta2, etiqueta3, etiqueta4};
        gridLayout = new GridLayout(7, 1);
        getContentPane().setLayout(gridLayout);
        getContentPane().add(textField);
        getContentPane().add(etiqueta1);
        getContentPane().add(etiqueta2);
        getContentPane().add(etiqueta3);
        getContentPane().add(etiqueta4);
        textField.setEnabled(false);
        setSize(150, 200);
        setVisible(true);
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JLabel getEtiqueta1() {
        return etiqueta1;
    }

    public void setEtiqueta1(JLabel etiqueta1) {
        this.etiqueta1 = etiqueta1;
    }

    public JLabel getEtiqueta2() {
        return etiqueta2;
    }

    public void setEtiqueta2(JLabel etiqueta2) {
        this.etiqueta2 = etiqueta2;
    }

    public JLabel getEtiqueta3() {
        return etiqueta3;
    }

    public void setEtiqueta3(JLabel etiqueta3) {
        this.etiqueta3 = etiqueta3;
    }

    public JLabel getEtiqueta4() {
        return etiqueta4;
    }

    public void setEtiqueta4(JLabel etiqueta4) {
        this.etiqueta4 = etiqueta4;
    }

    public JLabel[] getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(JLabel[] etiquetas) {
        this.etiquetas = etiquetas;
    }
}
