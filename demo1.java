public class demo1
{
	public static void main()
	{
		int arr[];
		arr=new int[1];
		arr[0]=56;
		System.out.println(arr[0]);
		call(arr[0]);
		System.out.println(arr[0]);
		
	}
	static void call(int i[])
	{
		i[0]=90;
	}
	}