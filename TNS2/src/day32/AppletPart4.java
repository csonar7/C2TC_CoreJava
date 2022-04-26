package day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//type 4
public class AppletPart4 extends Applet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new Button("click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addActionListener(new ActionListener() {//this is Anonymous method

			public void actionPerformed(ActionEvent e) {
				t.setText("We perform Anonymous Method");
				
			}
			
		});
		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				t.setText("");
			}
			
		});
	}
	
		
}


