import java.util.*;
public class nnum
{
	public static void main(String[]args)
	{
		int num,res,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter nos");
		num=s.nextInt();
		res=count(num);
		System.out.println("number"+res);
	}
	static int count(int a)
	{
		if((a>0)&&(a<=9))
		{
			return 1;

		}
		else
		{
			 int b=return 1+count(a/10);
			System.out.println("ksajdas"+b);
		}

	}
}