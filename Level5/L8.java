package Level5;

import java.util.Scanner;

//51. Write a program to check whether a number is an automorphic number.

public class L8 {
    public static void main(String[] args) {
        System.out.println("Type  to check whether a number is a automorphic number: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        if(number>0)
        {
            int sq=number*number;
            int rem=sq%10;
            if(rem== number)
            {
                System.out.println("It is automorphic number: " + number);
            }
            else System.out.println("Not automorphic number");
        }
    }
}
