class a
{
	
}
class b
{
	static void m1()
	{
	System.out.println("aaa");
	}
}
class c
{
	static void m2()
	{
	System.out.println("bbb");
	}
	public static void  main(String[]args)
	{
	System.out.println("xxx");
	}
}
class d
{
	static void m3()
	{
	System.out.println("ccc");
	}
	public static void main(String[]args)
	{
	System.out.println("bc");
	m3();
	m4();
	}
	static void m4()
	{
	System.out.println("sx");
	}

}
class e
{
	static void m5()
	{
	System.out.println("ddd");
	}
	public static void main(String[]args)
	{
	System.out.println("as");
	m5();
	b.m1();
	c.m2();
	d.m3();
	d.m4();
	d.main(new String[0]);
	e.m5();

	}
}