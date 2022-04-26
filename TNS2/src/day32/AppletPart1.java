package day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//type 1
public class AppletPart1 extends Applet implements ActionListener{
	
	Button b1,b2,b3;
	TextField t;
	public void init()
	{
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b3 =new Button("ready"));
		add(b2 = new Button("Cancel"));
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		
		Object o = e.getSource();
		if(o.equals(b1))
			t.setText("Hello Mam...!");
		if(o.equals(b2))
			t.setText(" ");
		if(o.equals(b3))
			t.setText("Ready...!");
		
	}

}
