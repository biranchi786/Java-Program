class add
{
	int x,y;
	synchronized void add(int x,int y)
	{
		this.x=x;this.y=y;
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		int res=this.x+this.y;
		System.out.println("in:"+Thread.currentThread().getName()+"result:"+res);
	}
}