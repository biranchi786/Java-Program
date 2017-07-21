class d
{
	int a=1;
	int b=2;
	/*d()
	{
		int a=70;
		int b=50;
		System.out.println(a+"..."+b);
	}*/
	d(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+".."+b);

	}
	public static void main(String[]args)
	{
		
		d c=new d(5,6);
		d c1=new d(5,6);
		d c2=new d(5,9);
	}
}