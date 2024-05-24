package taskL6;

public class Employee {
    private String fullName;

    private String jobTitle;

    private String email;

    private String phone;

    private int salary;

    private int age;

    public Employee(String fullName, String jobTitle, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Full name: " + this.fullName);
        System.out.println("Job title: " + this.jobTitle);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Salary: " + this.salary);
        System.out.println("Age: " + this.age);
    }
}
