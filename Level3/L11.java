package Level3;

import java.util.Scanner;

public class L11 {
    //31. Write a program to count how many numbers from 1 to n are divisible by 3.
    public static void main(String[] args) {
        System.out.println("Type no. to count how many numbers from 1 to n are divisible by 3.");
        Scanner number = new Scanner(System.in);
        int m = number.nextInt();
        for (int i = 1; i <= m; i++) {
            if (i%3 ==0) {
            System.out.println("Divisible by 3 is : "+i);
            }
        }
        number.close();
    }
}
