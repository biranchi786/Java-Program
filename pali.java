import java.util.*;
public class pali
{
	public static void main(String[]args)
	{
		int num,sum=0,a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter nos");
		num=s.nextInt();
		a=num;
		while(num>0)
		{
			b=num%10;
			sum=(sum*10)+b;
			num=num/10;
		}
		if(sum==a)
		{
			System.out.println(a+"is a palindrome");
		}else
		{
			System.out.println(a+"is not palindrome");
		}


	}
}