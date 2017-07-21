class d
{
		static void m1()
		{
			System.out.println("static");
		}
		void m2()
		{
			System.out.println("non static");
		}
	public static void main(String[]args)
	{
		m1();
		d d1=new d();
		d1.m2();
	}
}