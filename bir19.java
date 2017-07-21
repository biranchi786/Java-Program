class exe
{
	public static void main(String[]args)
	{
		try
		{
			System.out.println("outer try block");
			try
			{
				System.out.println("inner try block");
				System.out.println(10/0);
			}
			catch(ArithmeticException nas)
			{
				System.out.println("ArithmeticsExceptionCaaught in inner block");
			}
			System.out.println("inner ends");
		}
		catch(ArithmeticException nas)
		{
			System.out.println("outer Exception");
		}
		System.out.println("outer try blocks ends");
	}
}