class a
{
	static int x=8;
	int s=78;
	{
		System.out.println("i m in 1st non static");
	}
	static 
	{
		System.out.println("i m in 1st block");
	}
	public static void main(String[]args)
	{
		//int y=34;
		System.out.println("i m in main");
		a a1=new a1();
	}
	static
	{
		System.out.println("i m in 2nd block");
	}
}