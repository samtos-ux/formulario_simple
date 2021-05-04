import javax.swing.*;

public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel lblHola;
    private JPanel mainPanel;

    public Ventana(String titulo){
        super(titulo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setBounds(50, 50, 400,400);

    }

    public static void main(String[] args) {
        Ventana ven = new Ventana("Hola");
        ven.setVisible(true);
    }
}