public class b7
{
	public static void main(String args[])
	{
		sum();
		sum(44,56);
		sum(448,767,5,7,8,9);
	}
	public static void sum(int...a)
	{
		int total=0;
		for(int aa:a)
		{
			total=total+aa;
		}
		System.out.println("the sum is:" +total);	
	}
}