package Level4;

import java.util.Scanner;
//34. Write a program to display all the digits of a number n (one per line).
public class L2 {
    public static void main(String[] args) {
        
     System.out.println("Type a no. to count the number of digits in a number n.");
        Scanner num1= new Scanner(System.in);
        int number= num1.nextInt();
        int count=0;
        if(number ==0) count =1;
        else {
        while(number >0)
        {
            number= number/10;
            count ++;

            System.out.println("number of digit as  :  "+ count);
        }
    }
        num1.close();
}
}
