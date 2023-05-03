import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {
    private Container c;
    private JButton b1,b2,b3,b4,b5;
    private BorderLayout bl;
    Layout(){
    init();
    }
    public void init(){
    setBounds(50,100,600,600);
    setTitle("Title Here");
    c=getContentPane();
    bl=new BorderLayout(10,5);
    c.setLayout(bl);
    b1=new JButton("1");
    b2=new JButton("2");
    b3=new JButton("3");
    b4=new JButton("4");
    b5=new JButton("5");
    c.add(b1,BorderLayout.NORTH);
    c.add(b2,BorderLayout.WEST);
    c.add(b3,BorderLayout.CENTER);
    c.add(b4,BorderLayout.EAST);
    c.add(b5,BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        Layout frame=new Layout();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
