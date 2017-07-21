class d
{
	int a=10;
	int b=20;
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
		int a=30;
		System.out.println(this.a);
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[]args)
	{
		d v=new d();
		v.m1();
	}
}