import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class Person {
    String name;
    String birthdate;
    double height;
    double weight;
    String address;

    public Person(String name, String birthdate, double height, double weight, String address) {
        this.name = name;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }

    public int calculateAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(birthdate, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}

class Student extends Person {
    int rollno;
    double[] marks;

    public Student(String name, String birthdate, double height, double weight, String address, int rollno, double[] marks) {
        super(name, birthdate, height, weight, address);
        this.rollno = rollno;
        this.marks = marks;
    }

    public double calculateAvg() {
        if (marks == null || marks.length == 0) return 0;
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}

class Employee extends Person {
    int empid;
    double salary;

    public Employee(String name, String birthdate, double height, double weight, String address, int empid, double salary) {
        super(name, birthdate, height, weight, address);
        this.empid = empid;
        this.salary = salary;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details:");

        System.out.println("Name:");
        String studentName = scanner.nextLine();

        System.out.println("Birthdate (yyyy-MM-dd):");
        String studentBirthdate = scanner.nextLine();

        System.out.println("Height:");
        Double studentHeight = scanner.nextDouble();

        System.out.println("Weight:");
        Double studentWeight = scanner.nextDouble();

        System.out.println("Rollno:");
        int studentRollno = scanner.nextInt();

        System.out.println("Address:");
        String studentAddress = scanner.nextLine();

        System.out.println("Marks :");
        String[] marksStr = scanner.nextLine();
        double[] studentMarks = new double[marksStr.length];
        for (int i = 0; i < marksStr.length; i++) 
	  {
            studentMarks[i] = Double.parseDouble(marksStr[i].trim());
        }

        Student student = new Student(studentName, studentBirthdate, studentHeight, studentWeight, studentAddress, studentRollno, studentMarks);

        System.out.println("\nStudent Name: " + student.name);
        System.out.println("Student Age: " + student.calculateAge());
        System.out.println("Student Average Marks: " + student.calculateAvg());

       
        System.out.println("\nEnter employee details:");

        System.out.println("Name:");
        String employeeName = scanner.nextLine();

        System.out.println("Birthdate (yyyy-MM-dd):");
        String employeeBirthdate = scanner.nextLine();

        System.out.println("Height:");
        Double employeeHeight = scanner.nextDouble();

        System.out.println("Weight:");
        Double employeeWeight = scanner.nextDouble();

        System.out.println("Address:");
        String employeeAddress = scanner.nextLine();

        System.out.println("Empid:");
        int employeeEmpid = scanner.nextInt();

        System.out.println("Salary:");
        double employeeSalary = scanner.nextDouble();

        Employee employee = new Employee(employeeName, employeeBirthdate, employeeHeight, employeeWeight, employeeAddress, employeeEmpid, employeeSalary);

        System.out.println("\nEmployee Name: " + employee.name);
        System.out.println("Employee Age: " + employee.calculateAge());
    }
}
