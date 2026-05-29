package Assignment_2;

public class Odd_Nos_Count_Q5 {
    public static void main(String[] args) {

        // Variable to store count of odd numbers
        int count = 0;

        System.out.println("Odd No.s are: ");

        // Loop from 1 to 50
        for (int i = 1; i <= 50; i++) {

            // Check if number is odd
            if (i % 2 != 0) {

                // Print the odd number
                System.out.println(i);

                // Increase odd number count
                count = count + 1;
            }
        }

        // Print total number of odd numbers found
        System.out.println("Total count of odd no.s are: " + count);
    }
}
