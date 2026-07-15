package Level3;
//26. Write a program to find the sum of all even numbers from 1 to n.

import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        System.out.println("Write a number to find the sum of all even numbers from 1 to n");
        Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();
        int sum = 0;
        for (int i = 1; i <= num1; i++) {
            if (i% 2 == 0) sum = sum + i;
        }
        System.out.println("sum of natural no, is : " +sum);

        number.close();
    }
}
