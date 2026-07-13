import java.util.Scanner;

class L5{
    //5. Write a program to read the length and breadth of a rectangle and print its area and perimeter.

    public static void main(String[] args) {
               System.out.println("Type Lemgth and breadth of a rectangle: ");
        Scanner length= new Scanner(System.in);
        Scanner breadth= new Scanner(System.in);
        int l=length.nextInt();
        int b=breadth.nextInt();
        int area= l* b;
        int perimeter=2*(l+b);
        System.out.println("Area of rect.: " +area + " Perimeter: "+ perimeter);
    }
}