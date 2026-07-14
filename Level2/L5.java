package Level2;

import java.util.Scanner;
//15. Write a program to read a year and check whether it is a leap year or not.

public class L5 {
   public static void main(String[] args) {
    System.out.println("Type year to check its leap year or not");
           Scanner num1 = new Scanner(System.in);
        int number1= num1.nextInt();
    if(number1 %4 ==0) System.out.println("This is leap year");
    else System.out.println("Not leap year");

   } 
}
