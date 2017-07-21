class a
{
	 int x=4;
	int y=5;
}
class b extends a{
	 int x=10;
	int y=11;
}
class ab
{
	public static void main(String[]args)
	{
		a a1=new a();
		b b1=new b();
		System.out.println(a1.x+"..."+a1.y);
		System.out.println(b1.x+"..."+b1.y);
		System.out.println(b.x+"..."+a.x);
		a1.x=30;
		b1.x=40;
		System.out.println(a1.x+"..."+a1.y);
		System.out.println(b1.x+"..."+b1.y);
		System.out.println(b.x+"..."+a.x);
	}

}