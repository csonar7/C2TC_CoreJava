package day45;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadFrame5 extends Frame{
	TextField t1,t2;
	Thread th1;
	Thread th2;
	int i,j;
	public ThreadFrame5()
	{
		setLayout(new FlowLayout());
		add(t1=new TextField());
		add(t2=new TextField());
		th1 =new Thread (() -> {
			while(true)
			{
				Thread th=Thread.currentThread();
				if(th.equals(th1)) {
					t1.setText(String.valueOf(i));
					if(i==100)
						i=0;
					else
						i++;
				}
				try {
					Thread.sleep(100);
					
				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		}
		
	);th1.start();
	th2 =new Thread (() -> {
		
		while(true)
		{
			Thread th=Thread.currentThread();
			if(th.equals(th2)) {
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
	
);th2.start();
		addWindowListener(new WindowAdapter() 
	{
		@Override
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});
	
	setSize(40,400);
	setVisible(true);
	};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new ThreadFrame5();
	}

}
