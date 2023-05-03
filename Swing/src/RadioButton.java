import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButton extends JFrame {
    private Container c;
    private JRadioButton male,female;
    private ButtonGroup bg;
    private JTextArea ta;
    private JCheckBox a;
    RadioButton(){
        init();
    }
    public void init(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,400,400);
        setTitle("Title Here");
        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        a=new JCheckBox("select a");
        a.setBounds(50,10,100,50);
        a.setBackground(Color.orange);
        c.add(a);
        bg=new ButtonGroup();
        male=new JRadioButton("Male");
        male.setBounds(50,50,100,50);
        male.setBackground(Color.orange);
        male.setSelected(true);
        //male.setEnabled(false);
        c.add(male);
        female=new JRadioButton("Female");
        female.setBounds(160,50,100,50);
        female.setBackground(Color.orange);
        c.add(female);
        bg.add(male);
        bg.add(female);
        bg.add(a);
        ta=new JTextArea();
        ta.setBounds(20,110,300,200);
        ta.setEditable(false);
        c.add(ta);
        Handler handler=new Handler();
        male.addActionListener(handler);
        female.addActionListener(handler);
        a.addActionListener(handler);
    }
    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(male.isSelected()){
                ta.append("Selected male\n");
            }
            else if (female.isSelected()) {
                ta.append("Selected female\n");
            }
            else if (e.getSource()==a) {
                ta.append("this is a\n");
            }
        }
    }
//    class Handler implements ItemListener{
//
//    @Override
//    public void itemStateChanged(ItemEvent e) {
//        if(male.isSelected()){
//                ta.append("Selected male\n");
//            }
//            else if (female.isSelected()) {
//                ta.append("Selected female\n");
//            }
//            else if (e.getSource()==a) {
//                ta.append("this is a\n");
//            }
//    }
//}
    public static void main(String[] args) {
        RadioButton frame=new RadioButton();
        frame.setVisible(true);
    }
}
