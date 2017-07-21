class demo
{
	static void m1()
	{
		System.out.println("class method");
	}	
	void m2()
	{
		System.out.println("obj method");
	}
}
 public class demo1()
{
	public static void main(String args[])
	{
		demo.m1();
		new demo().m2();
	}

}