import java.util.Scanner;
public class arm
{
	public static void main(String args[])
	{
		int sum=0,n1;
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		System.out.println(n);
		int num=n;
		int count=0;
		while(num>0)
		{
			n1=num%10;
			sum=sum+(n1*n1*n1);
			num=num/10;
			count++;
		}
		System.out.println(count);
		if(n==sum)
		{
			System.out.println("hii");
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstromg");
		}
	}
}