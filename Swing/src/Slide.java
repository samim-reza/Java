import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Slide extends JFrame implements ActionListener{
    private Container c;
    private JPanel panel;
    private JButton next,previous;
    private ImageIcon icon;
    private JLabel label;
    private CardLayout card;
    Slide(){
        init();
        showImage();
    }
    public void showImage(){
        String[] img={"download.jpeg","d2.jpg","download1.png"};
        for(String n:img) {
            icon = new ImageIcon("src/"+n);
            Image image=icon.getImage();
            Image newImage=image.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
            icon=new ImageIcon(newImage);
            label = new JLabel(icon);
            panel.add(label);
        }
    }
    public void init(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,500);
        this.setTitle("Slide Show");

        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(91, 39, 196));

        card=new CardLayout();

        panel=new JPanel(card);
        panel.setBounds(10,10,560,380);
        c.add(panel);

        previous=new JButton("Previous");
        previous.setBounds(10,400,100,50);
        c.add(previous);

        next=new JButton("Next");
        next.setBounds(470,400,100,50);
        c.add(next);

        next.addActionListener(this);
        previous.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==previous){
            card.previous(panel);
        }
        if(e.getSource()==next){
            card.next(panel);
        }

    }

    public static void main(String[] args) {
        Slide frame=new Slide();
        frame.setVisible(true);

    }


}
