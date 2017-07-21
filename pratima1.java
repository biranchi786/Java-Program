
class d
{
	public static void m1()
	{
		int a=4;
		System.out.println("a:"+a);
	}
	protected static void m2()
	{
		int b=6;
		System.out.println("b:"+b);
	}
	int c=5;
	private static void m3()
	{
		int e=8;
	System.out.println("e:"+e);
	}
	public static void main(String[]args)
	{
		d e=new d();
		e.m1();
		new d().m2();
		new d().m3();
		//m4();
	}
}