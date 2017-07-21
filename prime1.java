import java.util.Scanner;
public class prime1
{
	public static void main(String[]args)
	{
		int num,a,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter nos");
		num=s.nextInt();
		a=1;
		while(a<=num)
		{
			if((num%a)==0)
			{
				count++;
			}
			a++;
		}
		if(count==2)
		{
			System.out.println(num+"is prime");
		}
		else
		{
			System.out.println(num+"is not");
		}
	}
}