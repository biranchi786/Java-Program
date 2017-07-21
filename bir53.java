class a
{
	int x=22;
	void m1()
	{
		System.out.println(this.x);
		//System.out.println(super.x);
	}
}
class b extends a{
	int x=44;
	void m2()
	{
		System.out.println(this.x);
		System.out.println(super.x);
	}
	public static void main(String[]args)
	{
		b b1=new b();
		b1.m2();
	}
}