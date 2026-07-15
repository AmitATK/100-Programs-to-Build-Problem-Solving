package Level4;

import java.util.Scanner;
//37. Write a program to reverse a number n.
public class L5 {
        public static void main(String[] args) {
        
        System.out.println("Type  to find the product of all digits of a number n.");
        Scanner num1= new Scanner(System.in);
        int number= num1.nextInt();
        int rev=0;
        while(number>0)
        {
            int rem =number %10;
            rev=rev*10+rem;
            number=number/10;
        }

        System.out.println("Reverse number is :"+ rev);
    }
}
