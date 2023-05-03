import java.util.Scanner;

class student
{
    private int marks;

    public student(int marks)
    {
        this.marks=marks;
    }
    public int getMarks() {
        return marks;
    }
}
public class jav {
    public static void main(String[] args) {
        student[] student_list= new student[10];
        Scanner scan=new Scanner(System.in);
        for(int i=0; i<10; i++)
        {
            int marks=scan.nextInt();
            student_list[i]=new student(marks);
        }
        for(int i=0; i<10; i++)
        {
            System.out.println(student_list[i].getMarks());
        }
    }
}
