package Level5;

import java.util.Scanner;

//52. Write a program to check whether a number is a Harshad (Niven) number.

public class L9 {
    public static void main(String[] args) {
        System.out.println("Type  to check whether a  number is a Harshad (Niven) number.: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int tempnumber=number;
        int sum=0;
        while(tempnumber>0)
        {
            int rem= tempnumber%10;
             sum=sum+rem;
            tempnumber=tempnumber/10;
        }
        if(number %sum==0)
            System.out.println("Yes this is Harshad number :"+ number);

        else System.out.println("Not a Harshad Number");
    }
}
