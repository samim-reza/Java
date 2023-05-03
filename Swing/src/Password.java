import javax.swing.*;
import java.awt.*;

public class Password extends JFrame {
    private Container c;
    private JPasswordField pf;
    private Font f;
    Password(){
        init();
    }
    public void init(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        f=new Font("Arial",Font.BOLD,18);
        pf=new JPasswordField();
        pf.setFont(f);
        pf.setEchoChar('*');
        pf.setBounds(50,50,150,50);
        c.add(pf);
    }
    public static void main(String[] args) {
        Password frame=new Password();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(60,40,500,400);
        frame.setTitle("Title here");
    }
}
