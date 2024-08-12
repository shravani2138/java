import java.util.Scanner;
interface client 
{
	void input();
	void output();
}
class abc implements client
{
	String name;
	String address;
	double salary;

public void input()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name :");
	name = sc.nextLine();
	System.out.println("Enter the add :");
	address = sc.nextLine();
	System.out.println("Enter the salary :");
	salary = sc.nextDouble();
}
public void output()
{
	System.out.println("name :" +name);
	System.out.println("address :" +address);
	System.out.println("salary :" +salary);
}
}
class interface_test {
	public static void main(String args[])
	{
		client c =  new abc();
		c.input();
		c.output();
	}
}