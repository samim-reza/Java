import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JLabel userLabel,passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton logButton,clearButton;
    private Container c;
    private Font f;
    Login(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,200,600,400);
        setTitle("Login");
        c=this.getContentPane();
        c.setLayout(null);
        f=new Font("Arial",Font.BOLD,16);
        c.setBackground(Color.GRAY);
        userLabel=new JLabel("User Name: ");
        userLabel.setFont(f);
        userLabel.setBounds(150,50,150,30);
        userLabel.setForeground(Color.WHITE);
        c.add(userLabel);
        tf=new JTextField();
        tf.setBounds(260,50,200,30);
        c.add(tf);
        passLabel=new JLabel("Password: ");
        passLabel.setFont(f);
        passLabel.setBounds(150,95,150,30);
        passLabel.setForeground(Color.WHITE);
        c.add(passLabel);
        pf=new JPasswordField();
        pf.setBounds(260,95,200,30);
        pf.setEchoChar('*');
        c.add(pf);
        logButton =new JButton("Login");
        logButton.setBounds(160,155,90,30);
        logButton.setFont(f);
        c.add(logButton);
        clearButton =new JButton("Clear");
        clearButton.setBounds(270,155,90,30);
        clearButton.setFont(f);
        c.add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                pf.setText("");
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName=tf.getText();
                String password=pf.getText();
                if(userName.equals("abcd") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(null,"login successful",userName,JOptionPane.PLAIN_MESSAGE);
                    dispose();
//                    NewFrame frame=new NewFrame();
//                    frame.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid User name or Password","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    public static void main(String[] args) {
        Login frame=new Login();
        frame.setVisible(true);
    }
}