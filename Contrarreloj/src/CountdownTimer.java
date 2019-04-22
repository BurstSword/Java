import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CountdownTimer extends JLabel implements ActionListener {

    private static final long serialVersionUID = 1L;
    private long count;
    private long timerStart;
    private DateFormat dateFormat;

    javax.swing.Timer timer = new javax.swing.Timer(1000, this);

    public CountdownTimer(int minutes, int seconds) {
        // suppose to show as in 30 MIN 30 SEC.
        super(" ");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MINUTE, minutes);
        cal.set(Calendar.SECOND, seconds);
        count = cal.getTime().getTime();

        dateFormat = new SimpleDateFormat("mm:ss");

        timer.start();
        timerStart = System.currentTimeMillis();
        long elapsedTime = System.currentTimeMillis()-timerStart;

        System.out.println(elapsedTime);

    }

    public void actionPerformed(ActionEvent e) {
        setText(dateFormat.format(count));
        count -= 1000;

        if (dateFormat.format(count).equalsIgnoreCase("00:00")) {
            closeWindow();

        }
    }

    public void closeWindow() {

        System.exit(1);

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("Escape Room");
        frame.getContentPane().setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        JLabel label = new JLabel(" ----Tiempo Escape Room----");
        panel.add(label);

        JTextField jTextField = new JTextField();
        panel.add(jTextField);

        CountdownTimer c = new CountdownTimer(30, 00);

        frame.getContentPane().add(c);
        frame.setVisible(true);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}