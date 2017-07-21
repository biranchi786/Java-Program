 class setdaemon extends Thread
{
	public static void main(String[]args)
	{
		Thread td=new Thread();
		System.out.println(td);
		Thread td1=new Thread("pratima");
		System.out.println(td1);
		Thread td2=Thread.currentThread();
		System.out.println(td2);
		td2.setPriority(7);
		Thread td3=new Thread();
		System.out.println(td3);
		setdaemon sd=new setdaemon();
		sd.setDaemon(true);
		sd.start();
	}
}