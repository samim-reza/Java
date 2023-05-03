import javax.swing.*;
import java.awt.*;
public class Image extends JFrame{
    private Container c;
    private JLabel imgLabel;
    private ImageIcon img;
    Image(){
        init();
    }
    public void init() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        img= new ImageIcon(getClass().getResource("download.jpeg"));
        imgLabel=new JLabel(img);
        imgLabel.setBounds(50,40,img.getIconWidth(),img.getIconHeight());
        c.add(imgLabel);
    }
        public static void main(String[] args) {
            Image frame=new Image();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(200,50,400,300);
            frame.setTitle("Label");

    }
}
