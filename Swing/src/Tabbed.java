import javax.swing.*;
import java.awt.*;

public class Tabbed extends JFrame {
    private Container c;
    private JTabbedPane tp;
    private JPanel p1,p2,p3;
    Tabbed(){
        init();
    }
    public void init(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50,50,500,400);
        c=getContentPane();
        c.setLayout(null);
        //c.setBackground(new Color(203, 101, 45, 255));
        tp=new JTabbedPane(JTabbedPane.BOTTOM);
        tp.setBounds(50,50,300,300);
        c.add(tp);
        p1=new JPanel();
        p1.setBackground(new Color(70, 227, 53));
        p2=new JPanel();
        p2.setBackground(new Color(91, 39, 196));
        p3=new JPanel();
        p3.setBackground(new Color(245, 3, 3));
        tp.addTab("Home",p1);
        //tp.addTab("Name","icon",p1,"Tool Tip");
        tp.addTab("Help",p2);
        tp.addTab("Edit",p3);
    }
    public static void main(String[] args) {
        Tabbed frame=new Tabbed();
    }
}
