import java.util.Random;
import java.util.Arrays;
/**
 * AIT-TR, Java Basic, Cohort 42-1, Hw 13
 * @author Ilja Blind
 * @version 13.01.2024
 */
public class Hw13 {
    public static void main(String[] args) {
        int size = 100_000; // Change this to 100_000_000 to measure the time for a larger array

        // Create an array of random integers
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size);
        }

        // Measure the time for a linear search
        long startTime = System.currentTimeMillis();
        int linearSearchResult = linearSearch(arr, size / 2);
        long linearSearchTime = System.currentTimeMillis() - startTime;
        System.out.println("Linear search time: " + linearSearchTime + " milliseconds");

        // Measure the time for sorting the array
        startTime = System.currentTimeMillis();
        Arrays.sort(arr);
        long sortTime = System.currentTimeMillis() - startTime;
        System.out.println("Sort time: " + sortTime + " milliseconds");

        // Measure the time for a binary search
        startTime = System.currentTimeMillis();
        int binarySearchResult = binarySearch(arr, size / 2);
        long binarySearchTime = System.currentTimeMillis() - startTime;
        System.out.println("Binary search time: " + binarySearchTime + " milliseconds");

        System.out.println("Linear search result: " + linearSearchResult);
        System.out.println("Binary search result: " + binarySearchResult);
    }

        // Perform a linear search for the given value in the given array
    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                    return i;
            }
        }
        return -1;
    }

        // Perform a binary search for the given value in the given array
     public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}