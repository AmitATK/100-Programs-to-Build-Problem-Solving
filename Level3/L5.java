package Level3;
//25. Write a program to find the sum of all natural numbers from 1 to n.

import java.util.Scanner;

public class L5 {
    public static void main(String[] args) {
        System.out.println("Write a number to get sum of all natural numbers from 1 to n");
        Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();

      System.out.println("sum of natural no, is : "+ num1*(num1+1)/2);

        number.close();
    }
}
