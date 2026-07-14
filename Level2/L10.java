package Level2;

import java.util.Scanner;
//20. Write a program to read the age of a person and check whether they are eligible to vote.

public class L10 {
    public static void main(String[] args) {
     System.out.println("Write your age to check whether you are eligible to vote or not");
        Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();
        if (num1 >=18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");

        number.close();
    }
}
