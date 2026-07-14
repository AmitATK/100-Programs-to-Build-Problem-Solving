package Level2;

import java.util.Scanner;

//17. Write a program to read a character and check whether it is an alphabet, digit or special symbol
public class L7 {
  public static void main(String[] args) {
           System.out.println("Type a character and check whether it is an alphabet, digit or special symbol");
        Scanner c = new Scanner(System.in);
        char ch = c.next().charAt(0);
    if(ch >='a' && ch<='z' ||  ch>='A' && ch<='Z') System.out.println("Alphabet");
    else if(ch >='0' && ch<='9') System.out.println("Digit0");
    else System.out.println("Its symbol");
        c.close();
        
  }  
}
