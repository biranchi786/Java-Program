public class block1
{
	static int data;
	static 
	{
		data+=10;
		System.out.println(data);
	}
	public static void main(String args[])
	{
		data/=15;
		System.out.println(data);
	}
	static
	{
		data+=40;
		System.out.println(data);
	}
}