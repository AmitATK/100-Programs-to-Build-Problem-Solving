package Level2;

import java.util.Scanner;

public class L9 {
    // 19. Write a program to read a number and check whether it is divisible by
    // both 3 and 5
    public static void main(String[] args) {
        System.out.println("Write number and check whether it is divisible by both 3 and 5");
        Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();
        if (num1 % 3 == 0 && num1 % 5 == 0)
            System.out.println("It is divisible by 3 and 5 both");
        else
            System.out.println("Not divisible by 3 and 5");

        number.close();

    }
}
