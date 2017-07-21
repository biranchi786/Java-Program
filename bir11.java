class s
{
	public static void main(String[]args)
	{
	System.out.println("aaa");
	}
}
class x
{
	public static void main(String[]args)
	{
	System.out.println("ddd");
	s.main(new String[0]); 
	}
}