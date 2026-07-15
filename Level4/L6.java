package Level4;

import java.util.Scanner;
//38. Write a program to find the largest digit in a number n.

public class L6 {
    public static void main(String[] args) {
                System.out.println("Type  to find the largest digit in a number n.");
        Scanner num1= new Scanner(System.in);
        int number= num1.nextInt();
        int ans=0;
        while(number>0)
        {
            int rem=number%10;
            if(rem>ans) ans=rem;
            number=number/10;
        }
        System.out.println("argest digit in a number is :"+ ans);
        
    num1.close();
    }
}
