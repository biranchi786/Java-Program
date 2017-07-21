import java.io.*;
public class armstrong
{
	public static void main(String args[])throws Exception
	{
		int n,sum=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the nos");
		String s=br.readLine();
		 n=Integer.parseInt(s);
		 int num=n;
		 System.out.println(n);
		while(n>0)
		{
			n=n%10;
			sum=sum+(n*n*n);
			n=n/10;
		}
		if(sum==n)
		{
			System.out.println("armstrong");
		}
			else
			{
			System.out.println("not armstrong");
			}
		
	}
}