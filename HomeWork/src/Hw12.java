/**
 * AIT-TR, Java Basic, Cohort 42-1, Hw 12
 * @author Ilja Blind
 * @version 13.01.2024
 */
public class Hw12 {
    public static void main(String[] args) {
        //task 1
        int p = linearSearch(new int[]{1, 8, 12, -4, 6, 3, 7, -3}, 6);
        System.out.println(p);
    }

    static int linearSearch(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // target not found
    }
}
