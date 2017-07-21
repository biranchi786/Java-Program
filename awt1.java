import java.awt.*;
class awt1
{
	public static void main(String args[])
	{
	Frame f=new Frame("my first program");
	Label l1,l2;
	l1=new Label("first");
	l1.setBounds(50,100,100,30);
	l2=new Label("second");
	l2.setBounds(50,150,100,30);
	f.add(l1);f.add(l2);
	
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	}
	f.addWindowListener(new WindowAdapter(){
	public void WindowClosing(WindowEvent a){
	f.dispose();
	}
	})



	}