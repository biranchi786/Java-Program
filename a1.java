public class a1
{
	int a;//instance variable
	public static void main(String args[])
	{
		a1  aa;//reference 
		aa=new a1();
		System.out.println(aa);
		aa.a+=12;
		System.out.println(aa.a);
		a1 ii;
		ii=new a1();
		system.out.println(ii);
		ii.a+=24;
		System.out.println(ii.a);
		Swap(aa,ii);//calling
		System.out.println(aa.a);
		System.out.println(ii.a);
		static void swap(a1 i,a1 j)//defination
		{
			int temp=i.a;
			i.a=j.a;
			j.a=temp;
		}
		
	}
}