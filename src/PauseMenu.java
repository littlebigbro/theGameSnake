import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PauseMenu extends JPanel implements ActionListener, KeyListener {

    public PauseMenu(){
       // setPreferredSize(new Dimension(1,1));
        setBackground(Color.YELLOW);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Exit();
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { }
}
