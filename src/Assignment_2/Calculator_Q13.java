package Assignment_2;

public class Calculator_Q13 {
    public static void main(String[] args) {

        // Declare two numbers and variable to store result
        int num1 = 20, num2 = 5, result = 0;

        // Operator for calculation
        char operator = '/';

        // Boolean variable to check valid operation
        boolean isvalid = true;


        switch (operator) {

            case '+':

                // Addition
                result = num1 + num2;
                break;

            case '-':

                // Subtraction
                result = num1 - num2;
                break;

            case '*':

                // Multiplication
                result = num1 * num2;
                break;

            case '/':

                // Check division by zero
                if (num2 == 0) {

                    System.out.println("Division by zero not possible as it leads to infinite value");

                    isvalid = false;

                } else {

                    // Division
                    result = num1 / num2;
                }
                break;

            default:

                // Invalid operator case
                System.out.println("Invalid operator");

                isvalid = false;
        }

        // Print result only if operation is valid
        if (isvalid) {

            System.out.println("Result of " + num1 + operator + num2 + " is: " + result);
        }
    }
}

