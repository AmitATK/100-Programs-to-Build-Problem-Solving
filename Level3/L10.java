package Level3;

import java.util.Scanner;
//30. Write a program to display all multiples of a number m up to n terms.

public class L10 {
    public static void main(String[] args) {
                System.out.println("Type no. to display all multiples of a number m up to n terms.");
                Scanner number = new Scanner(System.in);
                Scanner number1 = new Scanner(System.in);

                int m = number.nextInt();
                int n= number1.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println( m*i);
                }
        number.close();
    }
}
