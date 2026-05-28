package Assignment_3;

public class Sum_Q2 {
    public static void main(String[] args) {

        // Declare variables
        int i = 1;
        int sum = 0;

        // While loop to add numbers from 1 to 20
        while(i <= 20) {

            // Add current value of i to sum
            sum = sum + i;

            // Increment i
            i++;
        }

        // Print final sum
        System.out.println("Sum of 1 to 20 = " + sum);
    }
}