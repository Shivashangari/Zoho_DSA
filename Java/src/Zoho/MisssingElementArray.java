package Zoho;

public class MisssingElementArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int N1 = 5;
        System.out.println("Missing element: " + findMissingElement(arr1, N1)); // Output: 4

        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int N2 = 10;
        System.out.println("Missing element: " + findMissingElement(arr2, N2)); // Output: 9
    }

    public static int findMissingElement(int[] arr, int N) {
        // Calculate the sum of the first N natural numbers
        int expectedSum = N * (N + 1) / 2;

        // Calculate the sum of the elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing element is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }
}
