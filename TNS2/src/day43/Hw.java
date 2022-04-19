package day43;

import java.applet.Applet;
import java.awt.Event;
import java.awt.TextField;

public class Hw extends Applet{
	TextField t1,t2;
	public void init()
	{
		add(t1=new TextField(15));
		add(t2=new TextField(15));
	}
	public boolean action(Event e, Object o)
	{
		return false;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
