import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class KeyListener extends JFrame {
    private Container c;
    private JTextArea ta;
    private JTextField tf1;
    KeyListener(){
        init();
    }
    public void init(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        ta=new JTextArea();
        ta.setBounds(50,50,400,200);
        c.add(ta);
        tf1= new JTextField();
        tf1.setBounds(50,10,200,50);
        tf1.setForeground(Color.blue);
        tf1.setBackground(Color.cyan);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);
//        tf1.addKeyListener(new java.awt.event.KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                ta.append("keyTyped "+e.getKeyChar()+"\n");
//            }
//            @Override
//            public void keyPressed(KeyEvent e) {
//                ta.append("keyPressed "+e.getKeyChar()+"\n");
//            }
//            @Override
//            public void keyReleased(KeyEvent e) {
//                ta.append("keyReleased "+e.getKeyChar()+"\n");
//            }
//        });
//
        c.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                ta.setText("X:"+e.getX()+" Y: "+e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                ta.setText("X:"+e.getX()+" Y: "+e.getY());
            }
        });
    }
    public static void main(String[] args) {
        KeyListener frame=new KeyListener();
        frame.setVisible(true);
        frame.setBounds(100,50,500,400);
        frame.setTitle("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
