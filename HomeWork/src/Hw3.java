public class Hw3 {
    /**
     * AIT-TR, Java Basic, Cohort 42.1, HW-3
     * @author Ilja Blind
     * @version 24.01.2024
     */
    public static void main(String[] args) {

        //task 1

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int i = 8;
        int j = 9;
        int k = a + b + c + d + e + f + g + h + i + j;
        double y = 10;
        System.out.println(k/y);

        //task 2

        int itemA = 1000;
        int itemB = 500;
        int discount = 10;
        System.out.println( "Discount:" + (itemA + itemB) / discount);
        int sale = 150;
        System.out.println("Result:" + (itemA + itemB - sale));

        //task 3

        int s = 4;
        int m = 7;
        int tu = 8;
        int w = 5;
        int th = 3;
        int fr = 9;
        int sa = 7;
        int day = s + m + tu + w + th + fr + sa;
        int all = 7;
        System.out.println("average temperature:" + (day / all));

        //task 4

        int num1 = 33;
        int num2 = 66;
        System.out.println();

        //task 5

        int x = 3;
        x += x++;
        System.out.println(x);

    }
}
