package day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Inner class //type 2...
public class AppletPart2 extends Applet implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1,b2;
	TextField t;
	public void init() {
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Cancel"));
		b1.addActionListener(this);
		//A a=new A();
		b2.addActionListener(new A());
	}
	public void actionPerformed(ActionEvent e) {
		
		t.setText("Hello...!!");
		
	}
		
		
class A implements ActionListener   //Inner class
	{ 
		public A()
		{
			b2.addActionListener(this);
		}
	
		public void actionPerformed(ActionEvent e) {
				t.setText(" ");
				
			}
		}



}

