import java.util.Scanner;
class Exception_handling
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a , c;
		System.out.println("Enetr value of a :");
		a = sc.nextInt();
		int[] arr = new int[5];
		for(int i=0;i<5;i++)
			{
				arr[i] = sc.nextInt();
			}
		for(int i =0;i<5;i++)
		try
		{	
				c = arr[i] / a;
				System.out.println("Division " +c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}