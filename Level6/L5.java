package Level6;
//61. Write a program to find the sum of the series 1 + 1/2 + 1/3 + ... + 1/n.

import java.util.Scanner;

public class L5 {
    public static void main(String[] args) {
        System.out.println("Type to display find the sum of the series: ");
        Scanner num1 = new Scanner(System.in);
        int number1=num1.nextInt();
        double sum=0.0;
        for(int i=1;i<=number1;i++)
        {
            sum=sum+1.0/i;
        }
        
        System.out.println("Sum of the series is : "+ sum);
 
    }
}
