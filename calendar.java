public class calendar
{
	public static void main(String[] args)
	{
		String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int months[]={0,3,3,6,1,4,6,2,5,0,3,5};
		int day,month,year;
		day=Integer.parseInt(args[0]);
		month=Integer.parseInt(args[1]);
		year=Integer.parseInt(args[2]);

		System.out.println("Date is : "+day+"-"+month+"-"+year);

		int td=year%100;
		if(year>=2000 && year<=2099)
		{
			int calculate=day+months[month-1]+6+td+(td/4);
			System.out.println("Day is : "+days[calculate%7]);
		}
	}
}