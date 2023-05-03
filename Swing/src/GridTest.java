import javax.swing.*;
import java.awt.*;

public class GridTest extends JFrame {
    private Container c;
    private GridLayout gl;
    private JPanel p1,p2,p3,p4,p5,p6,p7,p8;
    private JButton b1;
    GridTest(){
        init();
    }
    public void init(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(60,70,500,400);
        setTitle("Middle Grid");
        c=getContentPane();
        gl=new GridLayout(3,3,5,5);
        c.setLayout(gl);
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        p5=new JPanel();
        p5=new JPanel();
        p6=new JPanel();
        p7=new JPanel();
        p8=new JPanel();
        b1=new JButton("B");
        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
        c.add(b1);
        c.add(p5);
        c.add(p6);
        c.add(p7);
        c.add(p8);
    }
    public static void main(String[] args) {
        GridTest frame=new GridTest();
    }
}
