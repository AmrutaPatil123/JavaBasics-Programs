package Assignment_2;

public class Grade_Classifier_Q3 {
    public static void main(String[] args) {

        // Variable to store student's marks
        int marks = 32;

        // Check grade according to marks
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: O (Outstanding)");
        }
        else if (marks >= 75 && marks <= 89) {
            System.out.println("Grade: A");
        }
        else if (marks >= 60 && marks <= 74) {
            System.out.println("Grade: B");
        }
        else if (marks >= 45 && marks <= 59) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: Fail");
        }
    }
}


