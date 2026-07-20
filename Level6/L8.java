package Level6;

import java.util.Scanner;
//64. Write a program to print an inverted right-angled triangle pattern of stars of height n.

public class L8 {
    public static void main(String[] args) {
        System.out.print("Enter the height of the triangle (n): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++)
        {

            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
