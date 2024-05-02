
public class InterProcess{
    public static void main(String[] args) {
        try {
            System.out.print("G");
            throw new Exception();
        } catch (Exception e) {
            System.out.print(" U");
            System.exit(0);
        } finally {
            System.out.print(" B");
        }
    }
}