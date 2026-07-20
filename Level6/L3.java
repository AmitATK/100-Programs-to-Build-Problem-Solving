package Level6;
//59. Write a program to find the sum of the series 1 + 2 + 3 + ... + n.

import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
         System.out.println("Type to display find the sum of the series: ");
        Scanner num1 = new Scanner(System.in);
        int number1=num1.nextInt();
        int sum=number1*(number1+1)/2;

        System.out.println("Sum of the series : "+ sum);

    }
}
