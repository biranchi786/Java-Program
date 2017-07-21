public class b13
{
	String name;
	int roll;
	public void setName(String s)
	{
		name=s;
	}
	public void setRoll(int r)
	{
		 roll=r;
	}
	public static void main(String args[])
	{
		b13 dd;
		dd=new b13();
		dd.setName("march");
		dd.setRoll(22);
	System.out.println("name is "+dd.name+"\troll is"+dd.roll);
	/*b13 aa;
	aa=new b13 ();
	aa.setName(" ");
	aa.setRoll();
	System.out.println("name is "+aa.name"\t roll is"+aa.roll);*/
	}
}