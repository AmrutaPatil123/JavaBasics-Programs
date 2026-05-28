package Assignment_3;

public class Array_Print_Q3 {
    public static void main(String[] args) {

        // Declare and initialize array
        int[] marks = {85, 92, 67, 78, 55, 90};

        // Loop through array using for loop
        for(int i = 0; i < marks.length; i++) {

            // Print index and corresponding element
            System.out.println("Index " + i + " : " + marks[i]);
        }

        // Print total number of elements
        System.out.println("Total elements: " + marks.length);
    }
}
