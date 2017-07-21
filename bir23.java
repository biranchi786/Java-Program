class c
{
	public static void main(String[]args){
		System.out.println(m1());
	}
static int m1()
{
	try
	{
		System.out.println("in outer");
		try
		{
			System.out.println("inner");
			System.out.println(10/0);
		}
		catch(NullPointerException npe)
			{
			System.out.println("in catch inner");
			}
			finally
				{
				System.out.println("in inner finally");
				return 30;
				}
			//System.out.println("after inner");
	}
	catch(NullPointerException npe)
		{
		System.out.println("in outer catch"); 
		}
		finally
			{
			System.out.println("in outer finally");
			}
		System.out.println("outer after");
		return 20;
}
}