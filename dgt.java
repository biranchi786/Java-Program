import java.util.*;
public class dgt
{
	public static void main(String[]args)
	{
		int a,num,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("number");
		num=s.nextInt();
		while(num>0)
		{
			a=num%10;
			sum=sum+a;
			num=num/10;
		}
		System.out.println("result"+sum);
	}
}