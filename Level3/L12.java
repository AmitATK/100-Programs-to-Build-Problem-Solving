package Level3;

import java.util.Scanner;

public class L12 {
// 32. Write a program to display all numbers from 1 to n that are divisible by 3 or 5.
    public static void main(String[] args) {
        System.out.println("Type no. to display all numbers from 1 to n that are divisible by 3 or 5.");
        Scanner number = new Scanner(System.in);
        int m = number.nextInt();
        for (int i = 1; i <= m; i++) {
            if (i%3 ==0 && i%5==0) {
            System.out.println("Divisible by 3 and 5 is : "+i);
            }
        }
    }
}
