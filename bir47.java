public class bir47
{
	int x=50;
	{
		System.out.println("x:"+x);
	}
	bir47()
	{
		System.out.println("constructer");
	}
	void bir47()
	{
		System.out.println("in method");
	}
	public static void main(String[]args)
	{
		System.out.println("main");
		bir47 d=new bir47();
		d.bir47();
	}
}