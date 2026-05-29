package Assignment_2;

public class Multiplication_Table_Q4 {
    public static void main(String[] args) {

        // Variable to store the number
        int n = 7;

        // Variable to store multiplication result
        int mul = 0;

        // Loop from 1 to 12
        for (int i = 1; i <= 12; i++) {

            // Calculate multiplication
            mul = n * i;

            // Print multiplication table in proper format
            System.out.println(n + " x " + i + " = " + mul);
        }
    }
}
