package Assignment_2;

public class Number_Classifier_Q15 {
    public static void main(String[] args) {

        // Declare 10 integer values
        int n1 = -5, n2 = 12, n3 = 0, n4 = -3, n5 = 8;
        int n6 = 0, n7 = 15, n8 = -9, n9 = 4, n10 = 0;

        // Variable used to store current number
        int num = 0;

        // Counters for positive, negative and zero numbers
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        for (int i = 1; i <= 10; i++) {

            switch (i) {

                case 1:
                    num = n1;
                    break;

                case 2:
                    num = n2;
                    break;

                case 3:
                    num = n3;
                    break;

                case 4:
                    num = n4;
                    break;

                case 5:
                    num = n5;
                    break;

                case 6:
                    num = n6;
                    break;

                case 7:
                    num = n7;
                    break;

                case 8:
                    num = n8;
                    break;

                case 9:
                    num = n9;
                    break;

                case 10:
                    num = n10;
                    break;
            }

            // Check whether number is positive
            if (num > 0) {

                positiveCount++;

            }
            // Check whether number is negative
            else if (num < 0) {

                negativeCount++;

            }
            // Otherwise number is zero
            else {

                zeroCount++;
            }
        }

        // Print final counts
        System.out.println("Positive number count is: " + positiveCount);
        System.out.println("Negative number count is: " + negativeCount);
        System.out.println("Zero number count is: " + zeroCount);
    }

}
