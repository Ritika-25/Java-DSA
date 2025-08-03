public class Frequency {
    public static void main(String[] args) {

        // Array with duplicate elements
        int arr[] = {1, 2, 2, 3, 1, 4, 2};

        // Find length of the array
        int n = arr.length;

        // Create a boolean array to mark which elements are already counted
        boolean visited[] = new boolean[n];

        // Outer loop to go through each element of the array
        for (int i = 0; i < n; i++) {

            // If this element is already counted, skip it
            if (visited[i] == true)
                continue;

            // Start counting from 1 (because arr[i] is already found once)
            int count = 1;

            // Inner loop to compare current element with the rest of the array
            for (int j = i + 1; j < n; j++) {

                // If same element is found again
                if (arr[i] == arr[j]) {
                    count++;             // Increase count
                    visited[j] = true;   // Mark as counted
                }
            }

            // Print the frequency of the element
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}
