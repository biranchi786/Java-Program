class bir61 implements Runnable
{
	Thread th;
	bir61()
	{
		th=new Thread(this);
		th.setDaemon(true);
		th.start();
	}
	public void run()
	{
		System.out.println("Run:"+th.isDaemon());
		for(int i=0;i<100;i++)
		{
			System.out.println("Run:"+i);
		}
	}
	public static void main(String[]args)
	{
		bir61 bp=new bir61();
		System.out.println("i m inteligent");
		for(int i=0;i<5;i++)
		{
			System.out.println("main:"+i);
		}
	}
}