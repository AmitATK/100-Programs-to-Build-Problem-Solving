package Level5;
//45. Write a program to display all prime numbers from 1 to n.

import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        System.out.println("Type number to display all prime numbers from 1 to n");

        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
            for (int i = 1; i <= number; i++) {
                if (isprimefunc(i)) {
                    System.out.println(i);
                }
            }

    }

    public static boolean isprimefunc(int j) {
        if(j<=1) return false;
        if(j==2) return true;
        if(j%2==0) return false;
        for (int i = 3; i * i <= j; i += 2) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }

}
