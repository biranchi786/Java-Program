import java.util.*;
public class fact
{
	public static void main(String[]args)
	{
		int fact=1,num,str;
		Scanner s=new Scanner(System.in);
		System.out.println("enter nos");
		num=s.nextInt();
		str=num;
		while(str>0)
		{
			fact=fact*str;
			str--;
		}
		System.out.println("fact is "+num+" is "+fact);
	}
}