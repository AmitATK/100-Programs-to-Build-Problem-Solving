package Level4;

import java.util.Scanner;
//42. Write a program to replace all zeros in a number n with the digit 5.

public class L10 {
    public static void main(String[] args) {
        System.out.println("Type number to replace all zeros in a number n with the digit 5.");
        Scanner num1= new Scanner(System.in);
        int number= num1.nextInt();
        int  toCheck=0;
        while(number>0)
        {
            int rem=number%10;
            if(rem==0) toCheck=toCheck*10+5;
            else if(rem!=0) toCheck=toCheck*10+rem;
            number=number/10;
            
        }
        while (toCheck>0) {
            int rem =toCheck%10;
            number=number*10+rem;
            toCheck=toCheck/10;

        }
System.out.println("replaced all zeros in a number n with the digit 5: "+ number);
    num1.close(); 
    }
}
