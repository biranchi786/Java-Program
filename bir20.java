import java.io.*;
class d
{
	public static void D()
	{
		try
		{
			Bufferedreader br=new Bufferedreader(new InputStreamReader(System.in));
			int a=-1;
			int b=-1;
			while(true)
			{
				try
				{
					System.out.println("enter 1st nos");
					a=Integer.parseInt(br.readline());
					break;
				}
				catch(NumberFormatException nas)
				{
					System.out.println("wrong entry");
				}
			}
			while(true)
			{
				try
				{
					System.out.println("2nd nos");
					b=Integer.parseInt(br.readline());
					try
					{
						int c=a/b;
						System.out.println("result:"+c);
					}
					catch(ArithmeticException ae)
					{
						System.out.println("wrong entry");
						continue;
					}
					break;
				}
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
		}

	}
}public class bir20
{
	public static void main(String[]args)
	{
		d.D();
	}
}