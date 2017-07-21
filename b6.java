public class b6
{
	public static void m1(int...a)
	{
		System.out.println(a[0]);
		System.out.println(a.length);
	}
	public static void main (String...a)
	{
		m1();
		m1(44,65);
		m1(33,45,76);
	}
}