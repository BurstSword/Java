package Gestoras;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * Clase encargada de generar un dado con interfaz gráfica para elegir los jugadores
 */
public class GestoraDado extends JFrame {

    public static void lanzarDado() {

        new Gestoras.GestoraDado().setVisible(true);
    }

    private class Dice {
        private int valor;

        public Dice() {
            lanzar();
        }

        public void lanzar() {
            Random random = new Random();
            valor = random.nextInt(6) + 1;

        }

        public String getValor() {
            return valor + "";
        }
    }


    private boolean hover = false;


    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();

    public GestoraDado() {

        super("Dados");
        setSize(300, 130);


        MouseAdapter listen = new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {


                if (!hover) {

                    if (e.getX() >= 50 && e.getX() <= 125 && e.getY() >= 50 && e.getY() <= 95) {

                        hover = true;
                        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                        repaint();
                    }
                } else {

                    if (!(e.getX() >= 50 && e.getX() <= 125 && e.getY() >= 50 && e.getY() <= 95)) {

                        hover = false;
                        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

                        repaint();
                    }
                }
            }


            public void mouseClicked(MouseEvent event) {
                if (hover) {
                    lanzar();
                    repaint();
                }
            }
        };

        addMouseMotionListener(listen);
        addMouseListener(listen);
    }

    public void paint(Graphics g2d) {

        Graphics2D graphics2D = (Graphics2D) g2d;


        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        graphics2D.setFont(new Font("Verdana", Font.PLAIN, 24));


        graphics2D.setColor(Color.white);
        graphics2D.fillRect(0, 0, getWidth(), getHeight());


        graphics2D.setColor(hover ? Color.gray : Color.black);
        graphics2D.fillRect(45, 50, 85, 45);


        graphics2D.setColor(Color.black);
        graphics2D.drawRect(135, 50, 45, 45);
        graphics2D.drawRect(190, 50, 45, 45);


        graphics2D.setColor(Color.white);
        graphics2D.drawString("Lanzar", 48, 80);


        graphics2D.setColor(Color.red);
        graphics2D.drawString(dice1.getValor(), 150, 82);
        graphics2D.drawString(dice2.getValor(), 205, 82);
    }


    public void lanzar() {
        dice1.lanzar();
        dice2.lanzar();
    }
}