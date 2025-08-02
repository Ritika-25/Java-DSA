public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // Add each element to sum
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
