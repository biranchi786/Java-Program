import java.util.*;
public class swap
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter first");
		int first=s.nextInt();
		Scanner ss=new Scanner(System.in);
		System.out.println("enter second");
		int second=ss.nextInt();
		System.out.println("before swap 1st"+first+"before swap 2nd"+second);
		first=first+second;
		second=first-second;
		first=first-second;
		System.out.println("after swap 1st"+first+"after swap 2nd"+second);
	}
}