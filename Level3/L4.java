package Level3;

import java.util.Scanner;
//24. Write a program to display all odd numbers from 1 to n.
public class L4 {
    public static void main(String[] args) {
                 System.out.println("Write a number to display all even numbers from 1 to n");
        Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();

        for(int i=1;i<=num1;i++)
        {
            if(i%2 !=0) System.out.println("Odd number is : "+ i);
        }

        number.close();
    }
}
