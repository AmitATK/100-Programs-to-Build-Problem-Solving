package Level2;

import java.util.Scanner;
//14. Write a program to read three numbers and find the smallest among them.

public class L4 {
    public static void main(String[] args) {
        System.out.println("Type three number to find the largest among them");
        Scanner num1 = new Scanner(System.in);
        Scanner num2= new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        int number1= num1.nextInt();
        int number2= num2.nextInt();
        int number3= num3.nextInt();
        if(number1 < number2 && number1<number3) System.out.println(number1+" is Smaller");
        else if(number2 < number1 && number2<number3) System.out.println(number2+" is Smaller");
        else if(number3 < number2 && number3<number2) System.out.println(number3+" is Smaller");
        else System.out.println("All are equal");
    }
}
