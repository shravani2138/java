public class evenodd{
	public static void main(String[] args){
		scanner reader = new scanner(System.in);
		System.out.print("enetr a number");
		int num = reader.nexINT();
		
		if(num%2==0)
			System.out.println(num + "even");
		else
			System.out.println(num + "odd");
		}
}