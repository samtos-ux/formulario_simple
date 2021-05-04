import javax.swing.*;

public class Ventana2 extends JFrame{
    private JPanel mainPanel;
    private JLabel lblLogin;
    private JTextField txtUsuario;
    private JLabel lblUsuario;
    private JLabel lblContrasena;
    private JPasswordField pwdContra;
    private JButton btnAcceder;

    public Ventana2(String title){
        super(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        setBounds(80, 80, 400, 400);
    }

    public static void main(String[] args) {
        Ventana2 ven = new Ventana2("Mi Ventana");
        ven.setVisible(true);
    }
}
