package day33;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Outerclass extends Applet{
	Button b1,b2;
	static TextField t;
	public void init ()
	{
		add(b1=new Button("click"));
		add(t=new TextField(15));
		add(b2=new Button("clear"));
		b1.addActionListener(new C());//it gave as the run time error called Exception.
		b2.addActionListener(new N());
		
	}

}
class C implements ActionListener
{


	public void actionPerformed(ActionEvent arg0) {
		//Outerclass a=new Outerclass();
		
		Outerclass.t.setText("Hello....!!");
		
	}
	
}
class N implements ActionListener
{

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Outerclass.t.setText("");
		
	}
	
}
