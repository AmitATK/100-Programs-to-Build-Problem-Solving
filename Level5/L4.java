package Level5;
//47. Write a program to check whether a number is an Armstrong number.

import java.util.Scanner;

public class L4 {
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        int length = (String.valueOf(Math.abs(number)).length()); 
        int ans=0;
        int tempnum=number;
       
        while(tempnum>0)
        {
            int rem = tempnum%10;
             int sq=1;
            for(int i=0;i<length;i++)
            {
                sq=sq*rem;
            }
            ans=ans+sq;
            tempnum=tempnum/10;
        }
        if(ans == number) 
        {
            System.out.println("It is armstrong: " + ans);
        }
        else{
            System.out.println("Not armstrong");
        }
   }
}
