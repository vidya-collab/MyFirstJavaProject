package basicJavaProgram;

import java.util.Scanner;

public class HelloProgram
{
public static void main(String [] args)

{
    System.out.println("Hello world");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = scanner.nextLine();
    System.out.println("Hello " + name + "!");

    System.out.println("Enter your age");
    int age= scanner.nextInt();
    System.out.println("Hello " + name + ", you are " + age + " years old.");
    
    scanner.close();
}
}
