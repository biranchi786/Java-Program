class v
{
	public static void main(String[]args)
	{
	try{
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=a/b;
	System.out.println("result:"+(a+b));
	}
	catch(ArrayIndexOutOfBoundsException aiob)
	{
		System.out.println("result:"+(4+5));
	}
	catch(NumberFormatException nfe)
	{
		System.out.println("result:"+(6+7));
	}
	catch(ArithmeticException ae)
	{
		System.out.println("result:"+(8+9));
	}
	}
}