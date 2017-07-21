import java.util.Scanner;
public class prime
{
	public static void main(String[]args)
	{
		int num,a,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter intiger");
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
			}else
			{
				System.out.println(num+"is not prime");
			}
		}

	}