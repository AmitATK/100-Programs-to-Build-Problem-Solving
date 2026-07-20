package Level6;

import java.util.Scanner;
//57. Write a program to display the first n terms of the Fibonacci series.

public class L1 {
    public static void main(String[] args) {
        System.out.println("Type to display the first n terms of the Fibonacci series.: ");
        Scanner num1 = new Scanner(System.in);
        int number1=num1.nextInt();
        int first=0;
        int sec=1;
        for(int i=0;i<number1;i++)
        {
        int next=first+sec;
        System.out.println(first+ " ");
        first=sec;
        sec=next;

        }
        num1.close();
    }
}
