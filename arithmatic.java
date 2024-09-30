import java.util.Scanner;
class arithmatic
   {
	public static void main(String[] args)	
		{
			int s1,s2, sum, sub, mul, div;
			Scanner sc = new Scanner(System.in);

			System.out.print("enter s1 number ");
			
			s1 = sc.nextInt();
			
                  System.out.print("enter s2 number ");
			
			s2 = sc.nextInt();
		sum = s1+s2;
		System.out.println("addition " +sum);
		sub = s1-s2;
		System.out.println("subtraction " +sub);
		mul = s1*s2;
		System.out.println("multiplication " + mul);
		div = s1/s2;
		System.out.println("division" + div);
		}
   }		
   