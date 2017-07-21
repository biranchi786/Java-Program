class demo
{
	static void m1()
	{
		System.out.println("class method");
	}	
	void m2()
	{
		System.out.pritnln("obj method");
	}
}
public class demo1
{
	public static void main(string args[])
	{
		demo.m1();
		new demo.m2();
	}
}