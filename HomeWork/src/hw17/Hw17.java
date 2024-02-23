package hw17;
/**
 * AIT-TR, Java Basic, Cohort 42-1, Hw 17
 * @author Ilja Blind
 * @version 23.02.2024
 */
public class Hw17 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Johny Depp", "Software Engineer", "john.depp@example.com", "+1234567890", 50000, 45),
                new Employee("Clark Kent", "Project Manager", "clark.kent@example.com", "+2345678901", 60000, 35),
                new Employee("Mike Wazovski", "QA Engineer", "mike.wazovski@example.com", "+3456789012", 55000, 42),
                new Employee("Baba Lida", "Data Analyst", "baba.lida@example.com", "+4567890123", 65000, 50),
                new Employee("Sergey Iryupin", "Backend Engineer", "sergey.iryupin@example.com", "+5678901234", 70000, 38)
        };

        System.out.println("Employees older than 40 years:");
        for (Employee employee : employees) {
            if (employee.isOlderThan40()) {
                System.out.println(employee);
            }
        }
    }
}
