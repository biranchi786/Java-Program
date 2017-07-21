class x
{
	static int a;
	static void m1()
	{
		a++;
		x.a++;
		new x().a+=4;
		System.out.println(a);
		
	}
	void m2()
	{
		a++;
		x.a+=5;
		new x().a++;
	}
}
public class b15 extends x
{
	public static void main(String args[])
	{
		x.ab=new x();
		ab.m2();
		ab.a++;
		x.m1();
		x.a=5;
		System.out.println(x.a);
	}
}
