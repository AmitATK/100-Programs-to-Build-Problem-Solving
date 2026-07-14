package Level2;
//12. Write a program to read a number and check whether it is positive, negative or zero.

import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        System.out.println("Type a number to check it is positive or nogatice");
        Scanner num = new Scanner(System.in);
        int number= num.nextInt();

        if(number>0) System.out.println("Positive number");
        else if(number==0) System.out.println("Its 0");
        else System.out.println("Its negative");
    }
}
