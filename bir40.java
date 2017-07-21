class s
{
	static
	{
		System.out.println("aaa");
		main(new String[0]);
		System.out.println("bbbb");
	}
	public static void main(String[]args)
	{
		System.out.println("main");
	}
	static
	{
		System.out.println("bbb");
	}
}