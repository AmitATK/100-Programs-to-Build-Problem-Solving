public class L7 {
    //7. Write a program to swap two numbers without using a third variable.

    public static void main(String[] args) {
        int value1=10;
        int value2=5;
        value1 = value2+value1;
        value2= value1-value2;
        value1 =value1-value2;
        System.out.println("swap value is: "+ value1 +" "+ value2);
    }
}
