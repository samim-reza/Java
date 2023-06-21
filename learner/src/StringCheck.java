import java.util.Scanner;
import java.util.regex.*;

public class StringCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.matches("^[A-Za-z]+-\\d+/\\d+$")){
            System.out.println("ok");
        }

    }
}
