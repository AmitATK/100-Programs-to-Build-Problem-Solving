package Level4;

import java.util.Scanner;

//41. Write a program to check whether a number n is a palindrome (reads the same reversed).
public class L9 {
    public static void main(String[] args) {
                System.out.println("Type number non zero at prefix and sufix to check whether a number n is a palindrome (reads the same reversed) ");
        Scanner num1= new Scanner(System.in);
        int number= num1.nextInt();
        int  toCheck=0;
        int checkNumber=number;
        boolean checked=false;
        while(number>0)
        {
            int rem=number%10;
            toCheck=toCheck*10+rem;
            number=number/10;
            if(toCheck ==checkNumber) checked=true;
        }
if(checked) System.out.println("Yes it is palindrome");
else System.out.println("No its not a palindrome");        
    num1.close();  
    }
}
