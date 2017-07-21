class a
{
	static void m1()
	{
		System.out.println("i m in class a static");
	b.main(new String[0]);
	}
	public static void main(String[]args)
	{
		System.out.println("a main");
		m1();
	}
}
class b
{
	void m2()
	{
		System.out.println("i m non static of b");
	}
	public static void main(String[]args)
	{
		b obj=new b();
		obj.m2();
		//a.main(new String[0]);
	}
}