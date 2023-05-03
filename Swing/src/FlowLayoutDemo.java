import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    private Container c;
    private JButton buttons[];
    private FlowLayout fLayout;
    private BoxLayout box;
    FlowLayoutDemo(){
        init();
    }
    public void init(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,100,600,600);
        this.setTitle("Title Here");

        c=this.getContentPane();
        fLayout=new FlowLayout(FlowLayout.CENTER,10,15);
        c.setLayout(fLayout);
//        box=new BoxLayout(c,BoxLayout.X_AXIS);
//        c.setLayout(box);
        buttons = new JButton[9];
        for(int i=0; i<9; i++){
            buttons[i]=new JButton(""+(i+1));
            c.add(buttons[i]);
            c.add(Box.createHorizontalStrut(10));
        }

    }
    public static void main(String[] args) {
        FlowLayoutDemo frame=new FlowLayoutDemo();
        frame.setVisible(true);

    }
}
