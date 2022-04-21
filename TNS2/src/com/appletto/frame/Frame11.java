package com.appletto.frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Event;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame11 extends Frame{
		Panel1 p1;
		Panel2 p2;
		public Frame11() {
			setLayout(new GridLayout(1,2));
			add(p1= new Panel1());
			add(p2= new Panel2());
			p2.c1.setState(true);
			p2.c2.setState(true);
			p2.c3.setState(false);
			p2.t.setText("3000");
			p2.t.setEditable(false);
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
			setSize(400, 600);
			setVisible(true);
			
		}
		public boolean action(Event e, Object o) {
			if(p1.c1.getState())
			{
				p2.c1.setState(true);
				p2.c2.setState(true);
				p2.c3.setState(false);
				p2.t.setText("3000");
			}
			if(p1.c2.getState())
			{
				p2.c1.setState(false);
				p2.c2.setState(true);
				p2.c3.setState(true);
				p2.t.setText("6000");
			}
			if(p1.c3.getState())
			{
				p2.c1.setState(true);
				p2.c2.setState(false);
				p2.c3.setState(true);
				p2.t.setText("9000");
			}
			return true;
		}
		
	}
	class Panel1 extends Panel{
		Checkbox c1,c2,c3;
		CheckboxGroup group;
		public Panel1() {
			setLayout(new GridLayout(3,1));
			group = new CheckboxGroup();
			add(c1 = new Checkbox("Tour 1", group, true));
			add(c2 = new Checkbox("Tour 2", group, false));
			add(c3 = new Checkbox("Tour 3", group, false));
			new Frame11();
			
		}
		
	}
	class Panel2 extends Panel{
		Checkbox c1,c2,c3;
		TextField t;
		public Panel2() {
			setLayout(new GridLayout(4,1));
			add(c1 = new Checkbox("Manali"));
			add(c2 = new Checkbox("Shimla"));
			add(c3 = new Checkbox("Dalhousie"));
			add(t = new TextField(15));
			new Frame11();
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame11();
	}

}
