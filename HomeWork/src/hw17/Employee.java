package hw17;

public class Employee {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    double salary;
    int age;

    public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public boolean isOlderThan40() {
        return age > 40;
    }

        @Override
    public String toString() {
        return "Employee{" +
               "fullName='" + fullName + '\'' +
               ", position='" + position + '\'' +
               ", email='" + email + '\'' +
               ", phoneNumber='" + phoneNumber + '\'' +
               ", salary=" + salary +
               ", age=" + age +
               '}';
    }
}

