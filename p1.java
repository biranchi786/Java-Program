public class data
{
	int a;
	public static void main(String args[])
	{
		data aa;
		aa=new data();
		System.out.println(aa.a);
		aa.a+=12;
		System.out.println(aa.a);
		
		data ii;
		ii=new data();
		System.out.println(ii.a);
		ii.a+=24;
		System.out.println(ii.a);
		swap(aa,ii);
		System.out.println(aa.a);
		System.out.println(ii.a);
	}
	static void swap(data i,data j)
	{
		int temp=i.a;
		i.a=j.a;
		j.a=temp;
	}
}