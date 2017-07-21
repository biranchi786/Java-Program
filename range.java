import java.util.Scanner;
public class range
{
	public static void main(String[]args)
	{
		int rng,num=1,a,b,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter range");
		rng=s.nextInt();
		while(num<=rng)
		{
			a=1;
			b=0;
			while(a<=num)
			{
			if((num%a)==0)
			{
				b++;
			}
			a++;
		}
		if(b==2)
		{
			count++;
			System.out.println(num+"is a prime");
		}
		num++;
	}
	System.out.println("total no of prime:"+count);
	}
}
