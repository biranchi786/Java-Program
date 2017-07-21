class x
	{
	int a;
	}
class b extends x
{
	int a;
	void setdata(int i,int j)
	{
		super.a=i;
		a=j;
	}
	void display()
	{
		System.out.println("super class member is :"+super.a+"child class member is: ");
	}
}
public class superclass
	{
		public static void main(String args[])
		{
			b ab=new ab();
			ab.setdata(10,100);
			ab.display();
		}
	}