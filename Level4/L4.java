package Level4;

import java.util.Scanner;
//36. Write a program to find the product of all digits of a number n.
public class L4 {
    public static void main(String[] args) {
        
        System.out.println("Type  to find the product of all digits of a number n.");
        Scanner num1= new Scanner(System.in);
        int number= num1.nextInt();
        int sum=1;
        if(number ==0) sum =1;
        else {
        while(number >0)
        {
            int rem= number%10;
            sum=sum*rem;
            number=number/10;
   
        }
        
    }
        System.out.println("sum of all digit as  :  "+ sum);
    }
}
