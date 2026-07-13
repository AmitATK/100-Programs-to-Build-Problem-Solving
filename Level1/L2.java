import java.util.Scanner;

public class L2 {

    public static void main(String[] args) {

        System.out.println("Enter two number which you want to add: ");
        @SuppressWarnings("resource")
        Scanner number1 =new Scanner(System.in);
        @SuppressWarnings("resource")
        Scanner number2 =new Scanner(System.in);
        
        
        int sum= number1.nextInt() + number2.nextInt();

        System.out.println("Sum is: "+ sum);
    }
    
}
