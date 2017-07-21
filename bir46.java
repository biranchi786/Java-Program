class d
{
	int x=10;
	int y=20;
	void m1(int a,int b)
	{
		x=a;
		y=b;
	}
	void  m2(int x,int y)
	{
		x=x;
		y=y;
	}
	void m3(int x,int y)
	{
		x=this.x;
		y=this.y;
	}
	public static void main(String[]args)
	{
		d v=new d();
		System.out.println(v.x+"..."+v.y);
		v.m1(30,40);
		System.out.println(v.x+"..."+v.y);
		v.m2(50,60);
		System.out.println(v.x+"..."+v.y);
		v.m3(70,80);
		System.out.println(v.x+"..."+v.y);
	}
}