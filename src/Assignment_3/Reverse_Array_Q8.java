package Assignment_3;

public class Reverse_Array_Q8 {
    public static void main(String[] args) {

        // Declare and initialize array
        int[] arr = {10, 25, 38, 47, 56, 62, 71};

        // Temporary variable for swapping
        int temp;

        // Print original array
        System.out.print("Original : ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Reverse array in-place
        for(int i = 0; i < arr.length / 2; i++) {

            // Swap elements
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Print reversed array
        System.out.print("Reversed : ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
