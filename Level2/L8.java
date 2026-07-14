package Level2;

import java.util.Scanner;
//18. Write a program to read the marks of a student and print the grade (A/B/C/D/Fail).

public class L8 {
    public static void main(String[] args) {
        System.out.println("Write you total marks from 500 which you got");
        Scanner c = new Scanner(System.in);
        int num1=c.nextInt();
        if(num1<=500 && num1>=450) System.out.println("Grade A you got");
        else if(num1<=449 && num1>=400) System.out.println("Grade B you got");
        else if(num1<=399 && num1>=320) System.out.println("Grade C you got");
        else if(num1<=319 && num1>=250) System.out.println("Grade D you got");
        else System.out.println("You are Fail");

       
        c.close();
    }
}
