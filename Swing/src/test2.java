import javax.swing.*;

public class test2 {
    public static void main(String[] args) {
        ImageIcon icon=new ImageIcon("d1.gif");
        JOptionPane.showMessageDialog(null,"message","Title",JOptionPane.PLAIN_MESSAGE,icon);
        //String s=JOptionPane.showInputDialog("Input:","default");
        //String s=JOptionPane.showInputDialog(null,"Input:","title",JOptionPane.YES_OPTION);
        //JOptionPane.showMessageDialog(null,s+"dd");
        int choice = JOptionPane.showConfirmDialog(null,"wanna quit?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
        if(choice==JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            System.out.println(choice);
        }
    }
}