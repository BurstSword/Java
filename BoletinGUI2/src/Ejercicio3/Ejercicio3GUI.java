package Ejercicio3;

import javax.swing.*;
import java.awt.*;

public class Ejercicio3GUI extends JFrame {
    private GridLayout gridLayout;
    private Checkbox check1, check2, check3, check4;

    public Ejercicio3GUI() throws HeadlessException {
        super("Ejercicio 3");
        this.gridLayout = new GridLayout(4,1);
        this.check1 = new Checkbox("Patatas");
        this.check2 = new Checkbox("Patatitas");
        this.check3 = new Checkbox("Patatas pequeñas");
        this.check4 = new Checkbox("Queso");
        getContentPane().setLayout(gridLayout);
        getContentPane().add(check1);
        getContentPane().add(check2);
        getContentPane().add(check3);
        getContentPane().add(check4);
    }
}
