package Level6;
//62. Write a program to find the value of x raised to the power y without using inbuilt power. x^y

import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        System.out.println("Type to display the value of x raised to the power y without using inbuilt power : ");
        Scanner num1 = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        int x = num1.nextInt();

        System.out.print("Enter exponent (y): ");
        int y = num1.nextInt();     
        int valueOfY=1;  
        for(int i=1;i<=y;i++)
        {
            valueOfY=valueOfY*x;
        }
        System.out.println("answer is " + valueOfY);
    }
}
