import java.util.Scanner;
public class fibo
{
	public static void main(String[]args)
	{
		int a=0,b=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter nos");
		int num=s.nextInt();
		System.out.println("these are fibonacci:");
		System.out.println(a+"\n"+b);
		int x=0;
		while(x<=num)
		{
				x=a+b;
				if(x<=num)
				{
					System.out.println(x);
				}
				a=b;
				b=x;
		}
	}
}