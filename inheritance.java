import java.util.Scanner;
class Person
{
	String name;
	String birthdate;
	double height;
	double weight;
	String address;

public Person(String name,String birthdate,double height,double weight,String address)
{
	this.name = name;
	this.birthdate = birthdate;
	this.height = height;
	this.weight = weight;
	this.address = address;
}
public int calculateAge()
{	
	
}

}
class Student extends Person {
	int rollno;
	double[]marks;

public Student(String name,String birthdate,double height,double weight,String address,int rollno,double[]marks)
	{
		super(name,birthdate,height,weight,address);
		this.rollno = rollno;
		this.marks = marks;
	}
public double calculateAvg()
{

}

}
class Employee extends Person {
	int empid;
	double salary;

public Employee(String name,String birthdate,double height,double weight,String address,int empid,double salary)
	{
		super(name,birthdate,height,weight,address);
		this.empid = empid;
		this.salary = salary;
	}
}
public class Main{
	public static void main(String args[])
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter student details :");

	System.out.println("Name :");
	String studentname = scanner.nextLine();

	System.out.println("birthdate(yyyy-mm-dd) :");
	String studentbirthdate = scanner.nextLine();

	System.out.println("Height :");
	String studentheight = scanner.nextLine();

	System.out.println("Weight :");
	String studentweight = scanner.nextLine();

	System.out.println("Rollno :");
	String studentrollno = scanner.nextLine();

	System.out.println("Address :");
	String studentaddress = scanner.nextLine();

	System.out.println("Marks :");
	String studentmarks = scanner.nextLine();

	Student student = new Student(String name,String birthdate,double height,double weight,String address,int rollno,double[]marks);
 
	System.out.println("\n Student Name :" + student.name);
	System.out.println("\n Student Age :" + student.calculateAge());
	System.out.println("\n Student Average Marks :" + student.calculateAvg());

	System.out.println("Enter employee details :");

	System.out.println("Name :");
	String studentname = scanner.nextLine();

	System.out.println("birthdate(yyyy-mm-dd) :");
	String studentbirthdate = scanner.nextLine();

	System.out.println("Height :");
	String studentheight = scanner.nextLine();

	System.out.println("Weight :");
	String studentweight = scanner.nextLine();

	System.out.println("Address :");
	String studentaddress = scanner.nextLine();

	System.out.println("Emplid :");
	String studentempid = scanner.nextLine();

	System.out.println("Salary :");
	String studentsalary = scanner.nextLine();

	Employee employee = new Employee(String name,String birthdate,double height,double weight,String address,int empid,double salary);
	System.out.println("\n Employee Name :" + employee.name);
	System.out.println("\n Employee Age :" + employee.calculateAge());

	scanner.close();
}

}