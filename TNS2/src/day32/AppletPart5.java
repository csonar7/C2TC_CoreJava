package day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
//type 5
//Lamda Expression

public class AppletPart5 extends Applet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addActionListener((ActionEvent e) -> {t.setText("We perform Lamda Expression");});
		b2.addActionListener((ActionEvent e) -> {t.setText(" ");});
}
}
