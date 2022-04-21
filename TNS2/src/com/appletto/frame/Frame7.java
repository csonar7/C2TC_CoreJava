package com.appletto.frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame7 extends Frame {
		Button b ;  //declaration area
		TextField t;
		
		public Frame7() {
			setLayout(new FlowLayout());
			b = new Button();
			t = new TextField(15);
			//b.setLabel("Submit");
			add(b);
			add(t);
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
			setSize(50, 100);
			setVisible(true);
		
	
	}


	public static void main(String[] args) {
		new Frame7();

	}

}
