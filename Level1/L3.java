import java.util.Scanner;

public class L3 {
   // Write a program to read two numbers and print their sum, difference, product and quotient.

   public static void main(String[] args) {
    System.out.println("Type two number for sum, difference, product and quotient: ");
    Scanner number1=new Scanner(System.in);
    Scanner number2=new Scanner(System.in);
    int num1=number1.nextInt();
    int num2=number2.nextInt();
    int sum= num1+ num2;    
    int difference= num1 - num2;    
    int product= num1* num2;    
    int quotient= num1 / num2;    
    System.out.println("Sum is: "+ sum +" Differnece is: "+ difference+ " Product is: "+ product +" quotient is: "+ quotient);
   }
    
}
