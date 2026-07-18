package Level5;

import java.util.Scanner;

//54. Write a program to count the number of factors of a number n.

public class L11 {
    public static void main(String[] args) {
        System.out.println("Type  to  count the number of factors of a number n: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int count=1;
        for(int i=1;i<number;i++)
        {
            if(number % i ==0) count++;
        }
        System.out.println("Total number of factor of this number is: "+count);
    }
}
