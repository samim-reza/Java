import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderDemo extends JFrame implements ChangeListener {
    private Container c;
    private JSlider slider;
    private JPanel panel;
    JSliderDemo(){
        init();
    }
    public void init(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,800,400);
        setTitle("Title Here");
        c=getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(70, 227, 53));
        slider=new JSlider(0,200,5);
        slider.setBounds(100,50,600,50);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        panel=new JPanel();
        panel.setBounds(100,150,150,150);
        panel.setBackground(Color.orange);
        c.add(panel);
        c.add(slider);
        slider.addChangeListener(this);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        int value= slider.getValue();
        Color color=new Color(value);
        panel.setBackground(color);
    }
    public static void main(String[] args) {
     JSliderDemo frame=new JSliderDemo();
    }

}
