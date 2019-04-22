import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CountdownTimer extends JLabel implements ActionListener {

    private long count;
    private DateFormat dateFormat;
    private Timer timer;
    private static JButton botonIniciar, botonParar;
    private static JLabel contador;
    private static JFrame marco;
    private boolean iniciado=false;


    /**
     * Método encargado de realizar la cuenta atrás con unos parámetros
     *
     * @param minutes Los minutos del contador
     * @param seconds Los segundos del contador
     */
    public CountdownTimer(int minutes, int seconds) {

        super(" ");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MINUTE, minutes);
        cal.set(Calendar.SECOND, seconds);
        count = cal.getTime().getTime();

        dateFormat = new SimpleDateFormat("mm:ss");

        timer = new Timer(1000, this);
        long timerStart = System.currentTimeMillis();
        long elapsedTime = System.currentTimeMillis() - timerStart;

        System.out.println(elapsedTime);

    }

    /**
     * Método que se encarga de ejecutar la ventana con el contador hacia atrás
     */
    public CountdownTimer() {
        //Inicializamos el marco y le damos sus características
        marco = new JFrame();
        marco.setTitle("Escape Room");
        marco.setSize(300, 190);

        //Inicializamos la etiqueta del marco
        JLabel etiqueta = new JLabel(" ----Tiempo Escape Room----");
        etiqueta.setBounds(70, 10, 160, 12);

        //Inicializamos los botones de comenzar y parar el contador
        botonIniciar = new JButton("Iniciar");
        botonIniciar.setBounds(95, 100, 100, 34);

        botonParar = new JButton("Parar");
        botonParar.setBounds(95, 100, 100, 34);
        botonParar.setVisible(false);

        //Utilizamos un objeto de tipo JLabel para mostrar 30:00 al principio del programa
        contador = new JLabel("30:00");
        contador.setFont(new Font("Verdana", Font.PLAIN, 32));
        contador.setBounds(100, 10, 100, 94);

        //Llamamos al método que nos crea el contador y le damos sus valores y posición
        CountdownTimer c = new CountdownTimer(30, 0);
        c.setFont(new Font("Verdana", Font.PLAIN, 32));
        c.setBounds(100, 10, 100, 94);

        //Añadimos todos los componente al frame
        marco.setLayout(null);
        marco.getContentPane().add(etiqueta);
        marco.getContentPane().add(botonIniciar);
        marco.getContentPane().add(botonParar);
        marco.getContentPane().add(contador);
        marco.getContentPane().add(c);
        marco.setVisible(true);
        marco.getContentPane().setBackground(Color.white);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setResizable(false);
        marco.setLocation(500, 250);

        botonIniciar.addActionListener(c);
        botonParar.addActionListener(c);
    }

    public void actionPerformed(ActionEvent e) {
        setText(dateFormat.format(count));
        count -= 1000;

        if (dateFormat.format(count).equalsIgnoreCase("00:00")) {
            timer.stop();

        } else if (e.getSource().equals(botonIniciar)) {
            contador.setVisible(false);
            timer.start();
            botonIniciar.setVisible(false);
            botonParar.setVisible(true);
            this.iniciado=true;

        } else if (e.getSource().equals(botonParar) && this.iniciado) {
            this.timer.stop();
            botonParar.setVisible(false);
            botonIniciar.setVisible(true);
        }
    }

}