package Level2;
//11. Write a program to read a number and check whether it is even or odd.

import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        System.out.println("Type a number to check even or odd");
        Scanner num1 = new Scanner(System.in);

        int number=num1.nextInt();
        if(number %2 ==0) System.out.println("Even number");
        else System.out.println("Odd number");
    }
}
