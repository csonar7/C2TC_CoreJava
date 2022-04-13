package day36;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Applet2part2 extends Applet{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
	
		
		b1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e)
			{
				t.setText("Hello India");
			}
		});
		b2.addFocusListener(new FocusAdapter() {
			
			@Override
			public void focusGained(FocusEvent e)
			{
				t.setText(" ");
			}
		});
	}

}
