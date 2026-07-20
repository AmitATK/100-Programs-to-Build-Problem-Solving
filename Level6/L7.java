package Level6;
//63. Write a program to print a right-angled triangle pattern of stars of height n.

import java.util.Scanner;

public class L7 {
    public static void main(String[] args) {
        System.out.print("Enter the height of the triangle (n): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
