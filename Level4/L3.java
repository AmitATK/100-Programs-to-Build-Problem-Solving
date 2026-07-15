package Level4;
//35. Write a program to find the sum of all digits of a number n.

import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        System.out.println("Type  to find the sum of all digits of a number n.");
         Scanner num1= new Scanner(System.in);
        int number= num1.nextInt();
        int sum=0;
        if(number ==0) sum =1;
        else {
        while(number >0)
        {
            int rem= number%10;
            number=number/10;
            sum+=rem;
        }
        
    }
        System.out.println("sum of all digit as  :  "+ sum);
    }
}
