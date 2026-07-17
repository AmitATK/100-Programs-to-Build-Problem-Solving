package Level5;
//46. Write a program to display the first n prime numbers.

import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
     System.out.println("Type number to display all prime numbers from 1 to n");

        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int count=0;
        int i=0;
            while (number > i) {
                if (isprimefunc(count)) {
                    System.out.print(count+ " ");
                    i++;

                }
                count++;
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
