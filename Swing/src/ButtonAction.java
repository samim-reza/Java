import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction extends JFrame {
    private Container c;
    private JTextField tf;
    private JButton bt;
    ButtonAction(){
        init();
    }
    public void init(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        tf=new JTextField();
        tf.setBounds(50,50,100,30);
        bt=new JButton("Button");
        bt.setBounds(50,110,100,20);
        c.add(tf);
        c.add(bt);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
            }
        });
    }
    public static void main(String[] args) {
        ButtonAction frame=new ButtonAction();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,50,500,400);
        frame.setTitle("Title");
    }
}
