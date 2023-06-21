import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

class MinimumBalance extends Exception{
    public String toString(){
        return "minimun should be 5000";
    }
}

class exteptionThrow{
    static int area(int a,int b) throws Exception{

           if(a<0 || b<0) {
               throw new MinimumBalance();
           }
        int c=a*b;
        return c;

    }
    static void meth() throws Exception{
            int d=area(-10,5);
            System.out.println(d);
    }
    public static void main(String[] args) throws Exception {

            FileReader f = new FileReader("v.txt");
        try{
            meth ();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class UnchekCheck{
    static void fun1(){
//        FileInputStream fi=new FileInputStream("test.txt");
        try {
            throw new MinimumBalance();
        }
        catch (MinimumBalance e){
            System.out.println(e.toString());
        }
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }

//    public static void main(String[] args) {
//        fun3();
//    }
}
public class ExceptionTest {
//    public static void main(String[] args) {
//        int a,b,c;
//        int arr[]={1,2,3,4};
//        try{
//            a=10;
//            b=0;
//            c=a/b;
//            System.out.println("try");
//            System.out.println(arr[5]);
//        }
//        catch (IndexOutOfBoundsException e){
//            System.out.println("index");
//        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//            System.out.println(e.getMessage());
//            //e.printStackTrace();
//        }
//        finally {
//            System.out.println("final");
//        }
//    }
}
