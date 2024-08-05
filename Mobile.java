import java.util.*;
public class Mobile
{
	static String name;
	String brand;
	int price;
	
	void input()
	{
		System.out.print("enter the name :");
		System.out.print("enetr the brand :");
		System.out.print("enetr the price :");
	}
	
void display()
	{
		System.out.print("\nMobile name " +name);
		System.out.print("\nMobile brand " +brand);
		System.out.print("\nMobile price " +price);
	}
public static void main(String args[])
	{
		Mobile m1 = new Mobile();
		m1.name = "Android";
		m1.brand = "Redmi_note_11";
		m1.price = 18000;

		Mobile m2 = new Mobile();
		m2.name = "Smart";
		m2.brand = "Redmi_note_8";
		m2.price = 20000;

            m1.display();
		m1.name = "Android";
		m2.display();
		m2.name = "Smart";
	}
}