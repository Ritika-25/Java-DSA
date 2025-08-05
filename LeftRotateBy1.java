public class LeftRotateBy1 {
    public static void main(String[] args) {
        // Original array
        int[] arr = {1, 2, 3, 4, 5};

        // Step 1: Store the first element separately
        int first = arr[0];

        // Step 2: Shift each element to the left by 1
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];  // Move element from right to left
        }

        // Step 3: Put the first element at the last index
        arr[arr.length - 1] = first;

        // Step 4: Print the array using normal for loop
        System.out.print("Array after left rotation by 1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
