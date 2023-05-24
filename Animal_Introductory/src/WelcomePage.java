import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class WelcomePage extends JFrame{
    private JLabel welcomeLabel;
    private JButton signIn, signUp;
    private ImageIcon icon;

    WelcomePage() {

        setTitle("Welcome");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        icon =new ImageIcon("src/Icon.jpg");
        this.setIconImage(icon.getImage());

        JLabel background = new JLabel(new ImageIcon("src/BackGroundImage/Cat.gif"));
        background.setLayout(new GridBagLayout());
        setContentPane(background);

        GridBagConstraints positions = new GridBagConstraints();
        positions.fill = GridBagConstraints.HORIZONTAL;
        positions.insets = new Insets(10, 10, 10, 10);

        welcomeLabel = new JLabel("Welcome to the Introductory");
        welcomeLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        positions.gridx = 0;
        positions.gridy = 0;
        positions.gridwidth = 2;
        positions.anchor = GridBagConstraints.CENTER;
        add(welcomeLabel, positions);

        signIn = new JButton("Sign In");
        signIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signIn.setBackground(new Color(0x2FD7C9));
        positions.gridx = 0;
        positions.gridy = 1;
        add(signIn, positions);

        signUp = new JButton("Sign Up");
        signUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        positions.gridy = 2;
        add(signUp, positions);

        setLocationRelativeTo(null);
        setVisible(true);

        signIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginPane(getContentPane().getWidth(),getContentPane().getHeight());
            }
        });
        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new CreateAccountPage(getContentPane().getWidth(),getContentPane().getHeight());
            }
        });
    }
}
class LoginPane extends JFrame implements ActionListener{
    private Container c;
    private JLabel usernameLabel;
    private JTextField usernameTextField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton logButton, clearButton, backButton;
    private ImageIcon icon;
    LoginPane(int width, int height) {

        c=getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width,height);
        setMinimumSize(new Dimension(900,600));
        setTitle("Login Form");
        setVisible(true);
        icon =new ImageIcon("src/Icon.jpg");
        this.setIconImage(icon.getImage());

        JPanel panel = new JPanel(new GridBagLayout());

        usernameLabel = new JLabel("Username:");
        usernameTextField = new JTextField(20);
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        passwordField.setEchoChar('*');

        logButton =new JButton("Login");
        logButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        logButton.setBackground(new Color(0xFD7F00));
        logButton.addActionListener(this);

        clearButton =new JButton("Clear");
        clearButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        clearButton.setBackground(new Color(0xFC9125));
        clearButton.addActionListener(this);

        backButton =new JButton("Back");
        backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backButton.setBackground(new Color(0xFDA852));
        backButton.addActionListener(this);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth=1;
        panel.add(usernameLabel, gbc);
        gbc.gridx = 1;
        panel.add(usernameTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(passwordLabel, gbc);
        gbc.gridx = 1;
        panel.add(passwordField, gbc);
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(logButton, gbc);
        gbc.gridy=3;
        panel.add(clearButton, gbc);
        gbc.gridy=4;
        panel.add(backButton, gbc);

        c.add(panel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==logButton){
            String username = usernameTextField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("") && password.equals("")) {
                new Book(getContentPane().getWidth(), getContentPane().getHeight());
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==clearButton){
            usernameTextField.setText("");
            passwordField.setText("");
        }
        else if (e.getSource()==backButton) {
            dispose();
            new WelcomePage();
        }
    }
}
class CreateAccountPage extends JFrame{

    private JPanel pane;
    private JLabel name, pass, emailLabel, ageLabel, createAccountLabel, confirmPass ;
    private JTextField username, emailField;
    private JPasswordField password, confirmPassword;
    private JSlider ageSlider;
    private JButton signup, exsistAccount;
    private ImageIcon icon;

    CreateAccountPage(int width, int height) {

        setTitle("Create New Account");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        icon =new ImageIcon("src/Icon.jpg");
        this.setIconImage(icon.getImage());

        pane = new JPanel(new GridBagLayout());
        GridBagConstraints positions = new GridBagConstraints();
        positions.fill = GridBagConstraints.HORIZONTAL;
        positions.insets = new Insets(5, 5, 5, 5);

        createAccountLabel = new JLabel("Create Account");
        createAccountLabel.setFont(createAccountLabel.getFont().deriveFont(Font.BOLD, 22));

        name = new JLabel("Full Name: ");
        username = new JTextField(15);

        pass = new JLabel("Password: ");
        password = new JPasswordField(15);

        confirmPass = new JLabel("Confirm Password: ");
        confirmPassword = new JPasswordField(15);

        emailLabel = new JLabel("Email: ");
        emailField = new JTextField(25);

        ageLabel = new JLabel("Age: ");
        ageSlider = new JSlider(5, 40);
        ageSlider.setMajorTickSpacing(5);
        ageSlider.setMinorTickSpacing(1);
        ageSlider.setPaintTicks(true);
        ageSlider.setPaintLabels(true);

        signup = new JButton("Sign up");
        signup.setBackground(new Color(0x2FD7C9));
        signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exsistAccount = new JButton("Already have an account?");
        exsistAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        positions.gridx = 0;
        positions.gridy = 0;
        positions.gridwidth = 2;
        positions.anchor = GridBagConstraints.CENTER;
        pane.add(createAccountLabel, positions);

        positions.gridx = 0;
        positions.gridy = 1;
        positions.gridwidth = 1;
        pane.add(name, positions);

        positions.gridx = 1;
        pane.add(username, positions);

        positions.gridx = 0;
        positions.gridy = 2;
        pane.add(pass, positions);

        positions.gridx = 1;
        pane.add(password, positions);

        positions.gridx = 0;
        positions.gridy = 3;
        pane.add(confirmPass, positions);

        positions.gridx = 1;
        pane.add(confirmPassword, positions);

        positions.gridx = 0;
        positions.gridy = 4;
        pane.add(emailLabel, positions);

        positions.gridx = 1;
        pane.add(emailField, positions);

        positions.gridx = 0;
        positions.gridy = 5;
        pane.add(ageLabel, positions);

        positions.gridx = 1;
        pane.add(ageSlider, positions);

        positions.gridx = 0;
        positions.gridy = 6;
        positions.gridwidth = 2;
        positions.anchor = GridBagConstraints.CENTER;
        pane.add(signup, positions);

        positions.gridy = 7;
        pane.add(exsistAccount, positions);

        setContentPane(pane);
        setLocationRelativeTo(null);
        setVisible(true);

        signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginPane(getContentPane().getWidth(),getContentPane().getHeight());
            }
        });
        exsistAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginPane(getContentPane().getWidth(),getContentPane().getHeight());
            }
        });
    }
}
