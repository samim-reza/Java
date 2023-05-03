import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private ImageIcon icon;
    private Container c;
    Frame(){
       init();
    }
    public void init(){
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
        icon =new ImageIcon(getClass().getResource("download1.png"));
        this.setIconImage(icon.getImage());
    }
    public static void main(String[] args) {
        Frame frame=new Frame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("Title here");
    }
}
