import java.util.Scanner;

interface increaseSalary{

}
interface DecreaseSalary{

}
abstract class Employee{
    private String name;
    private int age=0;
    private String address="not available";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    abstract void knowDriving();
}
class Officer extends Employee{
    @Override
    void knowDriving() {
        System.out.println("Valid");
    }
    Officer(String name, int age, String address){
        this.setName(name);
        this.setAge(age);
        this.setAddress(address);
    }
    Officer(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    Officer(String name){
        this.setName(name);
    }
}
public class EmployeeManagement {
    static Scanner sc=new Scanner(System.in);
    static int list=0;
    static Officer[] all=new Officer[20];
    public static void addEmployee(){
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter age:");
        int age=sc.nextInt();
        Officer o=new Officer(name,age);
        all[list]=o;
        list++;
        Choice.makeChoice();
    }
    public static void deleteEmployee(Employee delete) {
        for (int i = 0; i < list; i++) {
            if (all[i] == delete) {
                for (int j = i; j < list - 1; j++) {
                    all[j] = all[j + 1];
                }
                all[list - 1] = null;
                list--;
                System.out.println("Employee deleted successfully.");
                break;
            }
        }
        Choice.makeChoice();
    }

    public static void displayEmployee(){
        System.out.println(all[0].getName()+"\n"+all[0].getAge());
    }

    public static void main(String[] args) {
        Choice.makeChoice();
    }
}
class Choice{
    static void makeChoice(){
        System.out.println("Input 1 to add");
        System.out.println("Input 2 to delete");
        System.out.println("Input 3 to display");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        if(c==1){
            EmployeeManagement.addEmployee();
        } else if (c==2) {
            System.out.print("Enter name:");
            String name=sc.nextLine();
            for(int i=0; i<=EmployeeManagement.list; i++){
                if(name.equals(EmployeeManagement.all[i].getName())){
                    Employee delete=EmployeeManagement.all[i];
                    EmployeeManagement.deleteEmployee(delete);
                }
            }
            EmployeeManagement.deleteEmployee();
        } else if (c==3) {
            EmployeeManagement.displayEmployee();
        }else {
            System.out.println("Wrong Keyword");
            Choice.makeChoice();
        }
    }
}