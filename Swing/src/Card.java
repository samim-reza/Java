import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Card extends JFrame implements ActionListener {
    private Container c;
    private JButton b1,b2,b3;
    private CardLayout cl;
    Card(){
        init();
    }
    public void init(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,100,600,600);
        this.setTitle("Title Here");

        c=this.getContentPane();
        cl=new CardLayout(10,10);
        c.setLayout(cl);
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        c.add(b1,"First");
        c.add(b2,"Second");
        c.add(b3,"Third");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        cl.next(c);
//        cl.first(c);
//        cl.last(c);
//        cl.previous(c);
        cl.show(c,"Third");
    }
    public static void main(String[] args) {
        Card frame=new Card();
        frame.setVisible(true);

    }

}
