package Assignment_2;

public class Day_Name_Q7 {
    public static void main(String[] args) {

        // Variable to store day number (1 to 7)
        int day = 4;

        // Switch statement to print day name based on number
        switch (day) {

            case 1:
                System.out.println("1 = Monday");
                break;

            case 2:
                System.out.println("2 = Tuesday");
                break;

            case 3:
                System.out.println("3 = Wednesday");
                break;

            case 4:
                System.out.println("4 = Thursday");
                break;

            case 5:
                System.out.println("5 = Friday");
                break;

            case 6:
                System.out.println("6 = Saturday");
                break;

            case 7:
                System.out.println("7 = Sunday");
                break;

            // If number is not between 1 and 7
            default:
                System.out.println("Invalid Day");
        }
    }
}

