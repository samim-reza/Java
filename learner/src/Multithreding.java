
class My implements Runnable{

    @Override
    public void run() {
        
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }

}

public class Multithreding {
    public static void main(String[] args) {
        My obj=new My();
        Thread t=new Thread(obj);
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
    }
}