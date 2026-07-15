package Level3;

import java.util.Scanner;

public class L9 {
//29. Write a program to display the multiplication table of a number n.

    public static void main(String[] args) {
        System.out.println("Type no. for display the multiplication table of a number n.");
                Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println( num1 +" x "+  i +" = "+num1*i);
                }
        number.close();
    }
    
}
