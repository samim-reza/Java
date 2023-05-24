
abstract class phone{
    abstract void call();
    abstract void message();
}

interface ICamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void play();
    void stop();
}
class SmartPhone extends phone implements ICamera,IMusicPlayer{
    public void call(){
        System.out.println("Calling...");
    }
    public void message(){
        System.out.println("Messaging...");
    }
    public void click(){
        System.out.println("Clicking...");
    }
    public void record(){
        System.out.println("Recording...");
    }
    public void play(){
        System.out.println("Playing...");
    }
    public void stop(){
        System.out.println("Stopping...");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        SmartPhone samsung=new SmartPhone();
        samsung.call();
    }
}
