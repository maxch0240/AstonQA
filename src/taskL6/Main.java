package taskL6;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 39);

        employeesArray[1] = new Employee("John Doe", "Software Engineer",
                "johndoe@mailbox.com", "1234567890", 50000, 30);

        employeesArray[2] = new Employee("Jane Doe", "HR",
                "janedoe@mailbox.com", "0987654321", 40000, 22);

        employeesArray[3] = new Employee("Joe Black", "Product Manager",
                "joeblack@mailbox.com", "123123123123", 1000000, 56);

        employeesArray[4] = new Employee("Jimmy Hardy", "QA",
                "jimmyhardy@mailbox.com", "9999123999", 60000, 31);

        for (Employee employee : employeesArray) {
            employee.displayInfo();
            System.out.println();
        }
    }
}