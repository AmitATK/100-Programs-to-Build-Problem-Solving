package Level6;

import java.util.Scanner;
//67. Write a program to print Pascal's triangle for n rows.

public class L11 {
    public static void main(String[] args) {
        System.out.print("Enter the height of the triangle (n): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            int num=1;

            for(int k=0;k<=i;k++)
            {
                System.out.print(num+" ");
                num=num*(i-k)/(k+1);
            }

            System.out.println();
        }
    }
}
