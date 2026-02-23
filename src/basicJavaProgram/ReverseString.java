package basicJavaProgram;

public class ReverseString {

        public static void main(String[] args) {
            String str = "Selenium";
            String reversed = new StringBuilder(str).reverse().toString();
            System.out.println(reversed); // muineleS
        }
    }

