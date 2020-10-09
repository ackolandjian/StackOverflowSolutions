import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyChecker extends KeyAdapter implements KeyListener{
    
    GamePanel panel;
    
    public KeyChecker(GamePanel panel) {
        this.panel = panel;
    }
    
    public void keyPressed(KeyEvent e) {
    	System.out.println("pressed");
        panel.KeyPressed(e);
    }
    
    public void keyReleased(KeyEvent e) {
        panel.KeyReleased (e);
    }
}