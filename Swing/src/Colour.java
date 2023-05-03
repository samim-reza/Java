import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Colour extends JFrame{
    private Container c;
    private JButton bt;
    Colour(){
        init();
    }
    public void init(){
        setTitle("Colour");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=getContentPane();
        c.setBackground(Color.RED);
    }
    public static void main(String[] args) {
        Colour frame = new Colour();
    }
}