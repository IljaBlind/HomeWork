import java.util.Scanner;


public class Hw4 {
    /**
     * AIT-TR, Cohort 42.1, HW 3
     * @author Ilja Blind
     * @version 24.01-2024
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String a = scanner.next();
        System.out.println("Enter your Surname:");
        String b = scanner.next();
        System.out.println("Enter your Age:");
        int c = scanner.nextInt();
        System.out.println("Enter your Height:");
        int d = scanner.nextInt();
        System.out.println("Enter your City");
        String e = scanner.next();
        System.out.println("My name is" + " "+ a + " "+ b +", " + " i´m " + c + "y.o.," + "my height is" + " " + d + " cm," + "i´m from" + " " + e);
    }
}
