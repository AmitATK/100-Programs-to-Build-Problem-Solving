package Level6;

import java.util.Scanner;

//60. Write a program to find the sum of the series 1^2 + 2^2 + 3^2 + ... + n^2.

public class L4 {
    public static void main(String[] args) {
        System.out.println("Type to display find the sum of the series: ");
        Scanner num1 = new Scanner(System.in);
        int number1=num1.nextInt();

        long  sum=((number1*(number1+1)) *((2*number1)+1))/6;
        System.out.println("Sm of the seriese is: "+ sum);
    }
}
