package day30;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Event;
import java.awt.TextField;



public class Table extends Applet{
	TextField t;
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	
	public void init()
	{
		add(c1=new Checkbox("1"));
		add(c2=new Checkbox("2"));
		add(c3=new Checkbox("3"));
		add(c4=new Checkbox("4"));
		add(c5=new Checkbox("5"));
		add(c6=new Checkbox("6"));
		add(c7=new Checkbox("7"));
		add(c8=new Checkbox("8"));
		add(c9=new Checkbox("9"));
		add(c10=new Checkbox("10"));
		add(t=new TextField(20));
	}
	public boolean action(Event e, Object o)
	{
		int tab;
		if(c1.getState())
		{
			for(int i=1;i<=10;i++)
			{
				tab=i*1;
				// t.StringBuilder.append(String.valueOf(i));
				 
			}
		}
		return false;
	}

	
}
