public class duplicate {
    public static void main(String[] args) {

        // Original array with possible duplicates
        int arr[] = {1, 2, 3, 4, 2};

        // Store array length
        int n = arr.length;

        // This array will store unique values only (same size as original to be safe)
        int unique[] = new int[n];

        // Index to keep track of how many unique elements we've added
        int index = 0;

        // Loop through each element of original array
        for (int i = 0; i < n; i++) {

            // Assume current element is not duplicate
            boolean isDuplicate = false;

            // Check if current element already exists in 'unique' array
            for (int j = 0; j < index; j++) {
                if (arr[i] == unique[j]) {
                    // If yes, mark it as duplicate and stop checking further
                    isDuplicate = true;
                    break;
                }
            }

            // If it was not a duplicate, add it to the 'unique' array
            if (!isDuplicate) {
                unique[index] = arr[i];
                index++;  // Move to next position for next unique number
            }
        }

        // Print all unique values
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
