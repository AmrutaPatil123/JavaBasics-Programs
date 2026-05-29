package Assignment_2;

public class Largest_No_Q11 {

    public static void main(String[] args) {

        // Declare three numbers
        int a = 54, b = 89, c = 73;


        if (a > b) {

            // Check if a is greater than c
            if (a > c) {

                System.out.println(a + " is largest no. among all three");
            }

        } else if (b > a) {

            // Check if b is greater than c
            if (b > c) {

                System.out.println(b + " is largest no. among all three");
            }

        } else {

            // If neither a nor b is largest, then c is largest
            System.out.println(c + " is largest no. among all three");
        }
    }
}

