import java.util.Scanner;

public class L8 {
//8. Write a program to read a temperature in Celsius and convert it to Fahrenheit.
    public static void main(String[] args) {
        
        System.out.println("Type Celsius: ");
        Scanner celsius= new Scanner(System.in);
        int c=celsius.nextInt();
        int fahrenheit= (c*9/5)+32;
        System.out.println(fahrenheit);
    }
    
}
