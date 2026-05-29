package Assignment_2;

public class Swap_Variable_Q1 {

        public static void main(String[] args) {

            // Declare and initialize variables
            int a = 45;
            int b = 78;

            // Print values before swapping
            System.out.println("Before Swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            // Swap without using third variable
            a = a + b; // a becomes sum of a and b
            b = a - b; // b becomes original value of a
            a = a - b; // a becomes original value of b

            // Print values after swapping
            System.out.println("After Swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }

