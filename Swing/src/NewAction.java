import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewAction extends JFrame implements ActionListener {
    private Container c;
    private JButton red,green;
    NewAction(){
        init();
    }
    public void init(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,400,400);
        setTitle("Title Here");
        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        red=new JButton("Red");
        red.setBounds(50,50,100,50);
        c.add(red);
        green=new JButton("Green");
        green.setBounds(50,110,100,50);
        c.add(green);
        red.addActionListener(this);
        green.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==red){
            c.setBackground(Color.RED);
        } else if (e.getSource()==green) {
            c.setBackground(Color.GREEN);
        }
    }
    public static void main(String[] args) {
        NewAction frame=new NewAction();
        frame.setVisible(true);
    }
}
