class biranchi
{
	 //int x=10;
	static int a= m1();
	static
	{
		System.out.println("a class static");
		//System.out.println("x:"+x);
	}
	int x=m2();
	{
		System.out.println("a class non static block");
	}
	/*public static void main(String[]args)
	{
		System.out.println("a class main");
	}*/
	biranchi()
	{
		System.out.println("a constructer");
	}
	static int m1()
	{
		System.out.println("a class static variable");
		return 10;
	}
	int m2()
	{
		System.out.println("a class non static variable");
		return 20;
	}
	void abc()
	{
		System.out.println("biranchi abc");
	}
	void bbc()
	{
		System.out.println("biranchi bbc");
	}
}
class pratima extends biranchi
{

	 //int x=10;
	static int b= m3();
	static
	{
		System.out.println("pratima class static");
		//System.out.println("x:"+x);
	}
	int y=m4();
	{
		System.out.println("pratima class non static block");
	}
	/*public static void main(String[]args)
	{
		System.out.println("a class main");
	}*/
	pratima()
	{
		System.out.println("pratima constructer");
	}
	static int m3()
	{
		System.out.println("pratima class static variable");
		return 30;
	}
	int m4()
	{
		System.out.println("pratima class non static variable");
		return 40;
	}
	void abc()
	{
		System.out.println("pratima abc");
	}
	void bbc()
	{
		System.out.println("pratima bbc");
	}
	public static void main(String[]args)
	{
		System.out.println("pratiima man");
		pratima p1=new pratima();
		p1.abc();
		p1.bbc();
	}
}