import javax.swing.*;
import java.awt.*;

public class Label extends JFrame {
    private Container c;
    private JLabel userLabel,passLabel;
    private Font f;
    Label(){
        init();
    }
    public void init(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        f=new Font("Arial",Font.BOLD,14);
        userLabel=new JLabel();
        userLabel.setText("Enter Your User Name: ");
        userLabel.setBounds(50,20,250,50);
        userLabel.setFont(f);
        userLabel.setForeground(Color.BLUE);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.DARK_GRAY);
        userLabel.setToolTipText("User name");
        c.add(userLabel);
        passLabel = new JLabel("Enter Your Password: ");
        passLabel.setBounds(50,60,250,50);
        passLabel.setFont(f);
        c.add(passLabel);
    }
    public static void main(String[] args) {
        Label frame=new Label();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("Label");
    }
}
