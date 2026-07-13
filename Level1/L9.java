import java.util.Scanner;

public class L9 {
    //9. Write a program to read the marks of 5 subjects and print the total and average.
    public static void main(String[] args) {
         System.out.println("Type Five Subject Marks: ");

        Scanner subject1= new Scanner(System.in);
        Scanner subject2= new Scanner(System.in);
        Scanner subject3= new Scanner(System.in);
        Scanner subject4= new Scanner(System.in);
        Scanner subject5= new Scanner(System.in);
        int sub1=subject1.nextInt();
        int sub2=subject2.nextInt();
        int sub3=subject3.nextInt();
        int sub4=subject4.nextInt();
        int sub5=subject5.nextInt();
        int averageOfMarks=(sub1+sub2+sub3+sub4+sub5)/5;

        System.out.println("Average os five marks: "+averageOfMarks);
    }
}
