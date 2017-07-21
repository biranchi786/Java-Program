class c
{
	public static void main(String[]args)
	{
		byte[] b={97,98,99};
		char[] ch={'a','b','c','d'};
		String s1="abc";
		String s2=new String(s1);
		String s3=new String("abcd");
		String s4=s3;
		String s5=new String(ch);
		String s6=new String(ch,1,2);
		String s7=new String(b);
		String s8=new String(b,0,1);
		String s9=new String(null);
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println("s5:"+s5);
		System.out.println("s6:"+s6);
		System.out.println("s7:"+s7);
		System.out.println("s8:"+s8);


		
	}
}