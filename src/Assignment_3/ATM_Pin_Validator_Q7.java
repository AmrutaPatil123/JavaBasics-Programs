package Assignment_3;

public class ATM_Pin_Validator_Q7 {
    public static void main(String[] args) {

        // Correct ATM PIN
        int correctPin = 4521;

        // Simulated PIN entries
        int pin1 = 1234;
        int pin2 = 0000;
        int pin3 = 4521;

        // Attempt counter
        int attempt = 1;

        // while loop for maximum 3 attempts
        while(attempt <= 3) {

            // Variable to store entered PIN
            int enteredPin = 0;

            // Assign PIN based on current attempt
            if(attempt == 1) {
                enteredPin = pin1;
            }
            else if(attempt == 2) {
                enteredPin = pin2;
            }
            else {
                enteredPin = pin3;
            }

            // Check if entered PIN is correct
            if(enteredPin == correctPin) {

                System.out.println("Access Granted. Welcome!");

                // Exit loop immediately
                break;
            }

            // Increment attempt before printing remaining attempts
            attempt++;

            // Print incorrect PIN message
            System.out.println("Incorrect PIN. " + (3 - attempt + 1) + " attempt(s) remaining.");
        }

        // If all 3 attempts fail
        if(attempt > 3) {
            System.out.println("Card Blocked. Contact your bank.");
        }
    }
}
