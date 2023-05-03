import javax.swing.*;
import java.awt.*;

public class Test3 extends JFrame {
    private Container c;
    private JPanel panel;
    Test3(){
        init();
    }
    public void init(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50,50,500,400);
        setTitle("Title");
        c=getContentPane();
        c.setBackground(Color.GREEN);
        panel=new JPanel();
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(10,100,50,10);
        JTextField usernameTextField = new JTextField(20);
        usernameTextField.setBounds(60,10,50,10);
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,20,50,10);
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(60,30,50,10);
        panel.add(usernameLabel);
        panel.add(usernameTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.setBackground(Color.CYAN);
        c.add(panel,BorderLayout.CENTER);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Test3 frame=new Test3();
    }
}
