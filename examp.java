class c
{
	static void m1()
	{
	//System.out.println("aaa");
	//d.m2();
	cert.main(new String[0]);
	//cert();
	}
}
class d
{
	static void m2()
	{
	System.out.println("bbb");
	//c.m1();
	}
}
class cert
{
	public static void main(String[]args)
	{
	System.out.println("ccc");
	//d.m2();
	c.m1();
	}
}