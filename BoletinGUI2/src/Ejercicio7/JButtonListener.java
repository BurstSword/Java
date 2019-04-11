package Ejercicio7;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class JButtonListener implements DocumentListener {
    private JButton boton;

    public JButtonListener(JButton boton) {
        this.boton = boton;
    }

    public void changedUpdate(DocumentEvent e) {
        disableIfEmpty(e);
    }

    public void insertUpdate(DocumentEvent e) {
        disableIfEmpty(e);
    }

    public void removeUpdate(DocumentEvent e) {
        disableIfEmpty(e);
    }

    public void disableIfEmpty(DocumentEvent e) {
        boton.setEnabled(e.getDocument().getLength() > 0);
    }
}
