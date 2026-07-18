package Level5;

import java.util.Scanner;

//50. Write a program to check whether a number is a strong number (sum of factorials of its digits).
public class L7 {
    public static void main(String[] args) {
         System.out.println("Type  to check whether a number is a Strong number: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int tempnumber=number;
        int strongNumber=0;
        while(tempnumber>0)
        {
            int factorial=1;
            int rem=tempnumber%10;
            for(int i=1;i<=rem;i++)
            {
                factorial=factorial*i;
            }
            strongNumber=strongNumber+factorial;
            tempnumber=tempnumber/10;
        }
        if(strongNumber == number) System.out.println( "It strong number: "+strongNumber);
        else System.out.println("Not strong number");
    }
}
