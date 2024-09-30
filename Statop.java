package MyMath;

public class Statop
{
	public double min(double[] arr)
	{
		double min = arr[0];
		for(double num : arr)
		{
			if(num < min)
			{
				min = num;
			}
		}
	return min;
	}

      public double max(double [] arr)
	{
		double max = arr[0];
		for(double num : arr)
		{
			if(num > max)
			{
				max = num;
			}
		}
	return max;
	}

      public double count(double [] arr)
	{
		return arr.length;
	}

	public double sum(double [] arr)
	{
		double sum = 0;
		for(double num : arr)
		{
			sum+ = num;
		}
	return sum;
	}

      public double average(double [] arr)
	{
		return sum(arr)/count(arr);
	}
}