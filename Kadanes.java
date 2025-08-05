public class Kadanes {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;  // Initialize to the smallest possible value

        // Loop for start index of subarray
        for (int i = 0; i < n; i++) {
            // Loop for end index of subarray
            for (int j = i; j < n; j++) {
                int sum = 0;

                // Loop to calculate sum of subarray from i to j
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                // Update maxSum if needed
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum : " + maxSum);
    }
}
