import javax.swing.*;
import java.awt.*;

public class Button extends JFrame {
    private Container c;
    private JButton b1,b2;
    private Cursor cursor;
    private ImageIcon img;
    Button(){
        init();
    }
    public void init(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);
        cursor=new Cursor(Cursor.WAIT_CURSOR);
        img=new ImageIcon(getClass().getResource("download.jpeg"));
        b1=new JButton(img);
        b1.setCursor(cursor);
        b1.setBounds(30,90,100,35);
        c.add(b1);
        b2=new JButton("Delete");
        b2.setBounds(30,155,100,35);
        c.add(b2);
    }
    public static void main(String[] args) {
        Button frame=new Button();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(60,40,500,400);
        frame.setTitle("Title here");
    }
}
