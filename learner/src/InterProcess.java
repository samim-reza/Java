class MyData{

    int value;
    boolean flag=true;

    synchronized public void set(int v){
        while(flag!=true){
            try{wait();}catch(Exception e){}
        }
        value = v;
        flag=false;
        notify();
    }

    synchronized public int get(){

        while(flag!=false){
            try{wait();}catch(Exception e){}
        }
        int x=value;
        flag=true;
        notify();

        return x;
    }
}
class Producer extends Thread{

    MyData data;
    Producer(MyData d){
        data = d;
    }

    public void run(){
        int count=1;
        while(true){
            data.set(count);
            System.out.println("Producer produced "+count);
            count++;
            //try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
class Consumer extends Thread{
    MyData data;
    Consumer(MyData d){
        data = d;
    }
    public void run(){
        int value;
        while(true){
            value=data.get();
            System.out.println("Consumer consumed "+value);
            //try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
public class InterProcess{
    public static void main(String[] args) {
        MyData d = new MyData();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();
    }
}