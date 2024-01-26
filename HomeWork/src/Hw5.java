import java.util.Random;
import java.util.Scanner;

public class Hw5 {
    /**
     * AIT-TR, Java Basic, Cohort 42-1, Hw 5
     * @author Ilja Blind
     * @version 24.01.2024
     */
    public static void main(String[] args) {

        //task 1

        //task 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1 , 2 or 3):");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("one");
        }else if (number == 2) {
            System.out.println("two");
        }else if (number == 3) {
            System.out.println("three");
        }else {
            System.out.println("Error, wrong number");

            //task 3

            Random random = new Random();
            int n1 = random.nextInt(101);
            int n2 = random.nextInt(101);
            int n3 = random.nextInt(101);
            int n4 = random.nextInt(101);
            System.out.println("Random numbers:" + n1 + "," + n2 + "," + n3 + "," + n4);
            if (n1 > n2 && n1 > n3 && n1 > n4) {
                System.out.println("Maximum number of 4:" + n1);
            }else if (n2 > n1 && n2 > n3 && n2 > n4) {
                System.out.println("Maximum number of 4:" + n2);
            }else if (n3 > n1 && n3 > n2 && n3 > n4) {
                System.out.println("Maximum number of 4:" + n3);
            }else if (n4 > n1 && n4 > n2 && n4 > n3) {
                System.out.println("Maximum number of 4:" + n4);
            }
        }
    }
}