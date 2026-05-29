package Assignment_2;

public class Bitwise_EvenOdd_Check_Q8 {
    public static void main(String[] args) {

        // Given number
        int n = 29;
        if ((n & 1) == 1) {
            // If last bit is 1 → number is odd
            System.out.println(n + " is Odd");
        } else {
            // If last bit is 0 → number is even
            System.out.println(n + " is Even");
        }
        /*
         Using Bitwise AND operator to check even or odd:
         - Numbers are stored in binary form
         - The last bit decides even or odd

         - Even numbers end with 0 in binary
         - Odd numbers end with 1 in binary

         - Expression: (n & 1)
           → checks only the last bit of n
        */
    }

}
