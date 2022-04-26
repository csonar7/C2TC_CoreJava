package frameToappplet;

import java.applet.Applet;
import java.awt.TextField;

public class FrameApplet3 extends Applet{
	TextField t1,t2;
	int i,j;
	public void init() {
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		
		Second s=new Second(this);
		Third t=new Third(this);
		
		s.start();
		t.start();
	}

}
class Second extends Thread
{
	FrameApplet3 f3;
	
	public Second(FrameApplet3 f3)
	{
		this.f3=f3;
	}
	public void run()
	{
		
		
	while(true)
	{
		f3.t1.setText(String.valueOf(f3.i));
		
		if(f3.i==100)
			f3.i =0;
		else
			f3.i++;
		
		try
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{	
		}
	}
	}
	
}
class Third extends Thread
{
	FrameApplet3 f4;
	public Third(FrameApplet3 f4)
	{
		this.f4=f4;
	}
	public void run()
	{
		while(true) {
		f4.t2.setText(String.valueOf(f4.j));
		
		if(f4.j==100)
			f4.j =0;
		else
			f4.j++;
		
		try
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{	
		}
	}
}
}
