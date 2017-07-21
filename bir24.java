class c
{
	public static void main(String[]args)
	{
	System.out.println("start main");
	try
	{
	m1();
	}
	catch(ArithmeticException ae)
	{
		System.out.println("in catch");
	}
	System.out.println("end main");
	//System.out.println("main end");
	}
	static void m1()
	{
	/*try
	{*/
		System.out.println("start m1()");
		System.out.println(10/0);
		System.out.println("end m1()");
	}
	/*catch(ArithmeticException ae)
	{
	System.out.println("caught");
	}
	}*/
}