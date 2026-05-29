package Assignment_2;

public class Digital_Sum_Q2 {

    public static void main(String[] args) {

        // Initialize number
        int n = 4567;

        // Variable to store sum
        int sum = 0;

        // Variable to store extracted digit
        int r = 0;

        // Extract digits and calculate sum
        while (n != 0) {
            r = n % 10;      // Get last digit
            n = n / 10;      // Remove last digit
            sum = sum + r;   // Add digit to sum
        }

        // Print final result
        System.out.println("Sum of digits = " + sum);
    }
}