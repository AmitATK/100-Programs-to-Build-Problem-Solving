package Level5;
//48. Write a program to display all Armstrong numbers from 1 to n.

import java.util.Scanner;


public class L5 {
    public static void main(String[] args) {
                
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        for(int i=1;i<number;i++)
        {
            checkarmstrong(i);

        }
    }

    public static void checkarmstrong(int n)
    {
         int length = (String.valueOf(Math.abs(n)).length()); 
        int ans=0;
        int tempnum=n;
       
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
        if(ans == n)System.out.println("The armstrong number is: " + ans);
    }
}
