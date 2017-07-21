import java.util.*;
public class arm1
{
	public static void main(String[]args)
	{
		int num,a,b,c,sum,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter range");
		num=s.nextInt();
		a=1;
		while(a<=num)
		{
			sum=0;
			b=a;
			while(b>0)
			{
			c=b%10;
			sum+=(c*c*c);
			num/=10;
		}
		if(sum==a)
		{
			System.out.println(a+"arm");
			count++;
		}
		a++;
			System.out.println("total no of armstrong is"+count);
	}
}
}