package Level6;

import java.util.Scanner;
//58. Write a program to find the sum of the first n terms of the Fibonacci series.

public class L2 {
    public static void main(String[] args) {
        System.out.println("Type to display the sum of the first n terms of the Fibonacci series.: ");
        Scanner num1 = new Scanner(System.in);
        int number1=num1.nextInt();

        long first=0;
        long sec=1;

        for(int i=2;i<=number1+1;i++)
        {
            long sum=first+sec;
            first=sec;
            sec=sum;

        }

        System.out.println(first-1);
        
    }
}
