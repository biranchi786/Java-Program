import java.util.Scanner;
public class power
{
	public static void main(String[]args)
	{
		int num,x,result;
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the number");
		num=ss.nextInt();
		System.out.println("enter power");
		x=ss.nextInt();
		result=rec(num,x);
		System.out.println("power:"+result);
	}
	static int rec(int i,int j)
	{
		int r=1;
		if(i==1)
		{
			return i;
		}
		else
		{
			while(j>0)
			{
				r=r*i;
				j--;
			}
			return r;
		}
	}
}