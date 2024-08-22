import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double raiseSalary() {
        double totalSalary = monthlySalary * 12;
        totalSalary = totalSalary + (totalSalary * 0.1);
        return totalSalary;
    }
}

 class Expt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee(null, null, 0);
        Employee e2 = new Employee(null, null, 0);

        // Input and setting details for the first employee
        System.out.println("Enter the first name: ");
        String firstName = sc.nextLine();
        e.setFirstName(firstName);

        System.out.println("Enter the last name: ");
        String lastName = sc.nextLine();
        e.setLastName(lastName);

        System.out.println("Enter the monthly salary: ");
        double monthlySalary = sc.nextDouble();
        e.setMonthlySalary(monthlySalary);

        // Clear the newline character left after nextDouble()
        sc.nextLine();

        // Input and setting details for the second employee
        System.out.println("Enter the first name: ");
        String firstName1 = sc.nextLine();
        e2.setFirstName(firstName1);

        System.out.println("Enter the last name: ");
        String lastName1 = sc.nextLine();
        e2.setLastName(lastName1);

        System.out.println("Enter the monthly salary: ");
        double monthlySalary1 = sc.nextDouble();
        e2.setMonthlySalary(monthlySalary1);

        sc.close();

        // Displaying details and raised salary for the first employee
        System.out.println("First Name: " + e.getFirstName() + " Last Name: " + e.getLastName() + " Monthly Salary: " + e.getMonthlySalary());
        System.out.println("Salary after raise is: " + e.raiseSalary());

        System.out.println("------------------------------------------------------------------------------------------");

        // Displaying details and raised salary for the second employee
        System.out.println("First Name: " + e2.getFirstName() + " Last Name: " + e2.getLastName() + " Monthly Salary: " + e2.getMonthlySalary());
        System.out.println("Salary after raise is: " + e2.raiseSalary());
    }
}