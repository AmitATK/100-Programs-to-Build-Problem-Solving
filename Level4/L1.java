package Level4;

import java.util.Scanner;

//33. Write a program to count the number of digits in a number n.

public class L1 {
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
        }
    }
        num1.close();
        System.out.println("Total number of digit in n is : "+ count);
    }
}
