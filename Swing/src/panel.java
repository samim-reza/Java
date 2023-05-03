import javax.swing.*;
import java.awt.*;

public class panel extends JFrame {
    private Container c;
    private JPanel j1,j2;
    private JButton b1,b2;
    panel(){
        init();
    }
    public void init(){
        c=getContentPane();
        c.setLayout(null);
        setBounds(100,100,670,500);
        setTitle("Title Here");
        j1=new JPanel();
        j1.setBounds(20,100,300,200);
        j1.setBackground(new Color(106, 241, 21));
        c.add(j1);
        j2=new JPanel();
        j2.setBounds(330,100,300,200);
        j2.setBackground(new Color(21, 241, 208));
        c.add(j2);
        b1=new JButton("1");
        j1.add(b1);
        b2=new JButton("2");
        j2.add(b2);
    }
    public static void main(String[] args) {
        panel frame=new panel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
