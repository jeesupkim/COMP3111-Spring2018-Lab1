package labs.comp3111.ust.hk;

public class Lab1Activity {
	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;

		int min = arr[0];
		int max = arr[0];
		
		for (int i : arr)
		{
			sum += i;
			if (min > i)
				min = i;
			if (max < i)
				max = i;
		}
		
		System.out.println(String.format("Sum of the numbers is %d", sum));
		System.out.println(String.format("Min = %d; Max = %d", min, max));
	}
}
