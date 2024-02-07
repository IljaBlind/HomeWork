import java.util.Arrays;

/**
 * AIT-TR, Java Basic, Cohort 42-1, Hw 9
 * @author Ilja Blind
 * @version 05.02.2024
 */
public class Hw9 {
    public static void main(String[] args) {
        int[] safari = {1, 2, 3, 4, 5};

        //task1
        task1(5);

        //task2
        inversionArray(safari);

        //task3
        cloneArray(safari, false);
        cloneArray(safari, true);

        //task4
        System.out.println(Arrays.toString(findArray(safari)));
    }


    static void task1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Task" + i);
        }
    }


    static void inversionArray(int [] a) {
        for (int i = a.length - 1; i > -1; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void cloneArray(int [] a, boolean reverse) {
        if (reverse) {
            inversionArray(a);
        } else {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static double[] findArray(int[] a) {
        int top = a[0];
        int min = a[0];
        double average = 0;
        for (int i : a) {
            average += i;
            if (i > top) {
                top = i;
            }
            if (i < min) {
                min = i;
            }
        }
        double[] result = {top, min, average / a.length};
        return result;
    }
}