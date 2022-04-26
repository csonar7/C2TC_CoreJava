// main class & one inner class

package day45;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadFrame2 extends Frame implements Runnable
{	
	TextField t1,t2;
	Thread th1;
	int i,j;
	
	public ThreadFrame2()
	{
		setLayout(new FlowLayout());
		add( t1=new TextField(15));
		add(t2=new TextField(15));
		
		th1=new Thread(this);
		A a =new A();
		
		th1.start();
		a.start();
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setSize(200,400);
		setVisible(true);
	}
	@Override
	public void run()
	{
		while(true)
		{
				t1.setText(String.valueOf(i));
				if(i==100)
					i=0;
				else
					i++;
			
			
			try {
				Thread.sleep(10);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadFrame2();
	}
	class A extends Thread
	{
		public void run()
		{
			while(true)
			{
					t2.setText(String.valueOf(j));
					if(j==100)
						j=0;
					else
						j++;
				
				
				try {
					Thread.sleep(10);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}	
		}
	}
}
