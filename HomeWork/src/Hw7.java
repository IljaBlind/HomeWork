import java.util.Random;
import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort 42-1, Hw 7
 * @author Ilja Blind
 * @version 31.01.2024
 */
public class Hw7 {
    public static void main(String[] args) {
        //define using classes
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        //define simple variables
        int damageRadius = 10;
        double g = 9.81;
        double difference;
        int angle;
        int speed;
        //distance
        double distance = random.nextInt(1000) + 100;
        do {
            System.out.println("Enter start speed (m/s):");
            speed = scanner.nextInt();
            System.out.println("Enter angle [0..90°]:");
            angle = scanner.nextInt();
            //calculate
            double realDistance = speed * speed * Math.sin(Math.toRadians(angle) * 2) / g;
            difference = distance - realDistance;
            //analise
            if (Math.abs(difference) < damageRadius) {
                System.out.println("You hit the target " + realDistance);
            } else {
                if (difference < 0) {
                    System.out.println("Overshot: " + realDistance);
                } else {
                    System.out.println("Undershoot: " + realDistance + " " + distance);
                }
            }
        } while (Math.abs(difference) > damageRadius);
    }
}