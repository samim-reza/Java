import javax.swing.*;
import java.awt.*;

public class TextArea extends JFrame {
    private Container c;
    private JTextArea ta;
    private JScrollPane scroll;
    TextArea(){
        init();
    }
    public void init(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        ta=new JTextArea();
        //ta.setBounds(50,50,400,200);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        scroll=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(50,50,400,200);
        c.add(scroll);
    }
    public static void main(String[] args) {
        TextArea frame=new TextArea();
        frame.setVisible(true);
        frame.setBounds(100,50,500,400);
        frame.setTitle("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
