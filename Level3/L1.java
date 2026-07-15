package Level3;

import java.util.Scanner;
//21. Write a program to display all the natural numbers from 1 to n. (n is user input)

public class L1 {
    public static void main(String[] args) {
             System.out.println("Write a number to get print natural number till you want");
        Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();

        for(int i=1;i<=num1;i++)
        {
            System.out.println("number is : "+ i);
        }
        number.close();

    }
}
