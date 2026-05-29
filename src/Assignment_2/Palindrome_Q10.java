package Assignment_2;

public class Palindrome_Q10 {
    public static void main(String[] args) {

        // Given number
        int n = 1221;

        // Store original number for comparison later
        int original_value = n;

        // Variable to store reversed number
        int reverse_value = 0;

        for (; n > 0; n = n / 10) {

            // Extract last digit
            int digits = n % 10;

            // Build reversed number
            reverse_value = (reverse_value * 10) + digits;
        }

        // Check if original number and reversed number are same
        if (reverse_value == original_value) {

            System.out.println("Given no is palindrome");

        } else {

            System.out.println("Given no is not palindrome");
        }
    }
}

