package Level3;

import java.util.Scanner;
//28. Write a program to find the product of all natural numbers from 1 to n (factorial of n).

public class L8 {
    public static void main(String[] args) {
                     System.out.println("Write a number to get the product of all natural numbers from 1 to n (factorial of n)");
        Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();
        int factorial=1;
        for(int i=num1;i>=1;i--)
        {
           factorial*=i;
        }
        System.out.println("Factorial is: "+ factorial);
        number.close();
    }
}
