package com.appletto.frame;

import java.awt.Button;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame8 extends Frame{
	
		Button b1,b2;
		TextField t; 
		public Frame8() {
			setLayout(new FlowLayout());
			add(b1 = new Button("Click"));
			add(t= new TextField(5));
			add(b2= new Button("Clear"));
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
			setSize(350, 540);
			setVisible(true);
		}
		public boolean action(Event e, Object o) {
			if(e.target.equals(b2))
			 t.setText("Hello");
			if(e.target.equals(b2))
				 t.setText("");
			return true;
			
		}

	public static void main(String[] args) {
		new Frame8();

	}

}
