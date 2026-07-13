import java.util.Scanner;

public class L10 {
    //10. Write a program to read seconds and convert them into hours, minutes and seconds.

    public static void main(String[] args) {
        System.out.println("Type the seconds so that we can convert it into hours : minutes : seconds :");
            Scanner seconds= new Scanner(System.in);
            int secTime=seconds.nextInt();

            float hours=secTime/3600;
            int min=secTime/60;
            System.out.println("hours: "+hours+" min: "+min);


    }
}
