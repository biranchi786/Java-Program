import java.util.scanner;
public class arms
{
	int num,sum=0,no;
	scanner ss=new scanner(System.in);
	int n=ss.nextInt();
	System.out.println("enter the no:");
	int num=n;
	while(num>0)
	{
		no=num%10;
		sum=sum+(no*no*no);
		num=num/10;
	}
	if(n==sum)
	{
		System.out.println("arm");
	}
	else
	{
		System.out.println("not arms");
	}
}