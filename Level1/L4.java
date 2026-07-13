import java.util.Scanner;

public class L4 {
    //Write a program to read the radius of a circle and print its area and circumference.

    public static void main(String[] args) {
        System.out.println("Type radius of a circle to fine area and circumference: ");
        Scanner radius= new Scanner(System.in);
        int number1=radius.nextInt();

        int areaOfCircle= 22/7*(number1*number1);
        int circumference=2*(22/7)*number1;
        System.out.println("Area of circle is: "+areaOfCircle+ " Circumference is: "+ circumference);

    }
}
