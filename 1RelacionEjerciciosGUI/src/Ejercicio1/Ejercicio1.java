package Ejercicio1;

import javax.swing.*;

import static java.awt.Color.*;

public class Ejercicio1 extends JFrame {


    public Ejercicio1(){
        setSize(300,200);
        setVisible(true);
        setLocation(500,250);
        getContentPane().setBackground(black);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


    public Ejercicio1(int width, int height){
        setSize(width,height);
        setVisible(true);
        setLocation(500,250);
        getContentPane().setBackground(black);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
