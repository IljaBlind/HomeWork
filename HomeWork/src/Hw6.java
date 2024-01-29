import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort 42-1, Hw 6
 * @author Ilja Blind
 * @version 28.01.2024
 */
public class Hw6 {
    public static void main(String[] args) {

        //task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 1 to 3:");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Wrong number!");
        }

        //task 2

        System.out.println("Enter number between 1 to 7:");
        int nn = scanner.nextInt();
        switch (nn) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6,7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Incorrect number!");
        }

        //task 3

        int u = 1;
        while (u <= 10) {
            System.out.println("Task" + u);
            u++;
        }

        //task 4

        int v = 1;
        do {
            v++;
            if (v % 5 == 0) {
                System.out.println(v);
            }
        } while (v <= 100);

        //task 5

        String wassap;
        int counter = 0;
        String request = "Type: Wassap, to end the task.";
        do {
            counter++;
            System.out.println(request);
            wassap = scanner.next();
            request = "Not this time, try again!";
        } while (!wassap.equals("Wassap"));
        String attempt = (counter == 1) ? " attempt" : " attempts";
        System.out.println("Congrats, u did it!");
        System.out.println("You used " + counter + attempt + " to solved it");
    }
}
