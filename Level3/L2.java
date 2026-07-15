package Level3;

import java.util.Scanner;
//22. Write a program to display all natural numbers from 1 to n in reverse order.

public class L2 {
    public static void main(String[] args) {
        System.out.println("Write a number to get print natural number till you want in reverse order");
        Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();

        for(int i=num1;i>=1;i--)
        {
            System.out.println("number is : "+ i);
        }
        number.close();
    }
}
