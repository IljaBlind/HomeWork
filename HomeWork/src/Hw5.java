import java.util.Random;
import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort 42-1, Hw 5
 * @author Ilja Blind
 * @version 24.01.2024
 */
public class Hw5 {
    public static void main(String[] args) {

        //task 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");
        int nn1 = scanner.nextInt();
        System.out.println("Second number:");
        int nn2 = scanner.nextInt();
        boolean a1 = nn1 % 2 == 0;
        boolean a2 = nn2 % 2 == 0;
        boolean b1 = nn1 % 3 == 0;
        boolean b2 = nn2 % 3 == 0;
        boolean c1 = a1 && b1;
        boolean c2 = a2 && b2;
        System.out.println("number:" + nn1 + "even: " + a1 + ";" + "multiple 3:" + b1 + ";" + "even and multiple 3:" + c1);
        System.out.println("number:" + nn2 + "even: " + a2 + ";" + "multiple 3:" + b2 + ";" + "even and multiple 3:" + c2);

        //task 2

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

            }
        }
    }
