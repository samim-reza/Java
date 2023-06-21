public class Multi implements Runnable{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i);
            i=i+2;
        }
    }
    public static void main(String[] args) {
        Multi m= new Multi();
        Thread t=new Thread(m);
        t.start();
        int i=0;
        while(true){
            System.out.println(i);
            i=i+2;
        }
    }
}
