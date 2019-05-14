import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JLabel textoIntroductorio, NombreEti, ContrasenaEti;
    private JTextField NombreIntro, ContrasenaIntro;
    private JButton LoginButton;
    private JPanel datos;
    private GridLayout gridLayout;
    private GridLayout panelDatos;

    public LoginView() throws HeadlessException implements ActionListener{
        this.textoIntroductorio = new JLabel("Introduzca su nombre de usuario y su contraseña");
        NombreEti = new JLabel("Nombre de Usuario: ");
        ContrasenaEti = new JLabel("Contraseña: ");
        NombreIntro = new JTextField(25);
        ContrasenaIntro = new JTextField(25);
        this.LoginButton = new JButton("Login");
        this.datos = new JPanel();
        this.gridLayout = new GridLayout(3,1);
        this.panelDatos = new GridLayout(2,2);
        datos.setLayout(panelDatos);
        datos.add(NombreEti);
        datos.add(NombreIntro);
        datos.add(ContrasenaEti);
        datos.add(ContrasenaIntro);
        getContentPane().setLayout(gridLayout);
        getContentPane().add(textoIntroductorio);
        getContentPane().add(datos);
        getContentPane().add(LoginButton);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        LoginButton.addActionListener(this);
    }
}
