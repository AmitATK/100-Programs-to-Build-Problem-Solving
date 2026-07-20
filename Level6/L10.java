package Level6;
//66. Write a program to print a number triangle (row i contains numbers 1 to i).

import java.util.Scanner;

public class L10 {
    public static void main(String[] args) {
    
        System.out.print("Enter the height of the triangle (n): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");

            }

            System.out.println();
        }
}
}
