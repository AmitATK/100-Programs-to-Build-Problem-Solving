package Level6;

import java.util.Scanner;
//65. Write a program to print a pyramid pattern of stars of height n.

public class L9 {
    public static void main(String[] args) {
                System.out.print("Enter the height of the triangle (n): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++)
        {

            for(int j=i;j<=n-1;j++)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
