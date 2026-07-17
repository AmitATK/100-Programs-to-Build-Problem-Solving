package Level5;
//44. Write a program to read a number and check whether it is prime or not.

import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        System.out.println("to read a number and check whether it is prime or not.");

        Scanner num= new Scanner(System.in);
        int number=num.nextInt();
        boolean isPrime=true;
       if(number <=1) isPrime=false;

       else
       {
        for(int i=2; i<=number/2;i++)
        {
            if(number%i ==0) 
            {
                isPrime = false;
                break;
        }
    }
       }
if(isPrime) System.out.println("It is prime number");
else System.out.println("It is not prime number");
    }
}
