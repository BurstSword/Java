import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Dado extends JFrame {

    public static void main(String[] args) {

        new Dado().setVisible(true);
    }

    /*public static void lanzarDado() {

        new Dado().setVisible(true);
    }*/

    private class Dice {
        private String val;

        public Dice() {
            lanzar();
        }

        public void lanzar() {
            Random rand = new Random();
            int numDado = rand.nextInt(6) + 1;

            if(numDado==1){
                val="H";
            }else if(numDado==2){
                val="H" +
                        "\no";
            }else if(numDado==3){
                val="· · ·" ;
            }else if(numDado==4){
                val="· ·" +
                        "\n· ·";
            }else if(numDado==5){
                val="· ·" +
                        "\n· " +
                        "· ·";
            }else if(numDado==6){
                val="· ·" +
                        "\n· ·" +
                        "\n· ·";
            }
        }

        public String getVal() {
            return val + "";
        }
    }


    private boolean hover = false;


    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();

    public Dado() {

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
        graphics2D.drawString(dice1.getVal(), 150, 82);
        graphics2D.drawString(dice2.getVal(), 205, 82);
    }


    public void lanzar() {
        dice1.lanzar();
        dice2.lanzar();
    }
}