package Assignment_2;

public class No_Pattern_Q6 {
    public static void main(String[] args) {

        // Number of rows for the pattern
        int n = 5;

        // Outer loop controls rows
        for (int i = 1; i <= n; i++) {

            // Inner loop controls columns (printing numbers in each row)
            for (int j = 1; j <= i; j++) {

                // Print number with space (incremental pattern)
                System.out.print(j + " ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}

