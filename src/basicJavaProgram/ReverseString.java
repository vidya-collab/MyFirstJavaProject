package basicJavaProgram;

import java.util.Scanner;

public class ReverseString {

        public static void main(String[] args) {

            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter a string to reverse:");
            String input = s1.nextLine();
            String reversedInput = new StringBuilder(input).reverse().toString();
            System.out.println("Reversed string: " + reversedInput);
            //String str = "Selenium";
            //String reversed = new StringBuilder(str).reverse().toString();
            //System.out.println(reversed); // muineleS
        }
    }



