class d
{
	public static void main(String[]args)
	{
		String s1="a";
		String s2="A";
		String s3=new String("a");
		String s4=new String("A");
		//System.out.println(s1==s2);
		//System.out.println(s1.equals(s2));
		//System.out.println(s3==s4);
		//System.out.println(s3.equals(s4));
		//System.out.println(s4.isEmpty());
		//System.out.println(s1.isEmpty());
		//System.out.println(s2.isEmpty());
		//System.out.println(s3.isEmpty());
		//System.out.println(s4.isEmpty());
		//System.out.println(s2.length());
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.compareToIgnoreCase(s4));
	}
}