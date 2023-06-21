import java.util.Scanner;

class MaxSizeException extends Exception {

    MaxSizeException(String message) {
        super(message);
    }

    MaxSizeException() {
        super("Maximum size Exceeded");
    }
}

class Calculator {

    public static void square(String id) {

        int length = id.length();
        System.out.println("Square of the id length is: "+(length*length));
    }

    public static void squareRoot(String id) {

        try {
            int length = id.length();
            System.out.println("Squareroot of the id length is: "+Math.sqrt(length));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }

    public static void Modulas(String id, int mod) {

        try {
            int length = id.length();
            System.out.println("Modulas of the id length is: "+(length%mod));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static String subtract(String s1, String s2) {
        return s2.replace(s1, "");
    }
}

public class Lab {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String s1;
        String friendsId;
       

        while(true){
            System.out.print("Enter your id: ");
            s1 = sc.nextLine();
            try {
                int length = s1.length();
                if (length > 11) {
                    throw new MaxSizeException();
                }
                break;
            } catch (MaxSizeException e) {
                System.out.println(e.getMessage());
            }
        }
        while(true){
            System.out.print("Enter your friends id: ");
            friendsId = sc.nextLine();
            try {
                int length = friendsId.length();
                if (length > 11) {
                    throw new MaxSizeException();
                }
                break;
            } catch (MaxSizeException e) {
                System.out.println(e.getMessage());
            }
        }

        String s2 =s1.concat(friendsId);
        String s3 = Calculator.subtract(s1, s2);

        Calculator.square(s3);
        Calculator.squareRoot(s3);
        Calculator.Modulas(s3, 2);
    }
}
