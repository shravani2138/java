import java.util.*;
public class methods
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		//input string
		String str;
		System.out.println("Enter string:");
		str=sc.nextLine();
		System.out.println("string is:"+str);

		//input integer numbers
		int num1,num2,result;
		System.out.println("Enter 1st number:");
		num1=sc.nextInt();
		System.out.println("Enter 2nd number:");
		num2=sc.nextInt();
		result=num1+num2;
		System.out.println("Addition is:"+result);

		//input float numbers
		float num3,num4,addition;
		System.out.println("Enter 1st number:");
		num3=sc.nextFloat();
		System.out.println("Enter 2nd number:");
		num4=sc.nextFloat();
		addition=num3+num4;
		System.out.println("Addition is:"+addition);

		//input double values
		double d1;
		System.out.println("Enter number:");
		d1=sc.nextDouble();
		System.out.println("Number is:"+d1);

		//input byte value
		byte b1;
		System.out.println("Enter number:");
		b1=sc.nextByte();
		System.out.println("Number is:"+b1);

		
	}
}