package day33;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Outerclass2 extends Applet{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		S s=new S();
		s.takeref(this);
		b1.addActionListener(s);
		b2.addActionListener(new M(this));
		
	}

}
class S implements ActionListener
{
	Outerclass2 a;
	public void takeref(Outerclass2 ap)
	{
		a=ap;/*here we assign a reference variable to other class reference variable by creating a object of this class 
					into other class and call to the takeref method with this keyword */
	}

	public void actionPerformed(ActionEvent e) {
		a.t.setText("Hello...!!");
		
		
	}
	
}
class M implements ActionListener
{
	Outerclass2 c;
	public M(Outerclass2 ap)// by using constructor we refer a variable to the browser...
	{
		this.c=ap;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		c.t.setText("");
		
	}
	
}
