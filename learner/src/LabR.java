import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

class Person {

    private String name;
    private int age;
    private double height;
    private int monthlyIncome;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Height:" + height);
        System.out.println("Monthly income:" + monthlyIncome);
    }
}

public class LabR {

    public LabR()
    {

        JFrame frame = new JFrame("Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JButton button = new JButton("Click");
        button.setBounds(100, 100, 80, 30);
        panel.add(button);
    }

    public static void main(String[] args) {
        LabR labr = new LabR();
//
//        Scanner scan = new Scanner(System.in);
//        Person[] person_list = new Person[5];
//
//        for (int i = 0; i < 5; i++) {
//
//            System.out.println("Enter new person Information");
//            person_list[i] = new Person();
//            System.out.print("Name:");
//            String name = scan.nextLine();
//            System.out.print("Age:");
//            int age = scan.nextInt();
//            System.out.print("Height:");
//            double height = scan.nextDouble();
//            System.out.print("Monthly income:");
//            int salary = scan.nextInt();
//            scan.nextLine();
//            person_list[i].setName(name);
//            person_list[i].setAge(age);
//            person_list[i].setHeight(height);
//            person_list[i].setMonthlyIncome(salary);
//        }
//        //Arrays.stream(person_list).sorted((a, b) -> a.getAge() - b.getAge());
//        for (int i = 0; i < 5; i++) {
//            for (int j = i + 1; j < 5; j++) {
//                if (person_list[i].getAge() < person_list[j].getAge()) {
//                    Person temp = new Person();
//                    temp = person_list[i];
//                    person_list[i] = person_list[j];
//                    person_list[j] = temp;
//                }
//            }
//        }
//        System.out.println("The second elder person according to age is:");
//        person_list[1].display();
    }
}
