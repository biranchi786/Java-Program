class x
{
	public  static  void display()
	{
	System.out.println("i m in base class");
	}
}
class y extends x
{
public static void display()
	{
	System.out.println("i m in child class");
	}
}
public class b3
{
public static void main (String [] args)
	{
	x ab;
	ab=new y();
	ab.display();
	}
}