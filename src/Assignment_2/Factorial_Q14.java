package Assignment_2;

public class Factorial_Q14 {
    public static void main(String[] args) {

        // Given number
        int n = 10;

        // long is used because factorial values can become very large
        long factorial = 1L;

        for (int i = 1; i <= 10; i++) {

            // Multiply factorial by current value of i
            factorial = factorial * i;
        }

        // Print factorial result
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}

