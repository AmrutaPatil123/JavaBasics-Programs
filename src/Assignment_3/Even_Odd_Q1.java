package Assignment_3;

public class Even_Odd_Q1 {
    public static void main(String[] args) {

        // Loop from 1 to 10
        for(int i = 1; i <= 10; i++) {

            // Check even or odd
            if(i % 2 == 0) {
                System.out.println(i + " -> Even");
            }
            else {
                System.out.println(i + " -> Odd");
            }
        }
    }
}
