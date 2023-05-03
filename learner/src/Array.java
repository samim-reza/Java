import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] num = new int[10];
        int len = num.length;
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            num[i]=input.nextInt();
        }
        for(int i=0; i<10; i++)
        {
            System.out.println(num[i]);
            //Arrays.toString(num);
        }
    }
}
