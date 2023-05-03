import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Focus extends JFrame {
    private Container c;
    private JButton b1,b2;
    private JTextArea ta;
    Focus(){
        init();
    }
    public void init(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);
        b1=new JButton("Click");
        b1.setBounds(30,90,100,35);
        c.add(b1);
        b2=new JButton("Delete");
        b2.setBounds(30,155,100,35);
        c.add(b2);
        ta= new JTextArea();
        ta.setBounds(140,100,200,200);
        c.add(ta);
        b1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        Focus frame=new Focus();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(60,40,500,400);
        frame.setTitle("Title here");
    }
}
