import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Platformer {

    public static void main(String[] args) {
    
        MainFrame frame = new MainFrame();
        frame.setSize(700,700);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setTitle("Platformer");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}