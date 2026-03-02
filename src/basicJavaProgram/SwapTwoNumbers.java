package basicJavaProgram;

public class SwapTwoNumbers {

    int a ,b ,c;
    public void swapTwoNumbers(int a, int b){
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping logic
        c = a; // Store the value of a in c
        a = b; // Assign the value of b to a
        b = c; // Assign the value of c (original a) to b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        SwapTwoNumbers swap = new SwapTwoNumbers();
        swap.swapTwoNumbers(5, 10);
    }

}
