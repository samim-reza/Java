class A{

    void met()
    {
        System.out.println("A");
    }
     int i;
     static void nme(){
          i=00;

    }
}
class B extends A{
    void met(){
        System.out.println("B");
    }
}
public class test{
    public static void main(String[] args) {
        A s=new B();
        s.met();
    }
}