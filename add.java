import java.util.Scanner;
class add
   {
	public static void main(String[] args)	
		{
			int a,b,sum;
			Scanner sc = new Scanner(System.in);

			System.out.print("enter first number ");
			
			a = sc.nextInt();
			
                  System.out.print("enter second number ");
			
			b = sc.nextInt();
		sum = a+b;
		System.out.print("addition " +sum);
		}
   }		