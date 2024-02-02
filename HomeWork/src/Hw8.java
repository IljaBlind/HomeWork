import java.util.Random;

/**
 * AIT-TR, Java Basic, Cohort 42-1, Hw 8
 * @author Ilja Blind
 * @version 31.01.2024
 */
public class Hw8 {
    public static void main(String[] args) {

        //task 1
        for (int t = 1; t <= 10; t++) {
            System.out.println("Task" + t);
        }

        //task 2
        int[] cs = {66, 22, 45, 34, 93, 12, 23, 50, 70, 15, 5, 7, 95, 85, 55, 25, 99, 30, 67,65};
        for (int i : cs) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        //task 3
        String[] s = {"One", "Two", "Twenty"};
        String max = "";
        for (String str : s) {
            if (str.length() > max.length()) {
                max = str;
            }
        }
        for (char chr : max.toCharArray()) {
            System.out.println(chr);
        }

        //task 4
        Random random = new Random();
        int[] f = new int[100];
        int sum = 0;
        // fill array with random int numbers
        for (int i = 0; i < f.length; i++ ) {
            f[i] = random.nextInt(100);
        }
        int top = f[0];
        int min = f[0];
        for (int i : f) {
            sum += i;
            if ( i > top) {
                top = i;
            }
            if (i < min) {
                min =i;
            }
        }
        System.out.println("Max =" + top + ", min =" + min + ", average =" + (sum / (double) f.length) + " " + (sum / f.length));
    }
}
