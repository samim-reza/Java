import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mt extends JFrame {
    private Container c;
    private JLabel imgLabel,textLabel;
    private JTextArea ta;
    private JTextField tf;
    private JButton clear;
    private ImageIcon img;
    private Font f;
    private Cursor cursor;
    Mt(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
        img = new ImageIcon(getClass().getResource("d1.gif"));
        imgLabel=new JLabel(img);
        imgLabel.setBounds(100,10, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);
        f=new Font("Arial",Font.BOLD+Font.ITALIC,22);
        textLabel=new JLabel("Enter Number: ");
        textLabel.setBounds(20,300,250,60);
        textLabel.setFont(f);
        c.add(textLabel);
        tf=new JTextField();
        tf.setBounds(220,320,150,30);
        tf.setBackground(Color.GREEN);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(f);
        tf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        c.add((tf));
        clear=new JButton("Clear");
        clear.setBounds(220,360,150,30);
        clear.setBackground(Color.GREEN);
        c.add(clear);
        cursor=new Cursor(Cursor.HAND_CURSOR);
        clear.setCursor(cursor);
        ta=new JTextArea();
        ta.setBounds(20,400,300,300);
        ta.setBackground(Color.GREEN);
        ta.setFont(f);
        c.add(ta);
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value=tf.getText();
                if(value.isEmpty()){
                    JOptionPane.showMessageDialog(null,"You didn't enter anything!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    ta.setText("");
                    int num=Integer.parseInt(tf.getText());
                    for(int i=1;i<6;i++){
                        String r=String.valueOf(num*i), n=String.valueOf(i),in=String.valueOf(num);
                        ta.append(in+"X"+n+"="+r+"\n");
                    }
                    tf.setText("");
                }
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");
            }
        });
    }
    public static void main(String[] args) {
        Mt frame=new Mt();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,20,360,800);
        frame.setTitle("Title");

    }
}
