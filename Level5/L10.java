package Level5;
//53. Write a program to find all factors (divisors) of a number n.

import java.util.Scanner;

public class L10 {
    public static void main(String[] args) {
        System.out.println("Type  to find all factors (divisors) of a number n: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        for(int i=1;i<=number;i++)
        {
            if(number%i==0) System.out.println("divisor of this number : "+ i);
        }

    }
}
