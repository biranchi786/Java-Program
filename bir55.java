class a
{
	a()
	{
		this(10);
		System.out.println("no arg");
	}
	a(int a)
	{
		this("abc");
		System.out.println("args int");
	}
	a(String str)
	{
		System.out.println("string args");
	}
	public static void main(String[]args)
	{
		a a1=new a();
		a a2=new a2(10);
		a a3=new a3("abc");
	}

}