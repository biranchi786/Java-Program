import java.io.*;
class b
{
	public static void main(String[]args)throws FileNotFoundException,IoException
	{
		FileReader fr=new FileReader("abc.txt");
		int data;
		while(data=fr.read()!=-1)
		{
			System.out.println(data+"....");
		System.out.println((char)data);
		}
	}
}