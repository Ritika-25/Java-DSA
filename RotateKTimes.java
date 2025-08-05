public class RotateKTimes {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;

        k = k % n; // If k > n, adjust it

        // Step 1: Store first k elements
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift rest elements to the left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Step 3: Put temp[] elements at end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }

        // Print result
        System.out.print("Rotated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
