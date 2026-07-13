public class L6 {
    //6. Write a program to swap two numbers using a third variable.

    public static void main(String[] args) {
        int value1=5;
        int value2=6;
        int tempValue;

        System.out.println("Before value is: " + value1+" "+ value2);
        tempValue=value1;
        value1=value2;
        value2=tempValue;
        System.out.println("After value is: " + value1+" "+ value2);

    }
}
