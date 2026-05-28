package Assignment_3;

public class FizzBuzzCounter_Q6 {

    public static void main(String[] args) {

        // Counter variable to count FizzBuzz occurrences
        int count = 0;

        // for loop from 1 to 50
        for(int i = 1; i <= 50; i++) {

            // Check divisible by both 3 and 5 first
            if(i % 3 == 0 && i % 5 == 0) {

                System.out.print("FizzBuzz ");

                // Increase counter
                count++;
            }

            // Check divisible by 3 only
            else if(i % 3 == 0) {

                System.out.print("Fizz ");
            }

            // Check divisible by 5 only
            else if(i % 5 == 0) {

                System.out.print("Buzz ");
            }

            // Print number otherwise
            else {

                System.out.print(i + " ");
            }
        }

        // Print total FizzBuzz count
        System.out.println("\nFizzBuzz count: " + count);
    }
}
