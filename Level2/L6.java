package Level2;

import java.util.Scanner;

//16. Write a program to read a character and check whether it is a vowel or a consonant.

public class L6 {
    public static void main(String[] args) {
        System.out.println("Type a character and check whether it is a vowel or a consonant");
        Scanner c = new Scanner(System.in);
        char ch = c.next().charAt(0);

        c.close();
        if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u') System.out.println("vowel");
        else System.out.println("consonant");

    }
}
