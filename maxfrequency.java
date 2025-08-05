public  class maxfrequency {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 1, 1};
        int n = arr.length;

        int maxFreq = 0;       // To store highest frequency
        int mostFreqElem = -1; // To store element with highest frequency

        for (int i = 0; i < n; i++) {
            int count = 0;

            // Count how many times arr[i] appears
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Update if current element has more frequency
            if (count > maxFreq) {
                maxFreq = count;
                mostFreqElem = arr[i];
            }
        }

        System.out.println("Element with highest frequency: " + mostFreqElem);
        System.out.println("Frequency: " + maxFreq);
    }
}
