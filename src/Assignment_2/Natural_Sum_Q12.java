package Assignment_2;

public class Natural_Sum_Q12 {
    public static void main(String[] args) {

        // Variable to store sum
        int sum = 0;

        // Number till which natural numbers are added
        int n = 100;

        for (int i = 1; i <= n; i++) {

            sum = sum + i;
        }

        // Print the total sum
        System.out.println("Sum of first " + n + " natural numbers are: " + sum);

        // Check whether sum is even or odd
        if (sum % 2 == 0) {

            System.out.println("Sum is even");

        } else {

            System.out.println("Sum is odd");
        }
    }
}

