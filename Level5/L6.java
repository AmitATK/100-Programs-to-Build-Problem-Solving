package Level5;
//49. Write a program to check whether a number is a perfect number.

import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        System.out.println("Type  to check whether a number is a perfect number: ");
                Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int sum=0;
        for(int i=1;i<number;i++)
        {
            if(number%i ==0) sum=sum+i;

        }

        if(sum ==number && number>0) System.out.println("Perfect number"+ sum);
        else System.out.println("not perfect sum");
    }
}
