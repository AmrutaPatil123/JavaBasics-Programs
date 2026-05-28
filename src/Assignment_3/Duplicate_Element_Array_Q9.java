package Assignment_3;

public class Duplicate_Element_Array_Q9 {
    public static void main(String[] args) {

        // Declare and initialize array
        int[] nums = {4, 2, 7, 2, 9, 4, 1, 7, 4};

        // Boolean array to track visited elements
        boolean[] visited = new boolean[nums.length];

        // Outer loop picks each element
        for(int i = 0; i < nums.length; i++) {

            // Skip already visited elements
            if(visited[i] == true) {
                continue;
            }
            // Frequency counter
            int count = 1;

            // Inner loop checks duplicates
            for(int j = i + 1; j < nums.length; j++) {

                // If duplicate element found
                if(nums[i] == nums[j]) {

                    count++;

                    // Mark duplicate index as visited
                    visited[j] = true;
                }
            }

            // Print only duplicate elements
            if(count > 1) {
                System.out.println(nums[i] + " appears " + count + " times (duplicate)");
            }
        }
    }
}

