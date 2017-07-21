import java.util.*;
	class test
	{
		public static void main(String[]args)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter string");
			String str=s.nextLine();
			String result=StringWordsReverse.reversestringwords(str);
			System.out.println("original:"+str);
			System.out.println("new:"+result);
		}
	}

