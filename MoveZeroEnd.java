public class MoveZeroEnd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 3, 4, 0, 0, 5, 1};
        int n = arr.length;

        int temp[] = new int[n]; // create a temporary array of same size
        int index = 0; // index to store non-zero elements in temp[]

        // Step 1: Copy all non-zero elements to temp[]
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i]; // put non-zero at current index
                index++; // move index to next position
            }
        }

        // Step 2: Fill the rest of temp[] with zeros
        while (index < n) {
            temp[index] = 0;
            index++;
        }

        // Step 3: Copy temp[] back to arr[]
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        // Step 4: Print result
        System.out.print("Result (Brute Force): ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
