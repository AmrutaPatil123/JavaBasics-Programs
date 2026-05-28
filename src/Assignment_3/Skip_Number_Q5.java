package Assignment_3;

public class Skip_Number_Q5 {
    public static void main(String[] args) {

        // Loop from 1 to 10
        for(int i = 1; i <= 10; i++) {

            // Skip number 5
            if(i == 5) {
                continue;
            }

            // Print remaining numbers
            System.out.print(i + " ");
        }
    }
}
