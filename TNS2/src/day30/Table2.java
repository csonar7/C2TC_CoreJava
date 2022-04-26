package day30;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Table2 extends Applet{
	A p1;
	B p2;
	public void init()
	{
		setLayout(new GridLayout(1,2));
		add(p1=new A());
		add(p2=new B());
		
	}

}
class A extends Panel
{
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	public A() 
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
	}
}
class B extends Panel
{
	TextField t;
	public B()
	{
		add(t=new TextField(20));
	}
}
