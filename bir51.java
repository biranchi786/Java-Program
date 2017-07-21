class a
{
	private a()
	{
		System.out.println("a class no arg");
	}
	 /*a(int x)
	{
		System.out.println("a class  arg");
	}*/
}
class b extends a
{
	/*b()
	{
		System.out.println("b class no arg");
	}*/
	b()
	{
		//super(50);
		System.out.println("b class no arg");
	}
	public static void main(String[]args)
	{
		//b b1=new b();
		b b2=new b();
	}
}