import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        setTitle("My Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        setLayout(new GridLayout(2, 2));

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(103, 169, 234));
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(234, 217, 103));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(206, 103, 234));
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel panel4 = new JPanel();
        panel4.setBackground(new Color(234, 123, 103));
        panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);

        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame frame=new MyFrame();
    }
}
