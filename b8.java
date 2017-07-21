public class b8
{
	public static void main(String args[])
	{
		int arr[];
		arr=new int [1];
		arr[0]=22;
		System.out.println(arr[0]);
		call(arr);
		System.out.println(arr[0]);
		
	}
	static void call(int i[])
	{
		i[0]=99;
	}
}