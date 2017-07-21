class f
{
	static int a=m1();
	static int m1()
	{
		System.out.println("a ");
			return 10;
	}
	/*static int b=m2();
	static int m2()
	{
		System.out.println("b is created");
		return 20;
	}*/
	public static void main(String[]args)
	{
		System.out.println("main");
		m1();
		System.out.println("a:"+a);
		//int a=50;
		//System.out.println("b:"+b);
		System.out.println(f.a);
		//System.out.println(b);
		//System.out.println(a);	
		//System.out.println(d.b);
	}
}