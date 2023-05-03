import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action extends JFrame {
    private Container c;
    private JTextField tf1,tf2;
    Action(){
        init();
    }
    public void init(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        tf1=new JTextField();
        tf1.setBounds(50,40,150,40);
        c.add(tf1);

        tf2=new JTextField();
        tf2.setBounds(50,100,150,40);
        c.add(tf2);

        Hand hand=new Hand();
        tf1.addActionListener(hand);
        tf2.addActionListener(hand);
//        tf1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String s=tf1.getText();
//                if(s.isEmpty()){
//                    JOptionPane.showMessageDialog(null,"error first");
//                }
//                else {
//                    JOptionPane.showMessageDialog(null, "error:" + s);
//                }
//                }
//        });
    }
    class Hand implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==tf1){

                }
                else{

                }
                String s=tf1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"error first");
                }
                else {
                    JOptionPane.showMessageDialog(null, "error:" + s);
                }
            }
    }
    public static void main(String[] args) {
        Action frame=new Action();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(80,30,500,400);
        frame.setTitle("Title Here");
    }
}
