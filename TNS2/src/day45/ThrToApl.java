package day45;

import java.applet.Applet;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThrToApl extends Applet implements ActionListener{
	TextField t1,t2;
//	Thread th1,th2;
	int i=1,j=1;
	public void init()
	{
		add( t1=new TextField(15));
		add(t2=new TextField(15));
		//th1=new Thread();
	//	th2=new Thread);
	//	th1.start();
	//	th2.start();
		t1.addActionListener(this);
		t2.addActionListener(new A());
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		while(true)
		{
			Thread th=Thread.currentThread();
			if(th.equals(t1)) {
				t1.setText(String.valueOf(i));
				if(i==100)
					i=0;
				else
					i++;
			}
			try {
				Thread.sleep(100);
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
class A implements ActionListener{
		public A()
		{
			t2.addActionListener(this);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			while(true)
			{
				Thread th = Thread.currentThread();
				if(th.equals(t2))
				{
					t2.setText(String.valueOf(j));
					if(j==100)
						j=0;
					else
						j++;
				}
				try {
					Thread.sleep(100);
					
				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
			
		}
		
	}
	
}
