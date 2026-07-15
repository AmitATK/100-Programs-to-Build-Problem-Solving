package Level4;

import java.util.Scanner;
//40. Write a program to count the number of even digits and odd digits in a number n.

public class L8 {
    public static void main(String[] args) {
        System.out.println("Type  to count the number of even digits and odd digits in a number n.");
        Scanner num1= new Scanner(System.in);
        int number= num1.nextInt();
        int odd=0;
        int even=0;
        while(number>0)
        {
            int rem=number%10;
            if(rem %2 ==0) even++;
            else if (rem%2 !=0) odd++;
            number=number/10;
        }
        System.out.println(" the number of even digits and odd digits in a number n is . :"+ "even: "+ even +" " + "odd: " + odd);
        
    num1.close();  
    }
}
