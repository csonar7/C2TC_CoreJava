package com.appletto.frame;

import java.awt.Checkbox;
import java.awt.Event;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame10 extends Frame{
		Checkbox c1,c2,c3,c4;
		TextField  t;
		
		public Frame10() {
			setLayout(new GridLayout(5,1));
			add(c1= new Checkbox("1"));
			add(c2= new Checkbox("2"));
			add(c3= new Checkbox("3"));
			add(c4= new Checkbox("4"));
			add(t = new TextField(15));
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
			int sum = 0;
			if(c1.getState())
				sum= sum+1;
			if(c2.getState())
				sum= sum+2;
			if(c3.getState())
				sum= sum+3;
			if(c4.getState())
				sum= sum+4;
			t.setText(String.valueOf(sum));
			
			return true;
		}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame10();
	}

}
