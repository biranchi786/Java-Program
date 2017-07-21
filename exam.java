class c
{
	static void m1()
	{
	System.out.println("aaaa");
	}
}
class d
{
	static void m2()
	{
	System.out.println("bbb");
	}
	public static void main(String[]args)
	{
	System.out.println("ccc");
	m2();
	c.m1();
	}
}