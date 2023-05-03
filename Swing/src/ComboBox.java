import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame {
    private Container c;
    private String[] pl={"C","C++","JAVA","Python"};
    private JComboBox cb;
    private JLabel label;
    private JButton bt;
    ComboBox(){
        init();
    }
    public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 50, 400, 400);
        setTitle("Title Here");
        c=getContentPane();
        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        label=new JLabel();
        label.setBounds(160,150,200,50);
        c.add(label);
        cb=new JComboBox(pl);
        cb.setBounds(50,90,100,50);
        cb.setEditable(true);
        //cb.setSelectedIndex(2);
        cb.setSelectedItem("JAVA");
        cb.addItem("PHP");
        //cb.removeItem();
        //cb.removeItemAt();
        //cb.removeAllItems();
        c.add(cb);
        bt=new JButton("show");
        bt.setBounds(50,150,100,50);
        c.add(bt);
//        cb.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String s=cb.getSelectedItem().toString();
//                label.setText(s+" Selected");
//            }
//        });
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=cb.getSelectedItem().toString();
                label.setText(s+" Selected");
            }
        });
    }
    public static void main(String[] args) {
        ComboBox frame=new ComboBox();
        frame.setVisible(true);
    }
}
