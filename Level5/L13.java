package Level5;

import java.util.Scanner;
//56. Write a program to find the LCM of two numbers.
public class L13 {
    public static void main(String[] args) {
        System.out.println("Type to count find the LCM of two numbers:  ");
        Scanner num1 = new Scanner(System.in);
        int number1=num1.nextInt();
        int number2=num1.nextInt();
        int n1=number1;
        int n2=number2;
        while(n2!=0)
        {
            int rem= n1%n2;
            n1=n2;
            n2=rem;
        }

        int lcm=(number1*number2)/n1;
        System.out.println("Lcm of that two number is: "+ lcm);
    }
}
