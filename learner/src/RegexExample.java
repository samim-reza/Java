import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String text = "abc xyz 123";

        // [abc]
        Pattern pattern1 = Pattern.compile("[abc]");
        Matcher matcher1 = pattern1.matcher(text);
        while (matcher1.find()) {
            System.out.println("Found match: " + matcher1.group());
        }

        // [abc][mn]
        Pattern pattern2 = Pattern.compile("[abc][mn]");
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher2.find()) {
            System.out.println("Found match: " + matcher2.group());
        }

        // [^abc]
        Pattern pattern3 = Pattern.compile("[^abc]");
        Matcher matcher3 = pattern3.matcher(text);
        while (matcher3.find()) {
            System.out.println("Found match: " + matcher3.group());
        }

        // [a-z]
        Pattern pattern4 = Pattern.compile("[a-z]");
        Matcher matcher4 = pattern4.matcher(text);
        while (matcher4.find()) {
            System.out.println("Found match: " + matcher4.group());
        }

        // A|B
        Pattern pattern5 = Pattern.compile("A|B");
        Matcher matcher5 = pattern5.matcher(text);
        while (matcher5.find()) {
            System.out.println("Found match: " + matcher5.group());
        }

        // xz
        Pattern pattern6 = Pattern.compile("xz");
        Matcher matcher6 = pattern6.matcher(text);
        while (matcher6.find()) {
            System.out.println("Found match: " + matcher6.group());
        }

        // \d
        Pattern pattern7 = Pattern.compile("\\d");
        Matcher matcher7 = pattern7.matcher(text);
        while (matcher7.find()) {
            System.out.println("Found match: " + matcher7.group());
        }

        // \D
        Pattern pattern8 = Pattern.compile("\\D");
        Matcher matcher8 = pattern8.matcher(text);
        while (matcher8.find()) {
            System.out.println("Found match: " + matcher8.group());
        }

        // \s
        Pattern pattern9 = Pattern.compile("\\s");
        Matcher matcher9 = pattern9.matcher(text);
        while (matcher9.find()) {
            System.out.println("Found match: " + matcher9.group());
        }

        // \S
        Pattern pattern10 = Pattern.compile("\\S");
        Matcher matcher10 = pattern10.matcher(text);
        while (matcher10.find()) {
            System.out.println("Found match: " + matcher10.group());
        }

        // \w
        Pattern pattern11 = Pattern.compile("\\w");
        Matcher matcher11 = pattern11.matcher(text);
        while (matcher11.find()) {
            System.out.println("Found match: " + matcher11.group());
        }

        // \W
        Pattern pattern12 = Pattern.compile("\\W");
        Matcher matcher12 = pattern12.matcher(text);
        while (matcher12.find()) {
            System.out.println("Found match: " + matcher12.group());
        }

        // *
        Pattern pattern13 = Pattern.compile("a*");
        Matcher matcher13 = pattern13.matcher(text);
        while (matcher13.find()) {
            System.out.println("Found match: " + matcher13.group());
        }

        // +
        Pattern pattern14 = Pattern.compile("a+");
        Matcher matcher14 = pattern14.matcher(text);
        while (matcher14.find()) {
            System.out.println("Found match: " + matcher14.group());
        }

        // ?
        Pattern pattern15 = Pattern.compile("a?");
        Matcher matcher15 = pattern15.matcher(text);
        while (matcher15.find()) {
            System.out.println("Found match: " + matcher15.group());
        }

        // {x}
        Pattern pattern16 = Pattern.compile("a{3}");
        Matcher matcher16 = pattern16.matcher(text);
        while (matcher16.find()) {
            System.out.println("Found match: " + matcher16.group());
        }

        // {x,y}
        Pattern pattern17 = Pattern.compile("a{2,4}");
        Matcher matcher17 = pattern17.matcher(text);
        while (matcher17.find()) {
            System.out.println("Found match: " + matcher17.group());
        }
    }
}
