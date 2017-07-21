
class a
{
	static void m1()
	{
		System.out.println("static block");
	}
	void m2()
	{
		System.out.println("non static block");
	}
	public static void main(String[]args)
	{
		m1();
		a object=new a();
		object.m2();
	}
}
class b
{
	static void m3()
	{
		System.out.println("i m in b block");
	}
	void m4()
	{
		System.out.println("i m in non static block of b");
	}
	public static void main(String[]args)
	{
		m3();
		a.m1();
		b object1=new b();
		object1.m4();
		//object.m2();
	}
}