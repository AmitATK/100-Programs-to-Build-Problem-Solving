package Level5;
//55. Write a program to find the GCD (HCF) of two numbers.

import java.util.Scanner;

public class L12 {
    public static void main(String[] args) {
        System.out.println("Type to count find the GCD (HCF) of two numbers: ");
        Scanner num1 = new Scanner(System.in);
        int number1=num1.nextInt();
        int number2=num1.nextInt();

            while(number2 != 0)
            {
                int rem=number1%number2;
                number1=number2;
                number2=rem;
            }
            System.out.println("GCD of that two number is :" + number1);

    }
}
