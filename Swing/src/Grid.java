import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {
    private Container c;
    private JButton buttons[];
    private GridLayout gl;
    Grid(){
        init();
    }
    public void init(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,300,300);
        this.setTitle("Title Here");

        c=this.getContentPane();
        gl=new GridLayout(3,3,10,10);
        c.setLayout(gl);
        buttons = new JButton[9];
        for(int i=0; i<9; i++){
            buttons[i]=new JButton(""+(i+1));
            c.add(buttons[i]);
        }

    }
    public static void main(String[] args) {
        Grid frame=new Grid();
        frame.setVisible(true);

    }
}
