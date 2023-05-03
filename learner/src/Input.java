
import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
        int num=120;
        String s;
        Scanner input= new Scanner(System.in);
        s=input.nextLine();
        num=input.nextInt();

        System.out.println("Number="+num);
        System.out.println("string"+s+num);

    }
}
