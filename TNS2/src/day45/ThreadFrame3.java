package day45;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadFrame3 extends Frame
{
	TextField t1, t2;
	int i, j;
	
	public ThreadFrame3()
	{
		setLayout(new FlowLayout());
		
		add(t1 = new TextField(20));
		add(t2 = new TextField(20));
		
		B b = new B(this);
		C c = new C(this);
		
		b.start();
		c.start();
		
		addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new ThreadFrame3();
	}
}
class B extends Thread
{
	ThreadFrame3 th1;
	
	B(ThreadFrame3 th1)
	{
		this.th1 = th1;
	}
	public void run()
	{
		while(true)
		{
			th1.t1.setText(String.valueOf(th1.i));
			
			if(th1.i==100)
				th1.i =0;
			else
				th1.i++;
			
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
class C extends Thread
{
	ThreadFrame3 th2;
	
	C(ThreadFrame3 th2)
	{
		this.th2 = th2;
	}
	public void run()
	{
		while(true)
		{
			th2.t2.setText(String.valueOf(th2.j));
			if(th2.j==100)
				th2.j =0;
			else
				th2.j++;
			
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