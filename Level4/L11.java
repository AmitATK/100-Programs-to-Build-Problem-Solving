package Level4;

import java.util.Scanner;
//43. Write a program to find the sum of the first and last digit of a number n.

public class L11 {
    public static void main(String[] args) {
                System.out.println("Type number to find the sum of the first and last digit of a number n.");
        Scanner num1= new Scanner(System.in);
        int number= num1.nextInt();
        int  toCheck=number%10;
        while(number>10)
        {
        number=number/10;            
        }

System.out.println("the sum of the first and last digit of a number n.: "+ (number + toCheck));
    num1.close(); 
    }
}
