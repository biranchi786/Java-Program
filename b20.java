import java.util.Scanner;
public class b20
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter a string");
		String s=ss.nextLine();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String a=sb.toString();
		if(a.equals(s))
	{
		System.out.println(s+"is a pallindrom");
		
		
	}else{
		System.out.println(s+"is not apallindrome");
	}
}
}